package com.example.appfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class GameActivity extends AppCompatActivity {
    private GLSurfaceView gLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
       ;


            // Create a GLSurfaceView instance and set it
            // as the ContentView for this Activity.
            gLView = new MyGLSurfaceView(this);
            setContentView(gLView);
    }
}