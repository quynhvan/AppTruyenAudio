package com.example.apptruyenaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.apptruyenaudio.Main.Truyen;

public class MainActivity2 extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private Button btnPlay, btnPause;
    private Truyen truyen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giao_dien);
//        int idAudio = truyen.getIdAudio();
        setWidget();
        setEventClick();
        setEventPause();
//        setOnComplete();
//        playAudio(idAudio);

    }
    public void setWidget() {
        mediaPlayer = MediaPlayer.create(MainActivity2.this, R.raw.co_be_ban_diem_1);
        btnPause = findViewById(R.id.btn_pause);
        btnPlay = findViewById(R.id.btn_play);
    }
    public void setEventClick() {
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
                    mediaPlayer.start();
                }
            }
        });
    }
    public void setEventPause() {
        btnPause.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                }
            }
        }));
    }
//    public void setOnComplete() {
//        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mediaPlayer) {
//
//            }
//        });
//    }
    public void playAudio(int idAudio) {
        mediaPlayer = MediaPlayer.create(MainActivity2.this, idAudio);
    }
}

