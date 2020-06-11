package com.example.logutil;

import android.util.Log;

public class LogDebug {
    private static final String TAG = "MY_MODULE";

    public static void debugPrinter(String message){
        Log.d(TAG, message);
    }
}
