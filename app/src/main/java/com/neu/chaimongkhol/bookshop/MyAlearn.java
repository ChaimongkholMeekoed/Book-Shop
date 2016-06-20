package com.neu.chaimongkhol.bookshop;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.preference.DialogPreference;

/**
 * Created by iMac_20 on 6/20/2016 AD.
 */
public class MyAlearn {

    public void  myDialog(Context context,
                          String strTitle,
                          String strMessage){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.nobita48);
        builder.setTitle(strTitle);
        builder.setMessage(strMessage);
       builder.setPositiveButton("จร้า", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {
               dialogInterface.dismiss();
           }
       }) ;

        builder.show();



    }

}   // Main Class
