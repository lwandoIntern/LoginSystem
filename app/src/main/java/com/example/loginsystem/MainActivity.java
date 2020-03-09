package com.example.loginsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private class PerformNetworkRequest extends AsyncTask<Void,Void,String>{

        String url;
        HashMap<String, String> params;
        int requestCode;

        PerformNetworkRequest(String url, HashMap<String, String> params, int requestCode){
            this.url = url;
            this.params = params;
            this.requestCode = requestCode;
        }

        @Override
        protected void onPreExecute(){
            super.onPreExecute();

        }

        @Override
        protected void onPostExecute(String s){
            super.onPostExecute(s);
        }
        @Override
        protected String doInBackground(Void... voids) {
            return null;
        }
    }
}


