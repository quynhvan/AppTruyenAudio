package com.example.apptruyenaudio.stories;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.apptruyenaudio.R;

import java.util.ArrayList;

public class ChuVetHayChe extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private ImageView play,pre,next,page;
    private int currentIndex = 0;
    private ArrayList<Integer> listTruyen = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.truyen_detail);
    }
    public void initTruyen() {
        listTruyen.add(0, R.raw.chu_vet_hay_che_1);
        listTruyen.add(1, R.raw.chu_vet_hay_che_2);
        listTruyen.add(2, R.raw.chu_vet_hay_che_3);
        listTruyen.add(3, R.raw.chu_vet_hay_che_4);
        listTruyen.add(4, R.raw.chu_vet_hay_che_5);
        listTruyen.add(5, R.raw.chu_vet_hay_che_6);
        listTruyen.add(6, R.raw.chu_vet_hay_che_7);
        listTruyen.add(7, R.raw.chu_vet_hay_che_8);
        listTruyen.add(8, R.raw.chu_vet_hay_che_9);
        listTruyen.add(8, R.raw.chu_vet_hay_che_10);

    }
    public void setWidget(){
        mediaPlayer = MediaPlayer.create(ChuVetHayChe.this,R.raw.chu_vet_hay_che_1);
        mediaPlayer.start();
        play = findViewById(R.id.iv_play);
        pre = findViewById(R.id.iv_pre);
        next = findViewById(R.id.iv_next);
        page = findViewById(R.id.iv_trang_truyen);

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
                mp = MediaPlayer.create(ChuVetHayChe.this, listTruyen.get(currentIndex));
                mp.start();
                truyenPage();
            }
        });
    }
    private void truyenPage() {
        if (currentIndex == 0) {
            page.setImageResource(R.drawable.chu_vet_hay_che_1);
        }
        if (currentIndex == 1) {
            page.setImageResource(R.drawable.chu_vet_hay_che_2);
        }
        if (currentIndex == 2) {
            page.setImageResource(R.drawable.chu_vet_hay_che_3);
        }
        if (currentIndex == 3) {
            page.setImageResource(R.drawable.chu_vet_hay_che_4);
        }
        if (currentIndex == 4) {
            page.setImageResource(R.drawable.chu_vet_hay_che_5);
        }
        if (currentIndex == 5) {
            page.setImageResource(R.drawable.chu_vet_hay_che_6);
        }
        if (currentIndex == 6) {
            page.setImageResource(R.drawable.chu_vet_hay_che_7);
        }
        if (currentIndex == 7) {
            page.setImageResource(R.drawable.chu_vet_hay_che_8);
        }
        if (currentIndex == 8) {
            page.setImageResource(R.drawable.chu_vet_hay_che_9);
        }
        if (currentIndex == 9) {
            page.setImageResource(R.drawable.chu_vet_hay_che_10);
        }

    }

}
