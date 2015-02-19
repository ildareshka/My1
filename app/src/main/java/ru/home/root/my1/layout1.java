package ru.home.root.my1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class layout1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
    }
    public void btnBack(View view){
        finish();
    }

}
