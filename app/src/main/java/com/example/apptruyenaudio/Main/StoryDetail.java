package com.example.apptruyenaudio.Main;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.apptruyenaudio.Constants;
import com.example.apptruyenaudio.R;

import java.util.ArrayList;

public class StoryDetail extends AppCompatActivity implements View.OnClickListener, MediaPlayer.OnCompletionListener {
    private MediaPlayer mediaPlayer;
    protected ImageView play, pre, next, pager, ivHome;
    int currentIndex = 0;
    private ArrayList<StoryPage> listTruyen = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.truyen_detail);
        initData();
        setWidget();
        initEvents();
    }

    private void initData() {
        Intent intent = getIntent();
        listTruyen = intent.getParcelableArrayListExtra(Constants.LIST_PAGE);
    }

    private void initEvents() {
        play.setOnClickListener(this);
        pre.setOnClickListener(this);
        next.setOnClickListener(this);
        ivHome.setOnClickListener(this);
        mediaPlayer.setOnCompletionListener(this);
    }

    public void setWidget() {
        mediaPlayer = MediaPlayer.create(StoryDetail.this, listTruyen.get(currentIndex).getIdAudio());
        mediaPlayer.start();
        ivHome = findViewById(R.id.iv_home);
        play = findViewById(R.id.iv_play);
        pre = findViewById(R.id.iv_pre);
        next = findViewById(R.id.iv_next);
        pager = findViewById(R.id.iv_trang_truyen);
        pager.setImageResource(listTruyen.get(currentIndex).getIdImage());
        setDisplayHomePlayButton();
    }

    public void play() {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            play.setImageResource(R.drawable.ic_play);
        } else {
            mediaPlayer.start();
            play.setImageResource(R.drawable.ic_pause);
        }

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
        setDisplayHomePlayButton();
        pager.setImageResource(listTruyen.get(currentIndex).getIdImage());
        mediaPlayer = MediaPlayer.create(getApplicationContext(), listTruyen.get(currentIndex).getIdAudio());
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(this);
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
        setDisplayHomePlayButton();
        pager.setImageResource(listTruyen.get(currentIndex).getIdImage());
        mediaPlayer = MediaPlayer.create(getApplicationContext(), listTruyen.get(currentIndex).getIdAudio());

        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(this);
    }

    public void onCompleteListener() {
        if (currentIndex < (listTruyen.size() - 1)) {
            currentIndex++;
            Log.d("currentIndex1", ":" + currentIndex);
        } else {
            mediaPlayer.stop();
        }
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.reset();
        }
        Log.d("currentIndex2", ":" + currentIndex);
        pager.setImageResource(listTruyen.get(currentIndex).getIdImage());
        mediaPlayer = MediaPlayer.create(getApplicationContext(), listTruyen.get(currentIndex).getIdAudio());
        mediaPlayer.start();

        setDisplayHomePlayButton();
        mediaPlayer.setOnCompletionListener(this);
    }

    private void setDisplayHomePlayButton() {
        boolean isHomeLeft = listTruyen.get(currentIndex).isHomeLeft();
        boolean isPlayLeft = listTruyen.get(currentIndex).isPlayLeft();

        FrameLayout.LayoutParams layoutParamsPlayButton = (FrameLayout.LayoutParams)play.getLayoutParams();
        FrameLayout.LayoutParams layoutParamsHomeButton = (FrameLayout.LayoutParams)ivHome.getLayoutParams();
        if(isPlayLeft){
            layoutParamsPlayButton.gravity = Gravity.LEFT | Gravity.BOTTOM;
        }else{
            layoutParamsPlayButton.gravity = Gravity.RIGHT | Gravity.BOTTOM;
        }
        play.setLayoutParams(layoutParamsPlayButton);

        if(isHomeLeft){
            layoutParamsHomeButton.gravity = Gravity.LEFT | Gravity.TOP;
        }else{
            layoutParamsHomeButton.gravity = Gravity.RIGHT | Gravity.TOP;
        }
        ivHome.setLayoutParams(layoutParamsHomeButton);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_home:
                finish();
                break;
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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
    }
}

