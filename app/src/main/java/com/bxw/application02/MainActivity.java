package com.bxw.application02;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goURL(View view)
    {
        EditText editurl = (EditText) this.findViewById(R.id.edit_url);
        String url = editurl.getText().toString();
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

}
