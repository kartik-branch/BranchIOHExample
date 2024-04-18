package com.example.branchiohexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONObject;

import io.branch.referral.Branch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSONObject b = Branch.getInstance().getLatestReferringParamsSync();
        Log.d("BranchSDK_Tester " , "data " + b.toString());
    }
}