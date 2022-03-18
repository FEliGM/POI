package com.example.mychat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void reg(View view) {
       //public void onResponse{}
       //String username=((EditText) findViewById(R.id.username)).getText().toString();

       /*String url="";//lo usamos para conectar a la base de datos (phpMyAsmin por ejemplo)
        RequestQueue requestQueue= Volley.newRequestQueue(getApplicationContext());
        StringRequest stringRequest=new StringRequest(Request.Method.POST,url,new Response.Listener<String>(){
          @Override
          public void onResponse(String response) {
             TextView msg=findViewById(R.id.msg);
             msg.setText(response);
          }
        }, new Response.ErrorListener() {
             @Override
             public void onErrorResponse(VolleyError error) {
             }
        }){
             @Override
             protected Map<String, String> getParams() throws AuthFailureError {
               Map<String, String> params=new HashMap<>();
               params.put("username",username);
               return params;
             }
        */
    }
}