package com.example.storrry;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText MainCharacter;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainCharacter = findViewById(R.id.MainCharacter);
    }
    public void gotopageone (View view){
        name = MainCharacter.getText().toString();
        Intent i = new Intent(this, pageone.class);
        i.putExtra("name",name);
        startActivity(i);
        finish();
    }
}
