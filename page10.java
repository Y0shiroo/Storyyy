package com.example.storyp2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page10 extends AppCompatActivity {
    TextView Character;
    String pangalan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page10);
        Character = findViewById(R.id.Character);
        Intent i = getIntent();
        pangalan = getIntent().getStringExtra("pangalan");
        Character.setText("She flew " +pangalan+ " home, of course.");
    }
    public void gotopage9 (View view) {
        Intent i = new Intent(this, page9.class);
        i.putExtra("pangalan",pangalan);
        startActivity(i);
        finish();
    }
    public void gotoMainActivity (View view) {
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("pangalan",pangalan);
        startActivity(i);
        finish();
    }
}
