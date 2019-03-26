package com.example.touchmanage;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public  class MainActivity extends AppCompatActivity {

    boolean mIsScrolling = false;
    private OnRotationGestureListener rotation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rotation = (OnRotationGestureListener)findViewById(R.id.tagLayout);


    }


}


       // OnRotationGestureListener rotation = (OnRotationGestureListener) findViewById(R.id.tagLayout);

//        TextView myButton_1 = findViewById(R.id.my_button_1);
//        String   text1 = (String) OnRotationGestureListener.viewIntreptionDown1();
//        myButton_1.setText(text1);
//        myButton_1.setText(" ");
//
//
//        TextView myButton_2 = findViewById(R.id.my_button_2);
//        String   text2 = (String) OnRotationGestureListener.viewIntreptionDown1();
//        myButton_2.setText(text2);
//        myButton_2.setText(" ");
//
//        TextView myButton_3 = findViewById(R.id.my_button_3);
//        String   text3 = (String) OnRotationGestureListener.viewIntreptionDown1();
//        myButton_3.setText(text3);
//        myButton_3.setText(" ");
//
//
//        TextView myButton_4 = findViewById(R.id.my_button_4);
//        String   text4 = (String) OnRotationGestureListener.viewIntreptionDown1();
//        myButton_4.setText(text4);
//        myButton_4.setText(" ");
//
//    }
//
//
//
//
//
//
//        @Override
//        public boolean onTouchEvent(MotionEvent ev) {
//            // Here we actually handle the touch event (e.g. if the action is ACTION_MOVE,
//            // scroll this container).
//            // This method will only be called if the touch event was intercepted in
//            // onInterceptTouchEvent
//           // myButton_1.setText("dsfdsfssf");
//
//            return true;
//        }
//
//
//
//    @Override
//    public void onPointerCaptureChanged(boolean hasCapture) {
//
//    }
//
//    @Override
//    public void onFocusChange(View v, boolean hasFocus) {
//
//    }
//}
//
//
//
////
//////        listView=(ListView)findViewById(R.id.listView);
//////        textView=(TextView)findViewById(R.id.textView);
//////        listItem = getResources().getStringArray(R.array.array_technology);
//////        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//////                android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
//////        listView.setAdapter(adapter);
//////
//////        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//////            @Override
//////            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//////                // TODO Auto-generated method stub
//////                String value=adapter.getItem(position);
//////                Toast.makeText(getApplicationContext(),value, Toast.LENGTH_SHORT).show();
//////                listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
//////
//////            }
//////        });
////
////
////
////
////
////    }
////
////
////        @Override
////        public void onClick (View view)
////        {
////            switch (view.getId()) {
////                case R.id.my_button_1:
////                    myLayout_1.setVisibility(View.VISIBLE);
////
////                    // Do something
////                case R.id.my_button_2:
////                    myLayout_1.setVisibility(View.VISIBLE);
////
////                case R.id.my_button_3:
////                    myLayout_1.setVisibility(View.VISIBLE);
////
////                case R.id.my_button_4:
////                    myLayout_1.setVisibility(View.VISIBLE);
////
////
////
////            }
////        }
//


