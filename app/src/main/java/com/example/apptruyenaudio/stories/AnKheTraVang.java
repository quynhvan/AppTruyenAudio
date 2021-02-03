package com.example.apptruyenaudio.stories;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.apptruyenaudio.R;

import java.util.ArrayList;

public class AnKheTraVang extends BaseStory {
    private ArrayList<Integer> listTruyen = new ArrayList<>();

    @Override
    public ArrayList<Integer> initDataTruyen() {
        listTruyen.add(0,R.raw.an_khe_tra_vang_1);
        listTruyen.add(1,R.raw.an_khe_tra_vang_2);
        listTruyen.add(2,R.raw.an_khe_tra_vang_3);
        listTruyen.add(3,R.raw.an_khe_tra_vang_4);
        listTruyen.add(4,R.raw.an_khe_tra_vang_5);
        listTruyen.add(5,R.raw.an_khe_tra_vang_6);
        listTruyen.add(6,R.raw.an_khe_tra_vang_7);
        listTruyen.add(7,R.raw.an_khe_tra_vang_8);
        listTruyen.add(8,R.raw.an_khe_tra_vang_9);
        return listTruyen;
    }

    @Override
    public void truyenPage() {
        if(currentIndex == 0)
        {
            pager.setImageResource(R.drawable.an_khe_tra_vang_1);
        }
        if(currentIndex == 1)
        {
            pager.setImageResource(R.drawable.an_khe_tra_vang_2);
        }
        if(currentIndex == 2)
        {
            pager.setImageResource(R.drawable.an_khe_tra_vang_3);
        }
        if(currentIndex == 3)
        {
            pager.setImageResource(R.drawable.an_khe_tra_vang_4);
        }
        if(currentIndex == 4)
        {
            pager.setImageResource(R.drawable.an_khe_tra_vang_5);
        }
        if(currentIndex == 5)
        {
            pager.setImageResource(R.drawable.an_khe_tra_vang_6);
        }
        if(currentIndex == 6)
        {
            pager.setImageResource(R.drawable.an_khe_tra_vang_7);
        }
        if(currentIndex == 7)
        {
            pager.setImageResource(R.drawable.an_khe_tra_vang_8);
        }
        if(currentIndex == 8)
        {
            pager.setImageResource(R.drawable.an_khe_tra_vang_9);
        }
    }
}
