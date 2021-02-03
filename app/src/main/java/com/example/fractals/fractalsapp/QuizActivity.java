package com.example.fractals.fractalsapp;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private int numberOfCorrectAnswers = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

    }

    public void onSubmitClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.definitionYes:
                if (checked)
                    numberOfCorrectAnswers++;
                    break;
            case R.id.natureYes:
                if (checked)
                    numberOfCorrectAnswers++;
                    break;
        }

        Context context = getApplicationContext();
        CharSequence text = "I've managed to answer " + numberOfCorrectAnswers + " correct answers";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void onShareClicked(View view) {
        String statusToShare = "I've managed to answer " + numberOfCorrectAnswers + " correct answers";
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");


        intent.putExtra(Intent.EXTRA_TEXT, statusToShare);

        boolean facebookAppFound = false;
        List<ResolveInfo> matches = getPackageManager().queryIntentActivities(intent, 0);
        for (ResolveInfo info : matches) {
            if (info.activityInfo.packageName.toLowerCase().startsWith("com.facebook.katana")) {
                intent.setPackage(info.activityInfo.packageName);
                facebookAppFound = true;
                break;
            }
        }

        if (!facebookAppFound) {
            String sharerUrl = "https://www.facebook.com/sharer/sharer.php?u=" + statusToShare;
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse(sharerUrl));
        }

        startActivity(intent);
    }
}
