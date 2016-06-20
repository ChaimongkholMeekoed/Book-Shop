package com.neu.chaimongkhol.bookshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    //Expliscit ประกาศตัวแปล
    private EditText nameEditText, UserEditText, PasswordEditText;
    private String nameSting, UserSting,PasswordSting;
    private String
    final String urLPHP = "http://swiftcodingthai.com/neu/add_user_master.php";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget
        nameEditText = (EditText) findViewById(R.id.editText);
        UserEditText = (EditText) findViewById(R.id.editText2);
        PasswordEditText = (EditText) findViewById(R.id.editText3);

    }   // Main Method

    public void clickSignUpSign(View view) {

        nameSting = nameEditText.getText().toString().trim();
        UserSting = UserEditText.getText().toString().trim();
        PasswordSting = PasswordEditText.getText().toString().trim();

        //Chek Space
        if (nameSting.equals("") || UserSting.equals("") || PasswordSting.equals("")) {
            //Have Space
            MyAlearn myAlearn = new MyAlearn();
            myAlearn.myDialog(this,"มีช่องว่าง","กรุณากรอกทุกช่อง ค่ะ");

        } else {
            //No Space
            uploadToServer();

        }


    }   //clickSign

    private void uploadToServer() {

    }



}      // Mais Calss
