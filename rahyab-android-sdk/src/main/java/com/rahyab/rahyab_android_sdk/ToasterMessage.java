package com.rahyab.rahyab_android_sdk;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {
    public static void s(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}
