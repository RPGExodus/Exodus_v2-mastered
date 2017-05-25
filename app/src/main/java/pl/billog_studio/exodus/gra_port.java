package pl.billog_studio.exodus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;

import Gra.*;

public class gra_port extends AppCompatActivity {

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
    }
}
