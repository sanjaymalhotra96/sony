package com.example.sonyliv;

import android.content.Context;
import android.content.Intent;

public class MyMethod {

    public static void home(Context context){
        Intent i = new Intent(context, MainActivity.class);
        context.startActivity(i);
    }

}
