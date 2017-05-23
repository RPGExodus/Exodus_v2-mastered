package pl.billog_studio.exodus;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Main_Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        this.setContentView(R.layout.activity_main__menu);
        final Button button = (Button)findViewById(R.id.button_nowa_gra); //Button od nowej gry
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Main_Menu.this, Gra.class);
                startActivity(intent);
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
