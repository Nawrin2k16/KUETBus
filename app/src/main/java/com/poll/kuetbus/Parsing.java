package com.poll.kuetbus;

import android.os.AsyncTask;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Timer;

public class Parsing extends AsyncTask<Void, Void, Void> {

    String data = "";
    String apiTitle;
    JSONObject values;

    @Override
    protected void onPreExecute() {
        super.onPreExecute();


    }

    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL("https://script.googleusercontent.com/macros/echo?user_content_key=Fqy1UmOpxmQ_oN8pHBg5JBpBQ-ps6PH4tKfB2mjH8-XZzEzjtMZFgCW-Ta8rdoDb3NvD3CO-Vlc4nSG9D9tjHeiEemc-2tGEOJmA1Yb3SEsKFZqtv3DaNYcMrmhZHmUMWojr9NvTBuBLhyHCd5hHa1rO6vMGUKV9-bU0-7fvOdSkVNfOvm7oNAU9-yNqYa5M9jAjagPXBNLqTltqHU5IQw8Vdzep58axmoaIHkF2ABQlQdp8DJixPF4e0qBcCoOit6p2Pb7bESUtIyH-a6HJzz3q-zHsIzg5Hc_6ZJj7ljFpwQr5eBjkKGcV3EdEh5Y0&lib=MeRHtBj1FCHOrk7QgO_aaFlqR9hX156uw");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line = "";
            while (line!=null){
                line = bufferedReader.readLine();
                data = data + line;
            }

            JSONObject jsonObject = new JSONObject(data);
            apiTitle = jsonObject.getString("apiTitle");
            values = jsonObject.getJSONObject("values");


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        try {
            JSONArray morning  = values.getJSONArray(ScheduleActivity.string);
            for (int i=0; i<morning.length(); i++){
                JSONObject index = morning.getJSONObject(i);


                String name = index.getString("index3");
                String time = index.getString("index1");
                if(i==1){
                    ScheduleActivity.textView1.setText(name);
                    ScheduleActivity.time1.setText(time);
                } else if (i==2){
                    ScheduleActivity.textView2.setText(name);
                    ScheduleActivity.time2.setText(time);
                } else if (i==3){
                    ScheduleActivity.textView3.setText(name);
                    ScheduleActivity.time3.setText(time);
                } else if (i==4){
                    ScheduleActivity.textView4.setText(name);
                    ScheduleActivity.time4.setText(time);
                } else if (i==5){
                    ScheduleActivity.textView5.setText(name);
                    ScheduleActivity.time5.setText(time);
                } else if (i==6){
                    ScheduleActivity.textView6.setText(name);
                    ScheduleActivity.time6.setText(time);
                } else if (i==7){
                    ScheduleActivity.textView7.setText(name);
                    ScheduleActivity.time7.setText(time);
                }

                ScheduleActivity.textView0.setText("Route");
                ScheduleActivity.time0.setText("Starting Time");


            }



        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
