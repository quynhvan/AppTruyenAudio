package com.example.apptruyenaudio.stories;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.apptruyenaudio.R;

import java.util.ArrayList;

public class CoBeBanDiem extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private ImageView play,pre,next,page;
    private int currentIndex = 0;
    private ArrayList<Integer> listTruyen = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.truyen_detail);
    }
    public void setWidget(){
        mediaPlayer = MediaPlayer.create(CoBeBanDiem.this,R.raw.co_be_ban_diem_1);
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
                mp = MediaPlayer.create(CoBeBanDiem.this, listTruyen.get(currentIndex));
                mp.start();
                truyenPage();
            }
        });
    }
    private void truyenPage() {
        if (currentIndex == 0) {
            page.setImageResource(R.drawable.co_be_ban_diem_1);
        }
        if (currentIndex == 1) {
            page.setImageResource(R.drawable.co_be_ban_diem_2);
        }
        if (currentIndex == 2) {
            page.setImageResource(R.drawable.co_be_ban_diem_3);
        }
        if (currentIndex == 3) {
            page.setImageResource(R.drawable.co_be_ban_diem_4);
        }
        if (currentIndex == 4) {
            page.setImageResource(R.drawable.co_be_ban_diem_5);
        }
        if (currentIndex == 5) {
            page.setImageResource(R.drawable.co_be_ban_diem_6);
        }
        if (currentIndex == 6) {
            page.setImageResource(R.drawable.co_be_ban_diem_7);
        }
        if (currentIndex == 7) {
            page.setImageResource(R.drawable.co_be_ban_diem_8);
        }
        if (currentIndex == 8) {
            page.setImageResource(R.drawable.co_be_ban_diem_9);
        }
        if (currentIndex == 9) {
            page.setImageResource(R.drawable.co_be_ban_diem_10);
        }

    }

}
