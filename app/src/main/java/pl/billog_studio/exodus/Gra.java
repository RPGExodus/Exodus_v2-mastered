package pl.billog_studio.exodus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gra extends AppCompatActivity {
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gra);

        final Button button = (Button)findViewById(R.id.statek_button_1_a);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button.setVisibility(View.INVISIBLE);
                count++;

                if (count==2)
                {
                    Intent intent6= new Intent(Gra.this, gra_atak.class);
                    startActivity(intent6);
                    finish();
                }
                Intent intent = new Intent(Gra.this, Gra_1.class);
                startActivity(intent);
            }
        });
        final Button button2 = (Button)findViewById(R.id.statek_button_1_b);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button2.setVisibility(View.INVISIBLE);
                count++;

                if (count==2)
                {
                    Intent intent6= new Intent(Gra.this, gra_atak.class);
                    startActivity(intent6);
                    finish();
                }
                Intent intent2 = new Intent(Gra.this, Gra_2.class);
                startActivity(intent2);

            }
        });
        final Button button3 = (Button)findViewById(R.id.statek_button_1_c);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button3.setVisibility(View.INVISIBLE);
                count++;

                if (count==2)
                {
                    Intent intent6= new Intent(Gra.this, gra_atak.class);
                    startActivity(intent6);
                    finish();
                }
                Intent intent3 = new Intent(Gra.this, Gra_3.class);
                startActivity(intent3);
            }
        });

    }
}
