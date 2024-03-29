package com.uit.myairquality;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

public class LoadingAlert {
    private Activity activity;
    private AlertDialog dialog;
    LoadingAlert(LogIn myActivity){
        activity = myActivity;
    }
    LoadingAlert(Register myActivity){
        activity = myActivity;
    }

    void startAlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.activity_loading, null));
        builder.setCancelable(true);

        dialog = builder.create();
        dialog.show();
    }
    void closeAlertDialog(){
        dialog.dismiss();
    }
}