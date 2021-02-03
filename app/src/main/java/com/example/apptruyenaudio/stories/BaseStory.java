package com.example.apptruyenaudio.stories;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.apptruyenaudio.R;
import com.example.apptruyenaudio.Main.Truyen;

import java.util.ArrayList;

public abstract class BaseStory extends AppCompatActivity implements View.OnClickListener, MediaPlayer.OnCompletionListener {
    private MediaPlayer mediaPlayer;
    protected ImageView play, pre, next, pager;
    private Truyen truyen;
    private AudioManager audioManager;
    int currentIndex = 0;
    boolean isRight;
    private  ArrayList<Integer> listTruyen = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.truyen_detail);
        setWidget();
        listTruyen = initDataTruyen();
        truyenPage();
        initEvents();
    }

    private void initEvents() {
        play.setOnClickListener(this);
        pre.setOnClickListener(this);
        next.setOnClickListener(this);

        mediaPlayer.setOnCompletionListener(this);
    }

    public abstract ArrayList<Integer> initDataTruyen();
    public abstract void truyenPage();

    public void setWidget() {
        mediaPlayer = MediaPlayer.create(BaseStory.this, R.raw.ai_dang_khen_hon_1);
        mediaPlayer.start();
        play = findViewById(R.id.iv_play);
        pre = findViewById(R.id.iv_pre);
        next = findViewById(R.id.iv_next);
        pager = findViewById(R.id.iv_trang_truyen);
    }

    public void play() {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            play.setImageResource(R.drawable.ic_play);
        } else {
            mediaPlayer.start();
            play.setImageResource(R.drawable.ic_pause);
        }
        truyenPage();
    }

    public void nextPage() {
        if (mediaPlayer != null) {
            play.setImageResource(R.drawable.ic_pause);
        }
        if (currentIndex < listTruyen.size() - 1) {
            currentIndex++;

        } else {
            mediaPlayer.stop();
        }
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(), listTruyen.get(currentIndex));
        mediaPlayer.start();
        truyenPage();
    }

    public void previousPage() {
        if (mediaPlayer != null) {
            play.setImageResource(R.drawable.ic_pause);
        }
        if (currentIndex > 0) {
            currentIndex--;
        } else {
            mediaPlayer.stop();
        }
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(), listTruyen.get(currentIndex));
        mediaPlayer.start();
        truyenPage();
    }

    public void onCompleteListener() {
                if (currentIndex < (listTruyen.size()-1)){
                    currentIndex++;
                    Log.d("currentIndex1",":"+currentIndex);
                }
                else {
                    mediaPlayer.stop();
                }
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.reset();
                }
                   Log.d("currentIndex2",":"+currentIndex);
                mediaPlayer = MediaPlayer.create(getApplicationContext(), listTruyen.get(currentIndex));
                mediaPlayer.start();
                truyenPage();
                mediaPlayer.setOnCompletionListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.iv_play:
                play();
                break;
            case R.id.iv_pre:
                previousPage();
                break;
            case R.id.iv_next:
                nextPage();
                break;
        }
    }

    @Override
    public void onCompletion(MediaPlayer mediaPlayer) {
        onCompleteListener();
    }
}

