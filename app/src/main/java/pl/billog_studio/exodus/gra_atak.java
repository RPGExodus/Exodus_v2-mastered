package pl.billog_studio.exodus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gra_atak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gra_atak);
        final Button button = (Button)findViewById(R.id.gra_atak_1_a);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(gra_atak.this, gra_atak_1_a.class);
                startActivity(intent);
            }
        });
        final Button button2 = (Button)findViewById(R.id.gra_atak_1_b);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(gra_atak.this, gra_atak_1_b.class);
                startActivity(intent);
            }
        });
        final Button button3 = (Button)findViewById(R.id.gra_atak_1_c);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(gra_atak.this, gra_atak_1_c.class);
                startActivity(intent);
            }
        });
        final Button button4 = (Button)findViewById(R.id.gra_atak_1_d);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(gra_atak.this, gra_atak_1_d.class);
                startActivity(intent);
            }
        });

    }
}
