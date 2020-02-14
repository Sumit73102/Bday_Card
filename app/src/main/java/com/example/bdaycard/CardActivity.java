package com.example.bdaycard;



import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;

import android.os.Bundle;

import android.widget.Button;

import android.widget.TextView;



public class CardActivity extends AppCompatActivity {



    TextView receiver,sender,message;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_card);



        Intent intent=getIntent();



        String receiverName=intent.getStringExtra("receiverName");

        String senderName=intent.getStringExtra("senderName");

        String messageText=intent.getStringExtra("message");



        receiver=findViewById(R.id.receiver);

        sender=findViewById(R.id.sender);

        message=findViewById(R.id.messageText);



        receiver.setText(receiverName);

        sender.setText(senderName);

        message.setText(messageText);



        // Implement the feature to go back after clicking BACK Button.

        // Remember to add finish() after starting the intent to open MainActivity.



    }

}