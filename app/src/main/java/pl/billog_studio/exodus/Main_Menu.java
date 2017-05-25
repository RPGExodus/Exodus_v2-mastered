package pl.billog_studio.exodus;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import Gra.*;

public class Main_Menu extends AppCompatActivity {
    public void onBackPressed()
    {

        //thats it
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        System.out.println(Arrays.toString(getFilesDir().listFiles()));
        Wszystko.zapis=new File(getApplicationContext().getFilesDir(),"save");
        Wszystko.questy=new File(getApplicationContext().getFilesDir(),"quests");
        Wszystko.lok=new File(getApplicationContext().getFilesDir(),"location");

        try {
            Scanner sc=new Scanner(Wszystko.zapis);
            while(sc.hasNext()){
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.setContentView(R.layout.activity_main__menu);
        final Button button = (Button)findViewById(R.id.button_nowa_gra); //Button od nowej gry
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main_Menu.this, Gra.class);
                startActivity(intent);
                Wszystko.player=new Player();
                Wszystko.lokacja=Gra.class.getName();
//                Wszystko.player.założone[0]=Itemss.ZardzewiałyMiecz;
//                Itemss.ZardzewiałyMiecz.ilość++;
//                Wszystko.player.założone[1]=Itemss.SpruchniałyLuk;
//                Itemss.SpruchniałyLuk.ilość++;
//                Wszystko.player.założone[2]=Itemss.StareUbranie;
//                Itemss.StareUbranie.ilość++;
//                Wszystko.player.założone[3]=Itemss.MissingNO;
//                Itemss.MissingNO.ilość++;
                try {
                    Wszystko.saveTheGame();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                finish();
            }
        });
        final Button button2 = (Button)findViewById(R.id.button_wczytaj_gre); //Button od wczytaj gre
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main_Menu.this, wczytaj_gre.class);
                startActivity(intent);
                finish();
            }
        });
        final Button button3 = (Button)findViewById(R.id.button_ustawienia); //Button od ustawien
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main_Menu.this, Ustawienia.class);
                startActivity(intent);
                finish();
            }
        });
        final Button button4 = (Button)findViewById(R.id.button_credits); //Button od creditsow
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main_Menu.this, Autorzy.class);
                startActivity(intent);
                finish();
            }
        });
    }


}
