package com.example.belajar1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private int data=10;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);

    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();

    }

    public void countUp(View view) {
        mCount++;
        if (mCount==data){
            Toast count = Toast.makeText(this, "Data = "+data+"",Toast.LENGTH_SHORT);
            count.show();
        }
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void reset(View view) {
        mCount=0;
        data=10;
        Toast reset = Toast.makeText(this, "Data berhasil direset",Toast.LENGTH_SHORT);
        reset.show();
        if (mShowCount!=null){
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}
