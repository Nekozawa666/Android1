package android1.android1_1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class Hello extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        String instanceState;
        if (savedInstanceState == null) {
            instanceState = "Первый запуск!";
        } else {
            instanceState = "Повторный запуск";
        }
        Log.d("Maine Activity","OnCreate");
        Toast.makeText(getApplicationContext(), instanceState + getString(R.string.onCreate1), Toast.LENGTH_SHORT).show();
        }
        @Override
    protected void onStart(){
        super.onStart();
        Log.d("Maine Activity", "OnStart");
            Toast.makeText(getApplicationContext(), R.string.onStart, Toast.LENGTH_SHORT).show();
        }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Maine Activity", "saveInstanceState");
        Toast.makeText(getApplicationContext(), R.string.onRestoreInstanceState, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Maine Activity", "OnResume");
        Toast.makeText(getApplicationContext(), R.string.onResume, Toast.LENGTH_SHORT).show();
        }
        @Override
    protected void onPause(){
        super.onPause();
            Log.d("Maine Activity", "OnPause");
            Toast.makeText(getApplicationContext(), R.string.onPause, Toast.LENGTH_SHORT).show();
        }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Maine Activity", "onSaveInstanceState");
        Toast.makeText(getApplicationContext(), R.string.onSaveInstanceState, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Maine Activity", "OnStop");
        Toast.makeText(getApplicationContext(), R.string.onStop, Toast.LENGTH_SHORT).show();
        }
        @Override
    protected void onDestroy(){
        super.onDestroy();
            Log.d("Maine Activity", "OnDestroy");
            Toast.makeText(getApplicationContext(), R.string.onDestroy, Toast.LENGTH_SHORT).show();
        }

}