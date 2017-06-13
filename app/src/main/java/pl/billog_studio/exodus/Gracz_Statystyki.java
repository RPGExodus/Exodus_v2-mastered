package pl.billog_studio.exodus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import Gra.*;

import org.w3c.dom.Text;

public class Gracz_Statystyki extends AppCompatActivity {

    TextView staty;
    TextView eq;
    TextView umie;
    Button powrót;
    private TextView debuffy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gracz__statystyki);
        staty = (TextView) findViewById(R.id.StatystykiPlayera);
        debuffy= (TextView) findViewById(R.id.Debuffy);
        ustawDebuffy();
        eq=(TextView) findViewById(R.id.EqwipunekPlayera);
        umie = (TextView) findViewById(R.id.UmiejetnościPlayera);
        powrót = (Button) findViewById(R.id.button_statystyki_wyjdz);
        LinearLayout rel = (LinearLayout) findViewById(R.id.relative_bottony);
        staty.setText(Wszystko.player.getStatystyki());
        eq.setText("Założone przedmioty: "+Wszystko.player.getZałożone());

        for (int i=0; i<Wszystko.player.getEquipmnent().length;i++) {
            if (Wszystko.player.getEquipmnent()[i] == Itemss.MissingNO || Wszystko.player.getEquipmnent()[i] == null)
                continue;
            final int x=i;
            final Button btn = new Button(this);

            btn.setText(Wszystko.player.getEquipmnent()[i].dane());
            btn.setOnClickListener(new Button.OnClickListener()
            {

                @Override
                public void onClick(View view) {
                    Wszystko.player.załóż(x);
                    startActivity(getIntent());
                    finish();
                }
            });
            rel.addView(btn);
            umie.setText(Wszystko.player.getAbilities());
        }
        powrót.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void ustawDebuffy() {
        String text="";
        if(Wszystko.player.debuff_glod()!=0){
            text+=String.format("Jesteś głodny -> Minus %3d%n",Wszystko.player.debuff_glod()*100);
        }
        if(Wszystko.player.debuff_sen()!=0){
            text+=String.format("Jesteś śpiący -> Minus %3d%n",Wszystko.player.debuff_sen()*100);
        }
        if(!text.isEmpty()) debuffy.setText(text);
    }

}
