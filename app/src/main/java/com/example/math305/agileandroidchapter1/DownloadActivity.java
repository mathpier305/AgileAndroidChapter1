package com.example.math305.agileandroidchapter1;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import java.io.IOException;

/**
 * Created by math305 on 6/8/2017.
 */

public class DownloadActivity extends Activity{
    private static final String TAG = "DownloadActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private class DownloadTask extends AsyncTask<String, Void, String> {

        DownloadUrl htmlStr = new DownloadUrl();



        @Override
        protected String doInBackground(String... urls) {
            try {
                return htmlStr.loadFromNetwork(urls[0]);
            } catch (IOException e) {
                return getString(R.string.connection_error);
            }
        }

        /**
         * Uses the logging framework to display the output of the fetch
         * operation in the log fragment.
         */
        @Override
        protected void onPostExecute(String result) {
            Log.i(TAG, result);
        }
    }

}
