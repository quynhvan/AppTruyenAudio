package com.example.apptruyenaudio.stories;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.example.apptruyenaudio.R;

import java.util.ArrayList;

public class ChuBeChanCuu extends BaseStory {
    private MediaPlayer mediaPlayer;
    private ImageView play,pre,next,page;
    private int currentIndex = 0;
    private ArrayList<Integer> listTruyen = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.truyen_detail);
    }

    @Override
    public ArrayList<Integer> initDataTruyen() {
        listTruyen.add(0, R.raw.chu_be_chan_cuu_1);
        listTruyen.add(1, R.raw.chu_be_chan_cuu_2);
        listTruyen.add(2, R.raw.chu_be_chan_cuu_3);
        listTruyen.add(3, R.raw.chu_be_chan_cuu_4);
        listTruyen.add(4, R.raw.chu_be_chan_cuu_5);
        listTruyen.add(5, R.raw.chu_be_chan_cuu_6);
        listTruyen.add(6, R.raw.chu_be_chan_cuu_7);
        listTruyen.add(7, R.raw.chu_be_chan_cuu_8);
        listTruyen.add(8, R.raw.chu_be_chan_cuu_9);
        return listTruyen;
    }

    @Override
    public void truyenPage() {
        if (currentIndex == 0) {
            page.setImageResource(R.drawable.chu_be_chan_cuu_1);
        }
        if (currentIndex == 1) {
            page.setImageResource(R.drawable.chu_be_chan_cuu_2);
        }
        if (currentIndex == 2) {
            page.setImageResource(R.drawable.chu_be_chan_cuu_3);
        }
        if (currentIndex == 3) {
            page.setImageResource(R.drawable.chu_be_chan_cuu_4);
        }
        if (currentIndex == 4) {
            page.setImageResource(R.drawable.chu_be_chan_cuu_5);
        }
        if (currentIndex == 5) {
            page.setImageResource(R.drawable.chu_be_chan_cuu_6);
        }
        if (currentIndex == 6) {
            page.setImageResource(R.drawable.chu_be_chan_cuu_7);
        }
        if (currentIndex == 7) {
            page.setImageResource(R.drawable.chu_be_chan_cuu_8);
        }
        if (currentIndex == 8) {
            page.setImageResource(R.drawable.chu_be_chan_cuu_9);
        }
    }
}
