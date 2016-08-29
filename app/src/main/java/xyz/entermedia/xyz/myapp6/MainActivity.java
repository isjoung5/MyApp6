package xyz.entermedia.xyz.myapp6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private final long	FINSH_INTERVAL_TIME    = 1000;
    private long		backPressedTime        = 0;

    @Override
    public void onBackPressed() {

        long tempTime        = System.currentTimeMillis();
        long intervalTime    = tempTime - backPressedTime;

        if ( 0 <= intervalTime && FINSH_INTERVAL_TIME >= intervalTime ) {
            //super.onBackPressed();
            moveTaskToBack(true);
            finish();
        } else {
            backPressedTime = tempTime;
            Toast.makeText(getApplicationContext(),R.string.msg_004,Toast.LENGTH_SHORT).show();
        }
    }
}