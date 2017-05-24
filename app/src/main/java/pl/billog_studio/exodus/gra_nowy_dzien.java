package pl.billog_studio.exodus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gra_nowy_dzien extends AppCompatActivity {
    public void onBackPressed()
    {

        //thats it
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gra_nowy_dzien);
        final Button button2 = (Button)findViewById(R.id.button_to_shop);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(gra_nowy_dzien.this, gra_shop.class);
                startActivity(intent);
                finish();
            }

        });
        final Button button3 = (Button)findViewById(R.id.button_to_port);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(gra_nowy_dzien.this, gra_port.class);
                startActivity(intent);
                finish();
            }

        });
    }
}
