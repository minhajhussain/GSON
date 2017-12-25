package com.example.minhaj.gson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person minhaj= new Person("minhaj" ," 001");
        Person harris= new Person("harris" , "002");

        Gson gson=new Gson();

        String datatoSend=gson.toJson(minhaj);
        String datatoSend1=gson.toJson(harris);

        Intent intent=new Intent(this,Main2Activity.class);
        intent.putExtra("rice",datatoSend);
        intent.putExtra("rice1",datatoSend1);
        startActivity(intent);
    }
}
