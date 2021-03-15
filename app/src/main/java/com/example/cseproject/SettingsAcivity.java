package com.example.cseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import de.hdodenhof.circleimageview.CircleImageView;

public class SettingsAcivity extends AppCompatActivity {
    private Button UpdateAccountSetting;
    private EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_acivity);
        Initializefields();
    }
    private void Initializefields(){
        UpdateAccountSetting=(Button) findViewById(R.id.update_setting_button);
        userName=(EditText) findViewById(R.id.set_user_name);
    }
}