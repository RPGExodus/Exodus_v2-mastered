package pl.billog_studio.exodus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gra_atak_kobieta_b extends AppCompatActivity {
    public void onBackPressed()
    {

        //thats it
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gra_atak_kobieta_b);
        final Button button = (Button)findViewById(R.id.gra_atak_kobieta_b_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(gra_atak_kobieta_b.this, gra_atak_kobieta.class);
                startActivity(intent);
            }
        });
    }
}
