package pl.billog_studio.exodus;

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
        TextView txv= new TextView(this);
        txv.setText(String.valueOf(Wszystko.player.getGold()));
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
                }
            });
            lin.addView(btn);
        }



    }
}
