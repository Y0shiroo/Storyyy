package com.example.storyp2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class page1 extends AppCompatActivity {
    TextView Character;
    String pangalan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        Character = findViewById(R.id.Character);
        Intent i = getIntent();
        pangalan = i.getStringExtra("pangalan");
        Character.setText(pangalan+" "+"Rocks!") ;
    }
    public void gotopage2 (View view){
        Intent i = new Intent(this, page2.class);
        i.putExtra("pangalan",pangalan);
        startActivity(i);
        finish();
    }
    int j = 1;
    public void onBackPressed() {
        super.onBackPressed();
        if (j == 1) {
            j++;
            Toast.makeText(this, "App closed", Toast.LENGTH_SHORT).show();
        } else {
            finish();
        }
    }
}
