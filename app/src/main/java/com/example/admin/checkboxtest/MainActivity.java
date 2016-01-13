package com.example.admin.checkboxtest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkState(View view)

    {
        CheckBox checkbox = (CheckBox) findViewById(R.id.main_checkbox);
        String finalstate;

        if (checkbox.isChecked())

        {
            finalstate="true";

        }
        else
        {
            finalstate="false";

        }

        Context context = getApplicationContext();
        CharSequence text = (CharSequence) finalstate;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        toast.show();

    }

}
