package com.example.storyp2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page7 extends AppCompatActivity {
    TextView Character;
    String pangalan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page7);
        Character = findViewById(R.id.Character);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("pangalan");
        Character.setText(pangalan+ " yelled,");
    }
    public void gotopage6 (View view) {
        Intent i = new Intent(this, page6.class);
        i.putExtra("pangalan",pangalan);
        startActivity(i);
        finish();
    }
    public void gotopage8 (View view) {
        Intent i = new Intent(this, page8.class);
        i.putExtra("pangalan",pangalan);
        startActivity(i);
        finish();
    }
}
