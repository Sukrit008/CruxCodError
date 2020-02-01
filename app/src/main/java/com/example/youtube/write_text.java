package com.example.youtube;


import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;


public class write_text extends Activity {

    EditText inputCode;
    TextView compileTxt;
    AlertDialog.Builder builder;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_text);// Bhenchod MaderChod Laoudu Gaandu
        inputCode =  (EditText) findViewById(R.id.inputCode);
        compileTxt = (TextView) findViewById(R.id.compileTxt);
        compileTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ftechedCode = String.valueOf(inputCode.getText());
                if(ftechedCode.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Seems that you havn't entered any code yet!",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Compiled Seccessfully :)",Toast.LENGTH_SHORT).show();// mtlb ruk video bhejta ek (answer:ok)

                }


            }
        });
    }
}