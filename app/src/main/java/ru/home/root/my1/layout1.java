package ru.home.root.my1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class layout1 extends Activity {
    private TextView txt1;
    private TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);

        txt1=(TextView)findViewById(R.id.textView2);
        txt2=(TextView)findViewById(R.id.textView3);
        txt1.setText(getIntent().getStringExtra("editText1"));
        //txt2.setText(getIntent().getStringExtra("editText2")+"-"+getIntent().getStringExtra("editText3"));
    }
    public void btnBack(View view){
        finish();
    }

}
