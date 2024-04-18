package com.example.branchiohexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import io.branch.referral.Branch;

public class DeepLinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deep_link);

        Branch.sessionBuilder(this).withCallback((params, error) -> {
            if (error != null) {
                Log.e("BranchSDK_Tester", "branch init failed. Caused by -" + error.getMessage());
            } else {
                Log.i("BranchSDK_Tester", "params " + params);
            }
        }).withData(this.getIntent().getData()).init();
    }
}