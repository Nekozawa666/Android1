package android1.android1_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LifeCircle extends AppCompatActivity {
    private static final String COUNTER_KEY="CounterKey";
    public static final String EXTRA_TEXT="ExtraText";
    public static final int REQUEST_CODE = 13;
    private TextView textView;
    private int increment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        textView = findViewById(R.id.planet);
        final Button button=findViewById(R.id.button1);

        textView.setText(R.string.tweet);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent=new Intent(LifeCircle.this,SecondActivity.class);

                intent.putExtra(EXTRA_TEXT,"New day");
                startActivity(intent);*/
                // Start activity for result
                Intent intent=new Intent(LifeCircle.this,SecondActivity.class);

                intent.putExtra(EXTRA_TEXT,"New day");
                startActivityForResult(intent, REQUEST_CODE);

            }
        });
        }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if((requestCode==REQUEST_CODE)&&(resultCode== Activity.RESULT_OK)){
            textView.setText(data.getStringExtra(SecondActivity.EXTRA_TEXT_RESULT));
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        increment=savedInstanceState.getInt(COUNTER_KEY);
        textView.setText("inc"+increment);

    }

        @Override
    protected void onSaveInstanceState(Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
            saveInstanceState.putInt(COUNTER_KEY, increment);
    }

}