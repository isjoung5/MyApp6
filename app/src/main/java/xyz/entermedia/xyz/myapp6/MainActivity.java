package xyz.entermedia.xyz.myapp6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener {

    private EditText editText;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);




        Button button2 = (Button) findViewById(R.id.button2) ;
        button2.setOnClickListener(this) ;
        Button button3 = (Button) findViewById(R.id.button3) ;
        button3.setOnClickListener(this) ;
        Button button4 = (Button) findViewById(R.id.button4) ;
        button4.setOnClickListener(this) ;
        Button button5 = (Button) findViewById(R.id.button5) ;
        button5.setOnClickListener(this) ;
        Button button6 = (Button) findViewById(R.id.button6) ;
        button6.setOnClickListener(this) ;

        editText.setText("manager");
        editText2.setText("netkara");

        Button button = (Button) findViewById(R.id.button) ;
        //button.setOnClickListener(this) ;
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText1 = (EditText)findViewById(R.id.editText);

                editText1.setText("Test");
            }
        });
    }

    private final long	FINSH_INTERVAL_TIME    = 2000;
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

    @Override
    public void onClick(View view) {

    }
}