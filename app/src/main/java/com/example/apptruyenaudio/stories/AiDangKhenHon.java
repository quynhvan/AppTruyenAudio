package com.example.apptruyenaudio.stories;

import com.example.apptruyenaudio.R;

import java.util.ArrayList;

public class AiDangKhenHon extends BaseStory {
    private final ArrayList<Integer> listTruyen = new ArrayList<>();
    @Override
    public ArrayList<Integer> initDataTruyen() {
        listTruyen.add(0, R.raw.ai_dang_khen_hon_1);
        listTruyen.add(1, R.raw.ai_dang_khen_hon_2);
        listTruyen.add(2, R.raw.ai_dang_khen_hon_3);
        listTruyen.add(3, R.raw.ai_dang_khen_hon_4);
        listTruyen.add(4, R.raw.ai_dang_khen_hon_5);
        listTruyen.add(5, R.raw.ai_dang_khen_hon_6);
        listTruyen.add(6, R.raw.ai_dang_khen_hon_7);
        listTruyen.add(7, R.raw.ai_dang_khen_hon_8);
        listTruyen.add(8, R.raw.ai_dang_khen_hon_9);
        listTruyen.add(9, R.raw.ai_dang_khen_hon_10);
        listTruyen.add(10, R.raw.ai_dang_khen_hon_11);
        return listTruyen;
    }

    @Override
    public void truyenPage() {
        if (currentIndex == 0) {
            pager.setImageResource(R.drawable.ai_dang_khen_hon_1);
        }
        if (currentIndex == 1) {
            pager.setImageResource(R.drawable.ai_dang_khen_hon_2);
        }
        if (currentIndex == 2) {
            pager.setImageResource(R.drawable.ai_dang_khen_hon_3);
        }
        if (currentIndex == 3) {
            pager.setImageResource(R.drawable.ai_dang_khen_hon_4);
        }
        if (currentIndex == 4) {
            pager.setImageResource(R.drawable.ai_dang_khen_hon_5);
        }
        if (currentIndex == 5) {
            pager.setImageResource(R.drawable.ai_dang_khen_hon_6);
        }
        if (currentIndex == 6) {
            pager.setImageResource(R.drawable.ai_dang_khen_hon_7);
        }
        if (currentIndex == 7) {
            pager.setImageResource(R.drawable.ai_dang_khen_hon_8);
        }
        if (currentIndex == 8) {
            pager.setImageResource(R.drawable.ai_dang_khen_hon_9);
        }
        if (currentIndex == 9) {
            pager.setImageResource(R.drawable.ai_dang_khen_hon_10);
        }
        if (currentIndex == 10) {
            pager.setImageResource(R.drawable.ai_dang_khen_hon_11);
        }
    }


}

