package com.example.mychat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChatsActivity extends AppCompatActivity {
Bundle Sender;
Bundle Receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chats);

        //test
        Sender=new Bundle();
        Sender.putInt("id",1);
        Sender.putString("username","Hanna");
        Receiver.putInt("id",2);
        Receiver.putString("username","Anna");

        TextView username=findViewById(R.id.username);
        username.setText(Receiver.getString("username"));


//        animacion de online
//        val online_ = findViewById(R.id.online_)
//        online_.startAnimation(AnimationUtils.loadAnimation(this, R.anim.show_hide))

        fillRecycler();
    }
    private void fillRecycler(){

    }
    public void sendMessage(View view) {
    }
}