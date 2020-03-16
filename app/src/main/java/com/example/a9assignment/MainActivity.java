package com.example.a9assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    GestureDetector gestureDetector;
    int vari;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    public class MyGesture extends GestureDetector.SimpleOnGestureListener{
        @Override
        public boolean onDoubleTap(MotionEvent e) {

            linearLayout = findViewById(R.id.layout1);
            if(vari == Color.rgb(0,0,0)){
                linearLayout.setBackgroundColor(Color.WHITE);
            }
            else{
                linearLayout.setBackgroundColor(Color.BLACK);
            }
            return super.onDoubleTap(e);
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            linearLayout = findViewById(R.id.layout1);
            //Velocityt toastiin
            linearLayout.setBackgroundColor(Color.rgb(123,0,0));
            return super.onFling(e1, e2, velocityX, velocityY);


        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gestureDetector = new GestureDetector(this,new MyGesture());


    }
}
