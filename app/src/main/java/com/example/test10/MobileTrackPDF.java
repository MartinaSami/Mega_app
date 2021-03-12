package com.example.test10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MobileTrackPDF extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_track_p_d_f);
        pdfView = findViewById(R.id.PDFView);


        pdfView.fromAsset("The complete Java development course.pdf").load();


    }
}