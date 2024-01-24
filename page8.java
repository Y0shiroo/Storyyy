package com.example.storyp2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page8 extends AppCompatActivity {
    TextView Character;
    String pangalan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page8);
        Character = findViewById(R.id.Character);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("pangalan");
        Character.setText("Even before " +pangalan);
    }
    public void gotopage7 (View view) {
        Intent i = new Intent(this, page7.class);
        i.putExtra("pangalan",pangalan);
        startActivity(i);
        finish();
    }
    public void gotopage9 (View view) {
        Intent i = new Intent(this, page9.class);
        i.putExtra("pangalan",pangalan);
        startActivity(i);
        finish();
    }
}
