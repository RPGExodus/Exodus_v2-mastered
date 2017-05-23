package pl.billog_studio.exodus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gra_4 extends AppCompatActivity {
    public void onBackPressed()
    {

        //thats it
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gra_4);
        final Button button = (Button)findViewById(R.id.statek_button_powrot);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                finish();


            }
        });
    }
}
