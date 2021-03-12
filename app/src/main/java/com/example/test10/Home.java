package com.example.test10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

public class Home extends AppCompatActivity implements View.OnClickListener {




        Button btnPDF, btnJavaTpoint, btnGoogleMaps ,btn_calculatorAPP, btnVideoPlayer, btn_randomMountains, btn_RestaurantOrdering, btnDOgOrCatQuiz, btnTemperatureConverter, btnYatGroup, btnPassingBioData, btnMusicPlayer;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home);
            btn_calculatorAPP = findViewById(R.id.btn_CalculatorApp);
            btn_randomMountains = findViewById(R.id.btn_randomHighestMountains);
            btn_RestaurantOrdering = findViewById(R.id.btn_Restaurant);
            btnDOgOrCatQuiz = findViewById(R.id.btn_DogOrCat);
            btnTemperatureConverter = findViewById(R.id.btn_temperatureConverter);
            btnYatGroup = findViewById(R.id.btn_YatGroup);
            btnPassingBioData = findViewById(R.id.btnPassingBioData);
            btnMusicPlayer = findViewById(R.id.btnMusicPlayer);
            btnVideoPlayer = findViewById(R.id.btnVideoExoPlayer);
            btnGoogleMaps=findViewById(R.id.btnGoogleMaps);
            btnJavaTpoint=findViewById(R.id.btnJavaTpointWebsite);
            btnPDF = findViewById(R.id.btnPDFView);
            btn_RestaurantOrdering.setOnClickListener(this);
            btn_calculatorAPP.setOnClickListener(this);
            btn_randomMountains.setOnClickListener(this);
            btnDOgOrCatQuiz.setOnClickListener(this);
            btnTemperatureConverter.setOnClickListener(this);
            btnYatGroup.setOnClickListener(this);
            btnPassingBioData.setOnClickListener(this);
            btnMusicPlayer.setOnClickListener(this);
            btnVideoPlayer.setOnClickListener(this);
            btnGoogleMaps.setOnClickListener(this);
            btnJavaTpoint.setOnClickListener(this);
            btnPDF.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.btn_CalculatorApp:
                    Intent goToCalculator = new Intent(getApplicationContext(), Calculator.class);
                    startActivity(goToCalculator);
                    break;

                case R.id.btn_randomHighestMountains:
                    Intent goToRandomHighestMountains = new Intent(getApplicationContext(), RandomMountains.class);
                    startActivity(goToRandomHighestMountains);
                    break;

                case R.id.btn_Restaurant:

                    Intent goToRestaurant = new Intent(getApplicationContext(), Resturant.class);
                    startActivity(goToRestaurant);
                    break;
                case R.id.btn_DogOrCat:
                    Intent goTodogorcat = new Intent(getApplicationContext(), dogorcat.class);
                    startActivity(goTodogorcat);
                    break;
                case R.id.btn_temperatureConverter:
                    Intent goTotempretaure = new Intent(getApplicationContext(), tempretaure.class);
                    startActivity(goTotempretaure);
                    break;
                case R.id.btn_YatGroup:
                    Intent goToYatGroup = new Intent(getApplicationContext(), YatGroup.class);
                    startActivity(goToYatGroup);
                    break;
                case R.id.btnPassingBioData:
                    Intent goToPassingBioData = new Intent(getApplicationContext(), PassingBioData.class);
                    startActivity(goToPassingBioData);
                    break;
                case R.id.btnMusicPlayer:
                    Intent goToMusicPlayer = new Intent(getApplicationContext(), MusicPlayer.class);
                    startActivity(goToMusicPlayer);
                    break;
                case R.id.btnVideoExoPlayer:
                    Intent goToVideoPlayer = new Intent(getApplicationContext(), VideoPlayer.class);
                    startActivity(goToVideoPlayer);
                    break;
                case R.id.btnJavaTpointWebsite:
                    Intent goToJavaTpointWebsite = new Intent(getApplicationContext(), JavaTpointWebsite.class);
                    startActivity(goToJavaTpointWebsite);
                    break;
                case R.id.btnPDFView:
                    Intent goToPDFview = new Intent(getApplicationContext(), MobileTrackPDF.class);
                    startActivity(goToPDFview);
                    break;
                case R.id.btnGoogleMaps:
                    Intent goToGoogleMaps = new Intent(getApplicationContext(), MapsActivity.class);
                    startActivity(goToGoogleMaps);
                    break;
            }

        }

    }
