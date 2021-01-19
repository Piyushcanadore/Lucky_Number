package com.krishna.lucky_number.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import com.krishna.lucky_number.Information;
import com.krishna.lucky_number.R;


public class Profile_Activity extends AppCompatActivity {

    public AppCompatTextView textViewName;
    public AppCompatTextView textViewEmail;
    public AppCompatTextView textViewB_date;
    public AppCompatTextView textViewPassword;
    public AppCompatTextView textViewLuckyNumber;
    public AppCompatTextView textViewinfo;
    LinearLayout infolayout;
    public AppCompatButton appCompatButtoninfo;

    int id_To_Update = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_);

        textViewName = (AppCompatTextView) findViewById(R.id.textViewName);
        textViewEmail = (AppCompatTextView) findViewById(R.id.textViewEmail);
        textViewB_date = (AppCompatTextView) findViewById(R.id.textViewbdate);
        textViewLuckyNumber = (AppCompatTextView) findViewById(R.id.textViewLuckyNumber);
        textViewinfo = (AppCompatTextView) findViewById(R.id.textViewinfo);
        textViewPassword = (AppCompatTextView) findViewById(R.id.textViewPassword);
        infolayout = (LinearLayout) findViewById(R.id.infolayout);

        appCompatButtoninfo = (AppCompatButton) findViewById(R.id.appCompatButtoninfo);


        String nameFromIntent = getIntent().getStringExtra("NAME");
        String emailFromIntent = getIntent().getStringExtra("EMAIL");
        String bdateFromIntent = getIntent().getStringExtra("BIRTHDATE");
        String luckyFromIntent = getIntent().getStringExtra("LUCKYNUMBER");
        textViewName.setText(nameFromIntent);
        textViewEmail.setText(emailFromIntent);
        textViewB_date.setText(bdateFromIntent);
        textViewLuckyNumber.setText(luckyFromIntent);


        appCompatButtoninfo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent accountsIntent = new Intent(Profile_Activity.this, Information.class);
                startActivity(accountsIntent);
            }
        });

        // Information textview

        if (luckyFromIntent != "") {
            infolayout.setVisibility(View.VISIBLE);

            if (luckyFromIntent.equalsIgnoreCase("1")) {
                textViewinfo.setText(Html.fromHtml(getString(R.string.info_1)));
            } else if (luckyFromIntent.equalsIgnoreCase("2")) {
                textViewinfo.setText(Html.fromHtml(getString(R.string.info_2)));
            } else if (luckyFromIntent.equalsIgnoreCase("3")) {
                textViewinfo.setText(Html.fromHtml(getString(R.string.info_3)));
            } else if (luckyFromIntent.equalsIgnoreCase("4")) {
                textViewinfo.setText(Html.fromHtml(getString(R.string.info_4)));
            } else if (luckyFromIntent.equalsIgnoreCase("5")) {
                textViewinfo.setText(Html.fromHtml(getString(R.string.info_5)));
            } else if (luckyFromIntent.equalsIgnoreCase("6")) {
                textViewinfo.setText(Html.fromHtml(getString(R.string.info_6)));
            } else if (luckyFromIntent.equalsIgnoreCase("7")) {
                textViewinfo.setText(Html.fromHtml(getString(R.string.info_7)));
            } else if (luckyFromIntent.equalsIgnoreCase("8")) {
                textViewinfo.setText(Html.fromHtml(getString(R.string.info_8)));
            } else if (luckyFromIntent.equalsIgnoreCase("9")) {
                textViewinfo.setText(Html.fromHtml(getString(R.string.info_9)));
            }

        }


    }
}