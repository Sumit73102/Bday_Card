package com.example.bdaycard;



import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;



public class MainActivity extends AppCompatActivity {



    // Creating reference to the editText of the MainActivity

    EditText receiver, sender, message;



    // Creating reference to the Button present in the XML file

    Button cardButton;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        retrieveData(); // Calling retrieveDate function

    }



    // A function to retrieve data from the XML file

    private void retrieveData() {

        receiver = findViewById(R.id.receiver_edittext);

        sender = findViewById(R.id.sender_edittext);

        message = findViewById(R.id.message_edittext);



        cardButton = findViewById(R.id.make_card_button);



        cardButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                String receiverName = receiver.getText().toString();

                String senderName = sender.getText().toString();

                String messageText = message.getText().toString();



                Intent intent = new Intent(MainActivity.this,CardActivity.class);

                intent.putExtra("receiverName",receiverName);

                intent.putExtra("senderName",senderName);

                intent.putExtra("message",messageText);



                startActivity(intent);



            }

        });

    }

}