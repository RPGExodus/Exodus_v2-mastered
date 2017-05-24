package pl.billog_studio.exodus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import Gra.*;

public class gra_shop extends AppCompatActivity {

    Handlarz sprzedajnaKurwa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gra_shop);
        // Handlarz.STATEK.HANDLARZ
        sprzedajnaKurwa=(Handlarz)getIntent().getExtras().get("Handlarz");
        LinearLayout lin=(LinearLayout) findViewById(R.id.STATEK_HADLARZ_LINEAR);
        final TextView txv= new TextView(this);
        txv.setTextSize(18);
        txv.setText("Twoje fundusze: "+String.valueOf(Wszystko.player.getGold()));
        lin.addView(txv);
        for(final Itemss it: sprzedajnaKurwa.itemy){
            Button btn=new Button(this);
            String txt="";
            txt+=it.nazwa+"\n"+it.opis+"\n"+"Cena: "+it.cena;
            btn.setText(txt);
            btn.setOnClickListener(new Button.OnClickListener(){

                @Override
                public void onClick(View view) {
                    it.purchase();
                    txv.setText("Twoje fundusze: "+String.valueOf(Wszystko.player.getGold()));
                }
            });
            lin.addView(btn);
        }
        final Button wyjdz = (Button)findViewById(R.id.STATEK_HANDLARZ_POWRÓT);
        wyjdz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }

        });


    }
}
