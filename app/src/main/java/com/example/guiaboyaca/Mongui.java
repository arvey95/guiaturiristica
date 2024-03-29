package com.example.guiaboyaca;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher.ViewFactory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.maps.model.LatLng;


public class Mongui extends Activity {
    private ImageSwitcher imageSwitcher;

    private int[] gallery = { R.drawable.m1, R.drawable.m2, R.drawable.m3, R.drawable.m4, R.drawable.m5, R.drawable.mon, R.drawable.frailejon};
    ArrayList<String> listatitulos = new ArrayList<String>();



    private int position;

    private static final Integer DURATION = 3500;

    private Timer timer = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mongui);

        imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);

        imageSwitcher.setFactory(new ViewFactory() {

            public View makeView() {
                return new ImageView(Mongui.this);

            }});




    }


    public void start(View button) {
        if (timer != null) {
            timer.cancel();
        }
        position = 0;
        startSlider();
    }

    public void stop(View button) {
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }

    public void startSlider() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                // avoid exception:
                // "Only the original thread that created a view hierarchy can touch its views"
                runOnUiThread(new Runnable() {
                    public void run() {
                        imageSwitcher.setImageResource(gallery[position]);
                        position++;
                        if (position == gallery.length) {
                            position = 0;
                        }
                    }
                });
            }

        }, 0, DURATION);
    }

    // Stops the slider when the Activity is going into the background
    @Override
    protected void onPause() {
        super.onPause();
        if (timer != null) {
            timer.cancel();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (timer != null) {
            startSlider();
        }

    }


}