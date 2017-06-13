package pl.billog_studio.exodus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

import Gra.*;

public class gra_port extends AppCompatActivity {
    public void onBackPressed()
    {

        //thats it
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gra_port);
        Wszystko.lokacja=this.getClass().getName();
        try {
            Wszystko.saveTheGame();
        } catch (IOException e) {
            e.printStackTrace();
        }
        final Button button2 = (Button)findViewById(R.id.button3);
        button2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(gra_port.this, Gracz_Statystyki.class);
                startActivity(intent);
    }});
        final Button button3 = (Button)findViewById(R.id.button_to_pest_ogloszenia);
        button3.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(gra_port.this,pest_goloszenia.class);
                startActivity(intent);
                finish();
            }});
}}
