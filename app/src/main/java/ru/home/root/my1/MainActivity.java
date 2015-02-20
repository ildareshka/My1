package ru.home.root.my1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    private TextView txtView;
    private Button btn2;
    private EditText txt1;
    private EditText txt2;
    private EditText txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        txtView=(TextView)findViewById(R.id.textView);
        txt1=(EditText)findViewById(R.id.editText);
        //txt2=(EditText)findViewById(R.id.editText2);
        //txt2=(EditText)findViewById(R.id.editText3);

        btn2=(Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                txtView.setText("ололо");
            }
        });
    }

    public void btn1click(View view)    {
        txtView.setText("салют");
    }
    public void goAct(View view)
    {
        Intent int1=new Intent(this,layout1.class);
        int1.putExtra("editText1",txt1.getText().toString());
        //int1.putExtra("editText2",txt2.getText());
        //int1.putExtra("editText3",txt3.getText());

        startActivity(int1);
    }
}
