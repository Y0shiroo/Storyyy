package com.example.storyp2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText MainCharacter;
    String pangalan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainCharacter = findViewById(R.id.MainCharacter);
    }
    public void gotopage1 (View view){
        pangalan = MainCharacter.getText().toString();
        Toast.makeText(this, "Main Character set as: "+pangalan+"!", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, page1.class);
        i.putExtra("pangalan",pangalan);
        startActivity(i);
        finish();
    }
}
