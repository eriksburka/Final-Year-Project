package com.example.user.serverstuff;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;

/**
 * 1.SEND DATA FROM EDITTEXT OVER THE NETWORK
 * 2.DO IT IN BACKGROUND THREAD
 * 3.READ RESPONSE FROM A SERVER
 */
public class Sender extends AsyncTask<Void,Void,String> {

    Context c;
    String urlAddress;
    String nameTxt,posTxt,teamTxt;
    String name,pos,team;

    /*
            1.OUR CONSTRUCTOR
    2.RECEIVE CONTEXT,URL ADDRESS AND EDITTEXTS FROM OUR MAINACTIVITY
    */
    public Sender(Context c, String urlAddress,String...strings) {
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

            System.out.println("-----------------------------------------------------------------");
            System.out.println(response);
            System.out.println("-----------------------------------------------------------------");


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
                //GET EXACT RESPONSE
                BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
                StringBuffer response=new StringBuffer();

                String line;

                //READ LINE BY LINE
                while ((line=br.readLine()) != null)
                {
                    response.append(line);
                }

                //RELEASE RES
                br.close();

                return response.toString();

            }else
            {

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}