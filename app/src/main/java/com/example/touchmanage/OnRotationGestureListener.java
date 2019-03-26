package com.example.touchmanage;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public  class OnRotationGestureListener extends  LinearLayout {
    private float mAngle;



    public OnRotationGestureListener(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }





    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        final int action = ev.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                TextView my_button1 = findViewById(R.id.my_button_1);
                my_button1.setText("yes, I'm Intrepted");
                return false;
            case MotionEvent.ACTION_UP:
                TextView my_button2 = findViewById(R.id.my_button_2);
                my_button2.setText("yes, I'm Intrepted");
                return false;
            case MotionEvent.ACTION_MOVE:
                TextView my_button3 = findViewById(R.id.my_button_3);
                my_button3.setText("yes, I'm Intrepted");
                return false;
            case MotionEvent.ACTION_POINTER_DOWN:
                TextView my_button4 = findViewById(R.id.my_button_4);
                my_button4.setText("yes, I'm Intrepted");
                return false;
        }
        return false;
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("TAG", "You down layout");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("TAG", "You up layout");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("TAG", "You move layout");
        }
        return true;
    }



}