package pl.billog_studio.exodus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import Gra.*;

public class gra_shop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gra_shop);
        LinearLayout lin=(LinearLayout) findViewById(R.id.STATEK_HADLARZ_LINEAR);
        for(final Itemss it: Handlarz.STATEK_HANDLARZ.itemy){
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
