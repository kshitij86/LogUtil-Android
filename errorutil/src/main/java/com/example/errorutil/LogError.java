package com.example.errorutil;

import android.util.Log;

public class LogError {
    private static final String TAG = "MY_MODULE";

    public static void errorPrinter(String TAG, String message){
        Log.e(TAG, message);
    }
}
