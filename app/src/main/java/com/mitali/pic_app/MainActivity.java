package com.mitali.pic_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    
    public void change(View view){
        ImageView iv= findViewById(R.id.imageView);
        iv.setImageResource(R.drawable.img_2);
        //iv.setImageResource(R.drawable.img);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}