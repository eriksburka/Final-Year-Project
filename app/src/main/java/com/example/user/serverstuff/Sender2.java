package com.example.user.serverstuff;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * 1.SEND DATA FROM EDITTEXT OVER THE NETWORK
 * 2.DO IT IN BACKGROUND THREAD
 * 3.READ RESPONSE FROM A SERVER
 */
public class Sender2 extends AsyncTask<Void,Void,String> {

    Context c;
    String urlAddress;
    String nameTxt,posTxt,teamTxt;
    String name,pos,team;
    private InputStream inputStream = null;
    private String [] data= null;

    private static ArrayList<String> sqlQueryList = new ArrayList<>();
    private static String query = "";

    private static String testing;
    JSONObject jsonObject;

    /*
            1.OUR CONSTRUCTOR
    2.RECEIVE CONTEXT,URL ADDRESS AND EDITTEXTS FROM OUR MAINACTIVITY
    */
    public Sender2(Context c, String urlAddress,String...strings) {
        this.c = c;
        this.urlAddress = urlAddress;

        //INPUT EDITTEXTS
        this.nameTxt=strings[0];
        this.posTxt=strings[1];
        this.teamTxt=strings[2];

        //GET TEXTS FROM EDITEXTS
        name=nameTxt;
        pos=posTxt;
        team=teamTxt;

    }

    /*
    1.WHERE WE SEND DATA TO NETWORK
    2.RETURNS FOR US A STRING
     */
    @Override
    protected String doInBackground(Void... params) {
        return this.send();
    }

    /*
  1. CALLED WHEN JOB IS OVER
  2. WE DISMISS OUR PD
  3.RECEIVE A STRING FROM DOINBACKGROUND
   */
    @Override
    protected void onPostExecute(String response) {
        super.onPostExecute(response);

        if(response != null)
        {
            //SUCCESS
            Toast.makeText(c,response,Toast.LENGTH_LONG).show();

            ProfileActivity p = new ProfileActivity();
            p.setResult(response);

        }else
        {
            //NO SUCCESS
            Toast.makeText(c,"Unsuccessful "+response,Toast.LENGTH_LONG).show();
        }
    }

    /*
    SEND DATA OVER THE NETWORK
    RECEIVE AND RETURN A RESPONSE
     */
    private String send()
    {
        //CONNECT
        HttpURLConnection con=Connector.connect(urlAddress);
        if(con==null)
        {
            return null;
        }
        try
        {
            OutputStream os=con.getOutputStream();
            //WRITE
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));
            bw.write(new DataPackager(name,pos,team).packData());

            bw.flush();

            //RELEASE RES
            bw.close();
            os.close();

            //HAS IT BEEN SUCCESSFUL?
            int responseCode=con.getResponseCode();
            if(responseCode==con.HTTP_OK)
            {
                try {
                    //URL url = new URL(address);
                    try {
//                        HttpURLConnection con =(HttpURLConnection) url.openConnection();
                        con.setRequestMethod("GET");
                        inputStream = new BufferedInputStream(con.getInputStream());

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                try{

                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    testing = bufferedReader.readLine();
                    System.out.print("--------------------Result-------------------------\n");
                    System.out.print(testing+ "\n");
                    //System.out.print(result+ "\n");

                    if(testing.equals("<br />")){
                        sqlQueryList.add("empty");
                    }

//            if(testing == null) {
//                System.out.print("Null\n");
//            }else{
//
//                System.out.print("Should Work\n");
//                System.out.print(testing + "\n");
//            }
                    inputStream.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

                try{
                    JSONArray jsonArray = new JSONArray(testing);
                    // ProfileActivity p = new ProfileActivity();
                    data = new String[jsonArray.length()];

                        for (int i = 0; i < jsonArray.length(); i++) {

                            jsonObject = jsonArray.getJSONObject(i);
                            data[i] = jsonObject.getString("Electoral_District");
                            sqlQueryList.add(data[i]);
                        }

                }catch(Exception e){
                    e.printStackTrace();
                }
            }else
            {

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return "";
    }

    public ArrayList<String> getsqlQueryList2(){
        return this.sqlQueryList;
    }

    public void setSqlQueryList(ArrayList<String> list){
        this.sqlQueryList = list;
    }

}