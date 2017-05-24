package pl.billog_studio.exodus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gra_atak_1_d extends AppCompatActivity {
    public void onBackPressed()
    {

        //thats it
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gra_atak_1_d);
       final Button button11 = (Button)findViewById(R.id.gra_atak_3x_dalej);
        button11.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
              Intent intent = new Intent(gra_atak_1_d.this, gra_atak_1_2_d.class);
              startActivity(intent);
               finish();
           }
       });
        final Button button2 = (Button)findViewById(R.id.gra_atak_3b_dalej);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(gra_atak_1_d.this, gra_atak_kobieta_b.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
