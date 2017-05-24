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
    LinearLayout lin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gra_shop);
        // Handlarz.STATEK.HANDLARZ
        sprzedajnaKurwa=(Handlarz)getIntent().getExtras().get("Handlarz");
        lin=(LinearLayout) findViewById(R.id.STATEK_HADLARZ_LINEAR);
    }
    public void kup(){
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
                    onResume();
                }
            });
            lin.addView(btn);
        }
    }
    public void sprzedaj(){
        final TextView txv_2= new TextView(this);
        txv_2.setTextSize(18);
        txv_2.setText("Twoje itemy");
        lin.addView(txv_2);
        for(final Itemss it:Wszystko.player.getEquipmnent()){
            if(it == Itemss.MissingNO)
                continue;
            final Button btn=new Button(this);
            btn.setText(it.dane());
            btn.setOnClickListener(new Button.OnClickListener(){

                @Override
                public void onClick(View view) {
                    it.sell();
                    onResume();
                }
            });
            lin.addView(btn);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        kup();
        final Button wyjdz = (Button)findViewById(R.id.STATEK_HANDLARZ_POWRÓT);
        wyjdz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }

        });
        sprzedaj();
    }
}
