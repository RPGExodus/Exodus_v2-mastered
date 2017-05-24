package pl.billog_studio.exodus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import Gra.*;

import org.w3c.dom.Text;

public class Gracz_Statystyki extends AppCompatActivity {

    TextView staty;
    TextView eq;
    TextView umie;
    Button powrót;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gracz__statystyki);
        staty=(TextView) findViewById(R.id.StatystykiPlayera);
        eq=(TextView) findViewById(R.id.EqwipunekPlayera);
        umie=(TextView) findViewById(R.id.UmiejetnościPlayera);
        powrót=(Button) findViewById(R.id.button_statystyki_wyjdz);

        staty.setText(Wszystko.player.getStatystyki());
        eq.setText(Wszystko.player.getItems());
        umie.setText(Wszystko.player.getAbilities());


        powrót.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}
