package com.example.storyp2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page9 extends AppCompatActivity {
    TextView Character;
    String pangalan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page9);
        Character = findViewById(R.id.Character);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("pangalan");
        Character.setText(pangalan+ " in wool and, on the");
    }
    public void gotopage8 (View view) {
        Intent i = getIntent();
        Intent in = new Intent(this, page8.class);
        i.putExtras(i);
        startActivity(in);
        finish();
    }
    public void gotopage10 (View view) {
        Intent i = new Intent(this, page10.class);
        i.putExtra("pangalan",pangalan);
        startActivity(i);
        finish();
    }
}
