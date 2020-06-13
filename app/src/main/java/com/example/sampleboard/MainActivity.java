package com.example.sampleboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer[] mp = new MediaPlayer[12];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp[0] = MediaPlayer.create(this, R.raw.closedhat);
        mp[1] = MediaPlayer.create(this, R.raw.crashcymbal);
        mp[2] = MediaPlayer.create(this, R.raw.floortom);
        mp[3] = MediaPlayer.create(this, R.raw.kick);
        mp[4] = MediaPlayer.create(this, R.raw.midhat);
        mp[5] = MediaPlayer.create(this, R.raw.midtom);
        mp[6] = MediaPlayer.create(this, R.raw.openhat1);
        mp[7] = MediaPlayer.create(this, R.raw.openhat2);
        mp[8] = MediaPlayer.create(this, R.raw.ridecymbal);
        mp[9] = MediaPlayer.create(this, R.raw.sample1);
        mp[10] = MediaPlayer.create(this, R.raw.sample2);
        mp[11] = MediaPlayer.create(this, R.raw.alien);






    }
    public void playSample(View v){
        switch (v.getId()) {
            case R.id.button1:
                mp[0].start();
                break;
            case R.id.button2:
                mp[1].start();
                break;
            case R.id.button3:
                mp[2].start();
                break;
            case R.id.button4:
                mp[3].start();
                break;
            case R.id.button5:
                mp[4].start();
                break;
            case R.id.button6:
                mp[5].start();
                break;
            case R.id.button7:
                mp[6].start();
                break;
            case R.id.button8:
                mp[7].start();
                break;
            case R.id.button9:
                mp[8].start();
                break;
            case R.id.button10:
                mp[9].start();
                break;
            case R.id.button11:
                mp[10].start();
                break;
            case R.id.button12:
                mp[11].start();
                break;
        }
    }
}