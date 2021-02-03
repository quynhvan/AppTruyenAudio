package com.example.apptruyenaudio.stories;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.apptruyenaudio.R;
import com.example.apptruyenaudio.Main.Truyen;

import java.util.ArrayList;

public class ThoTaiDai extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private ImageView play, pre, next, pager;
    private Truyen truyen;
    private AudioManager audioManager;
    int currentIndex = 0;
    boolean isRight;
    private final ArrayList<Integer> listTruyen = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.truyen_detail);
        setWidget();
        initTruyen();
        setEventPlay();
        truyenPage();
        setEventNext();
        setEventOnComplete();
        setEvenPre();
    }

    public void initTruyen() {
        listTruyen.add(0, R.raw.tho_tai_dai_1);
        listTruyen.add(1, R.raw.tho_tai_dai_2);
        listTruyen.add(2, R.raw.tho_tai_dai_3);
        listTruyen.add(3, R.raw.tho_tai_dai_4);
        listTruyen.add(4, R.raw.tho_tai_dai_5);
        listTruyen.add(5, R.raw.tho_tai_dai_6);
        listTruyen.add(6, R.raw.tho_tai_dai_7);
        listTruyen.add(7, R.raw.tho_tai_dai_8);
        listTruyen.add(8, R.raw.tho_tai_dai_9);
        listTruyen.add(8, R.raw.tho_tai_dai_10);
        listTruyen.add(8, R.raw.tho_tai_dai_11);
        listTruyen.add(8, R.raw.tho_tai_dai_12);
        listTruyen.add(8, R.raw.tho_tai_dai_13);
        listTruyen.add(8, R.raw.tho_tai_dai_14);
        listTruyen.add(8, R.raw.tho_tai_dai_15);
        listTruyen.add(8, R.raw.tho_tai_dai_16);

    }

    public void setWidget() {
        mediaPlayer = MediaPlayer.create(ThoTaiDai.this, R.raw.tho_tai_dai_1);
        mediaPlayer.start();
        play = findViewById(R.id.iv_play);
        pre = findViewById(R.id.iv_pre);
        next = findViewById(R.id.iv_next);
        pager = findViewById(R.id.iv_trang_truyen);
    }

    public void setEventPlay() {
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    play.setImageResource(R.drawable.ic_play);
                } else {
                    mediaPlayer.start();
                    play.setImageResource(R.drawable.ic_pause);
                }
                truyenPage();
            }
        });
    }

    public void setEventNext() {
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
        });
    }

    public void setEvenPre() {
        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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

        });
    }
    public void setEventOnComplete() {
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                if (currentIndex < listTruyen.size()-1){
                    currentIndex++;
                }
                else {
                    mp.stop();
                }
                mp = MediaPlayer.create(ThoTaiDai.this, listTruyen.get(currentIndex));
                mp.start();
                truyenPage();
            }
        });
    }
    private void truyenPage() {
        if (currentIndex == 0) {
            pager.setImageResource(R.drawable.tho_tai_dai_1);
        }
        if (currentIndex == 1) {
            pager.setImageResource(R.drawable.tho_tai_dai_2);
        }
        if (currentIndex == 2) {
            pager.setImageResource(R.drawable.tho_tai_dai_3);
        }
        if (currentIndex == 3) {
            pager.setImageResource(R.drawable.tho_tai_dai_4);
        }
        if (currentIndex == 4) {
            pager.setImageResource(R.drawable.tho_tai_dai_5);
        }
        if (currentIndex == 5) {
            pager.setImageResource(R.drawable.tho_tai_dai_6);
        }
        if (currentIndex == 6) {
            pager.setImageResource(R.drawable.tho_tai_dai_7);
        }
        if (currentIndex == 7) {
            pager.setImageResource(R.drawable.tho_tai_dai_8);
        }
        if (currentIndex == 8) {
            pager.setImageResource(R.drawable.tho_tai_dai_9);
        }
    }


}

