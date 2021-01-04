package com.example.lenovo.doctorapp.Controller;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lenovo.doctorapp.Controller.ClerkActivity;
import com.example.lenovo.doctorapp.R;
import com.example.lenovo.doctorapp.dbutil.Manager;

public class ClerkLogin extends AppCompatActivity  {
    Manager im;
    SQLiteDatabase sb;
    EditText txtname,txtpass;
    String name,pass;
    SharedPreferences sp;

TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clerk_login);
        im = new Manager(this);
        sb = im.openDb();

        txtname=(EditText)findViewById(R.id.txtname);
        txtpass=(EditText)findViewById(R.id.txtpass);
        txt=(TextView)findViewById(R.id.txt);

    }

    public void onClick(View v)
    {
        String nm=txtname.getText().toString();
        String ps=txtpass.getText().toString();
        name=sp.getString("name","");
        pass=sp.getString("pass","");

        if (nm.equalsIgnoreCase("Swa")&&ps.equalsIgnoreCase("1234"))
        {
            Intent i=new Intent(getApplicationContext(), ClerkActivity.class);
            startActivity(i);
            //tts.speak("welcome ", TextToSpeech.QUEUE_FLUSH,null,null);
        }
        else
        {
            //txterror.setText("Invalid UserId/Password");
            //tts.speak("incorrect I D or password. Please Re enter",TextToSpeech.QUEUE_FLUSH,null,null);
        }

    }

}
