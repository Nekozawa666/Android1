package android1.android1_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LifeCircle extends AppCompatActivity {
    private static final String COUNTER_KEY="Counter Key";
    private int increment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        final TextView textView=findViewById(R.id.planet);
        final Button button=findViewById(R.id.button1);

        textView.setText("Inc"+increment);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increment++;
                textView.setText("Inc"+increment);
            }
        });
        }
       @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        increment=savedInstanceState.getInt(COUNTER_KEY);

    }

        @Override
    protected void onSaveInstanceState(Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
            saveInstanceState.putInt(COUNTER_KEY, increment);
    }

}