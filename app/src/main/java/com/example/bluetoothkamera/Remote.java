package com.example.bluetoothkamera;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.nio.charset.Charset;

public class Remote extends AppCompatActivity {
Button remoteButton;
    BluetoothConnectionService mBluetoothConnection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remote);

      Button backButton=findViewById(R.id.back_button);
      backButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              finish();
          }
      });

        mBluetoothConnection = new BluetoothConnectionService(getApplicationContext());
        remoteButton=findViewById(R.id.remote_button);
        remoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction("sendPhoto");
                sendBroadcast(intent);

            }
        });
    }

}
