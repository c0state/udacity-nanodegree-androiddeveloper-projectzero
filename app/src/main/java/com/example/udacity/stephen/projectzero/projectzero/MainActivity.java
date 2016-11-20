package com.example.udacity.stephen.projectzero.projectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void showAppLaunchToast(CharSequence displayText) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, displayText, duration);
        toast.show();
    }

    public void openPopularMovies(View view) {
        showAppLaunchToast("This button will launch the 'Popular Movies' App");
    }

    public void openStockHawk(View view) {
        showAppLaunchToast("This button will launch the 'Stock Hawk' App");
    }

    public void openBuildItBigger(View view) {
        showAppLaunchToast("This button will launch the 'Build It Bigger' App");
    }

    public void openMakeYourAppMaterial(View view) {
        showAppLaunchToast("This button will launch the 'Make Your App Material' App");
    }

    public void openGoUbiquitous(View view) {
        showAppLaunchToast("This button will launch the 'Go Ubiquitous' App");
    }

    public void openCapstone(View view) {
        showAppLaunchToast("This button will launch the 'Capstone: My App' App");
    }
}
