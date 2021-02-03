package com.example.apptruyenaudio.Main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.apptruyenaudio.Constants;
import com.example.apptruyenaudio.R;

import java.util.ArrayList;

public class ActivityTruyen extends AppCompatActivity {
    private GridView gridView;
    private ListAdapter listAdapter;
    private ArrayList<Truyen> dsTruyen = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_truyen);
        initTruyen();
        initDsTruyen();
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Truyen truyen = dsTruyen.get(i);
                ArrayList<StoryPage> listPage = truyen.getListPage();
                Intent intent = new Intent(ActivityTruyen.this, StoryDetail.class);
                intent.putParcelableArrayListExtra(Constants.LIST_PAGE, listPage);
                startActivity(intent);
            }
        });
    }

    public void initTruyen()
        {
            gridView = findViewById(R.id.gv_truyen);
            listAdapter = new ListAdapter(ActivityTruyen.this, dsTruyen);
            gridView.setAdapter(listAdapter);
        }
    public void initDsTruyen(){
        ArrayList<StoryPage> AiDangKhenHon = new ArrayList<>();
        AiDangKhenHon.add(new StoryPage(R.drawable.ai_dang_khen_hon_1,R.raw.ai_dang_khen_hon_1, true, false));
        AiDangKhenHon.add(new StoryPage(R.drawable.ai_dang_khen_hon_2,R.raw.ai_dang_khen_hon_2, true, false));
        AiDangKhenHon.add(new StoryPage(R.drawable.ai_dang_khen_hon_3,R.raw.ai_dang_khen_hon_3, true, true));
        AiDangKhenHon.add(new StoryPage(R.drawable.ai_dang_khen_hon_4,R.raw.ai_dang_khen_hon_4, true, false));
        AiDangKhenHon.add(new StoryPage(R.drawable.ai_dang_khen_hon_5,R.raw.ai_dang_khen_hon_5, true, false));
        AiDangKhenHon.add(new StoryPage(R.drawable.ai_dang_khen_hon_6,R.raw.ai_dang_khen_hon_6, true, true));
        AiDangKhenHon.add(new StoryPage(R.drawable.ai_dang_khen_hon_7,R.raw.ai_dang_khen_hon_7, true, false));
        AiDangKhenHon.add(new StoryPage(R.drawable.ai_dang_khen_hon_8,R.raw.ai_dang_khen_hon_8, true, true));
        AiDangKhenHon.add(new StoryPage(R.drawable.ai_dang_khen_hon_9,R.raw.ai_dang_khen_hon_9, true, true));
        AiDangKhenHon.add(new StoryPage(R.drawable.ai_dang_khen_hon_10,R.raw.ai_dang_khen_hon_10, true, false));
        AiDangKhenHon.add(new StoryPage(R.drawable.ai_dang_khen_hon_11,R.raw.ai_dang_khen_hon_11, true, false));

        dsTruyen.add(new Truyen(R.drawable.btn_ai_dang_khen_hon,"Ai đáng khen hơn", AiDangKhenHon));

        ArrayList<StoryPage> AnKheTraVang = new ArrayList<>();
        AnKheTraVang.add(new StoryPage(R.drawable.an_khe_tra_vang_1,R.raw.an_khe_tra_vang_1,true,true));
        AnKheTraVang.add(new StoryPage(R.drawable.an_khe_tra_vang_2,R.raw.an_khe_tra_vang_2,true,true));
        AnKheTraVang.add(new StoryPage(R.drawable.an_khe_tra_vang_3,R.raw.an_khe_tra_vang_3,true,true));
        AnKheTraVang.add(new StoryPage(R.drawable.an_khe_tra_vang_4,R.raw.an_khe_tra_vang_4,true,true));
        AnKheTraVang.add(new StoryPage(R.drawable.an_khe_tra_vang_5,R.raw.an_khe_tra_vang_5,true,true));
        AnKheTraVang.add(new StoryPage(R.drawable.an_khe_tra_vang_6,R.raw.an_khe_tra_vang_6,true,true));
        AnKheTraVang.add(new StoryPage(R.drawable.an_khe_tra_vang_7,R.raw.an_khe_tra_vang_7,true,true));
        AnKheTraVang.add(new StoryPage(R.drawable.an_khe_tra_vang_8,R.raw.an_khe_tra_vang_8,true,true));
        AnKheTraVang.add(new StoryPage(R.drawable.an_khe_tra_vang_9,R.raw.an_khe_tra_vang_9,true,true));

        dsTruyen.add(new Truyen(R.drawable.btn_an_khe_tra_vang,"Ăn khế trả vàng",AnKheTraVang));
        // Chu BE CHAN CUU

        ArrayList<StoryPage> ChuBeChanCuu = new ArrayList<>();
        ChuBeChanCuu.add(new StoryPage( R.drawable.chu_be_chan_cuu_1,R.raw.chu_be_chan_cuu_1,true, true));
        ChuBeChanCuu.add(new StoryPage( R.drawable.chu_be_chan_cuu_2,R.raw.chu_be_chan_cuu_2,true, true));
        ChuBeChanCuu.add(new StoryPage( R.drawable.chu_be_chan_cuu_3,R.raw.chu_be_chan_cuu_3,true, true));
        ChuBeChanCuu.add(new StoryPage( R.drawable.chu_be_chan_cuu_4,R.raw.chu_be_chan_cuu_4,true, true));
        ChuBeChanCuu.add(new StoryPage( R.drawable.chu_be_chan_cuu_5,R.raw.chu_be_chan_cuu_5,true, true));
        ChuBeChanCuu.add(new StoryPage( R.drawable.chu_be_chan_cuu_6,R.raw.chu_be_chan_cuu_6,true, true));
        ChuBeChanCuu.add(new StoryPage( R.drawable.chu_be_chan_cuu_7,R.raw.chu_be_chan_cuu_7,true, true));
        ChuBeChanCuu.add(new StoryPage( R.drawable.chu_be_chan_cuu_8,R.raw.chu_be_chan_cuu_8,true, true));
        ChuBeChanCuu.add(new StoryPage( R.drawable.chu_be_chan_cuu_9,R.raw.chu_be_chan_cuu_9,true, true));
        dsTruyen.add(new Truyen(R.drawable.btn_chu_be_chan_cuu,"Chú bé chăn cừu",ChuBeChanCuu));

        //Chu vet hay che
        ArrayList<StoryPage> ChuVetHayChe = new ArrayList<>();
        ChuVetHayChe.add(new StoryPage( R.drawable.chu_vet_hay_che_1,R.raw.chu_vet_hay_che_1,true, true));
        ChuVetHayChe.add(new StoryPage( R.drawable.chu_vet_hay_che_2,R.raw.chu_vet_hay_che_2,true, true));
        ChuVetHayChe.add(new StoryPage( R.drawable.chu_vet_hay_che_3,R.raw.chu_vet_hay_che_3,true, true));
        ChuVetHayChe.add(new StoryPage( R.drawable.chu_vet_hay_che_4,R.raw.chu_vet_hay_che_4,true, true));
        ChuVetHayChe.add(new StoryPage( R.drawable.chu_vet_hay_che_5,R.raw.chu_vet_hay_che_5,true, true));
        ChuVetHayChe.add(new StoryPage( R.drawable.chu_vet_hay_che_6,R.raw.chu_vet_hay_che_6,true, true));
        ChuVetHayChe.add(new StoryPage( R.drawable.chu_vet_hay_che_7,R.raw.chu_vet_hay_che_7,true, true));
        ChuVetHayChe.add(new StoryPage( R.drawable.chu_vet_hay_che_8,R.raw.chu_vet_hay_che_8,true, true));
        ChuVetHayChe.add(new StoryPage( R.drawable.chu_vet_hay_che_9,R.raw.chu_vet_hay_che_9,true, true));
        ChuVetHayChe.add(new StoryPage( R.drawable.chu_vet_hay_che_10,R.raw.chu_vet_hay_che_10,true, true));
        dsTruyen.add(new Truyen(R.drawable.btn_chu_vet_hay_che,"Chú vẹt hay chê",ChuVetHayChe));

        //Co be ban diem
        ArrayList<StoryPage> CoBeBanDiem = new ArrayList<>();
        CoBeBanDiem.add(new StoryPage( R.drawable.co_be_ban_diem_1,R.raw.co_be_ban_diem_1,true, true));
        CoBeBanDiem.add(new StoryPage( R.drawable.co_be_ban_diem_2,R.raw.co_be_ban_diem_2,true, true));
        CoBeBanDiem.add(new StoryPage( R.drawable.co_be_ban_diem_3,R.raw.co_be_ban_diem_3,false, true));
        CoBeBanDiem.add(new StoryPage( R.drawable.co_be_ban_diem_4,R.raw.co_be_ban_diem_4,true, false));
        CoBeBanDiem.add(new StoryPage( R.drawable.co_be_ban_diem_5,R.raw.co_be_ban_diem_5,true, true));
        CoBeBanDiem.add(new StoryPage( R.drawable.co_be_ban_diem_6,R.raw.co_be_ban_diem_6,true, false));
        CoBeBanDiem.add(new StoryPage( R.drawable.co_be_ban_diem_7,R.raw.co_be_ban_diem_7,true, true));
        CoBeBanDiem.add(new StoryPage( R.drawable.co_be_ban_diem_8,R.raw.co_be_ban_diem_8,true, true));
        CoBeBanDiem.add(new StoryPage( R.drawable.co_be_ban_diem_9,R.raw.co_be_ban_diem_9,true, false));
        CoBeBanDiem.add(new StoryPage( R.drawable.co_be_ban_diem_10,R.raw.co_be_ban_diem_10,true, false));
        CoBeBanDiem.add(new StoryPage( R.drawable.co_be_ban_diem_10,R.raw.co_be_ban_diem_11,false, true));
        CoBeBanDiem.add(new StoryPage( R.drawable.co_be_ban_diem_10,R.raw.co_be_ban_diem_12,false, true));
        CoBeBanDiem.add(new StoryPage( R.drawable.co_be_ban_diem_10,R.raw.co_be_ban_diem_13,false, true));
        CoBeBanDiem.add(new StoryPage( R.drawable.co_be_ban_diem_10,R.raw.co_be_ban_diem_14,false, true));
        CoBeBanDiem.add(new StoryPage( R.drawable.co_be_ban_diem_10,R.raw.co_be_ban_diem_15,false, false));
        dsTruyen.add(new Truyen(R.drawable.btn_co_be_ban_diem,"Cô bé bán diêm",CoBeBanDiem));

        //In con tham ăn
        ArrayList<StoryPage> InConThamAn  = new ArrayList<>();
        InConThamAn.add(new StoryPage( R.drawable.in_1,R.raw.in_1,true, true));
        InConThamAn.add(new StoryPage( R.drawable.in_2,R.raw.in_2,true, true));
        InConThamAn.add(new StoryPage( R.drawable.in_3,R.raw.in_3,false, true));
        InConThamAn.add(new StoryPage( R.drawable.in_4,R.raw.in_4,false, true));
        InConThamAn.add(new StoryPage( R.drawable.in_5,R.raw.in_5,false, true));
        InConThamAn.add(new StoryPage( R.drawable.in_6,R.raw.in_6,false, true));
        InConThamAn.add(new StoryPage( R.drawable.in_7,R.raw.in_7,true, true));
        InConThamAn.add(new StoryPage( R.drawable.in_8,R.raw.in_8,false, true));
        dsTruyen.add(new Truyen(R.drawable.btn_in_con_tham_an,"Ỉn con tham ăn",InConThamAn));

        //Ngay va Dem
        ArrayList<StoryPage> NgayVaDem = new ArrayList<>();
        NgayVaDem.add(new StoryPage( R.drawable.ngay_va_dem_1,R.raw.ngay_va_dem_1,true, true));
        NgayVaDem.add(new StoryPage( R.drawable.ngay_va_dem_2,R.raw.ngay_va_dem_2,true, true));
        NgayVaDem.add(new StoryPage( R.drawable.ngay_va_dem_3,R.raw.ngay_va_dem_3,true, true));
        NgayVaDem.add(new StoryPage( R.drawable.ngay_va_dem_4,R.raw.ngay_va_dem_4,true, true));
        NgayVaDem.add(new StoryPage( R.drawable.ngay_va_dem_5,R.raw.ngay_va_dem_5,true, true));
        NgayVaDem.add(new StoryPage( R.drawable.ngay_va_dem_6,R.raw.ngay_va_dem_6,true, true));
        NgayVaDem.add(new StoryPage( R.drawable.ngay_va_dem_7,R.raw.ngay_va_dem_7,false, true));
        NgayVaDem.add(new StoryPage( R.drawable.ngay_va_dem_8,R.raw.ngay_va_dem_8,true, false));
        NgayVaDem.add(new StoryPage( R.drawable.ngay_va_dem_9,R.raw.ngay_va_dem_9,true, true));
        dsTruyen.add(new Truyen(R.drawable.btn_ngay_va_dem,"Ngày và đêm",NgayVaDem));

        //Tho tai dai

        ArrayList<StoryPage> ThoTaiDai = new ArrayList<>();
        ThoTaiDai.add(new StoryPage( R.drawable.tho_tai_dai_1,R.raw.tho_tai_dai_1,true, true));
        ThoTaiDai.add(new StoryPage( R.drawable.tho_tai_dai_2,R.raw.tho_tai_dai_2,true, true));
        ThoTaiDai.add(new StoryPage( R.drawable.tho_tai_dai_3,R.raw.tho_tai_dai_3,true, false));
        ThoTaiDai.add(new StoryPage( R.drawable.tho_tai_dai_4,R.raw.tho_tai_dai_4,true, true));
        ThoTaiDai.add(new StoryPage( R.drawable.tho_tai_dai_5,R.raw.tho_tai_dai_5,true, true));
        ThoTaiDai.add(new StoryPage( R.drawable.tho_tai_dai_6,R.raw.tho_tai_dai_6,true, true));
        ThoTaiDai.add(new StoryPage( R.drawable.tho_tai_dai_7,R.raw.tho_tai_dai_7,true, true));
        ThoTaiDai.add(new StoryPage( R.drawable.tho_tai_dai_8,R.raw.tho_tai_dai_8,true, true));
        ThoTaiDai.add(new StoryPage( R.drawable.tho_tai_dai_9,R.raw.tho_tai_dai_9,true, true));
        ThoTaiDai.add(new StoryPage( R.drawable.tho_tai_dai_10,R.raw.tho_tai_dai_10,true, false));
        ThoTaiDai.add(new StoryPage( R.drawable.tho_tai_dai_11,R.raw.tho_tai_dai_11,true, false));
        ThoTaiDai.add(new StoryPage( R.drawable.tho_tai_dai_12,R.raw.tho_tai_dai_12,true, false));
        ThoTaiDai.add(new StoryPage( R.drawable.tho_tai_dai_13,R.raw.tho_tai_dai_13,true, false));
        ThoTaiDai.add(new StoryPage( R.drawable.tho_tai_dai_14,R.raw.tho_tai_dai_14,true, false));
        ThoTaiDai.add(new StoryPage( R.drawable.tho_tai_dai_15,R.raw.tho_tai_dai_15,true, true));
        ThoTaiDai.add(new StoryPage( R.drawable.tho_tai_dai_16,R.raw.tho_tai_dai_16,true, true));
        dsTruyen.add(new Truyen(R.drawable.btn_tho_tai_dai,"Thỏ tai dài",ThoTaiDai));

        //Tich chu
        ArrayList<StoryPage> TichChu = new ArrayList<>();
        TichChu.add(new StoryPage( R.drawable.tich_chu_1,R.raw.tich_chu_1,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_2,R.raw.tich_chu_2,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_3,R.raw.tich_chu_3,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_4,R.raw.tich_chu_4,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_5,R.raw.tich_chu_5,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_6,R.raw.tich_chu_6,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_7,R.raw.tich_chu_7,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_8,R.raw.tich_chu_8,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_9,R.raw.tich_chu_9,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_10,R.raw.tich_chu_10,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_11,R.raw.tich_chu_11,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_12,R.raw.tich_chu_12,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_13,R.raw.tich_chu_13,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_14,R.raw.tich_chu_14,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_15,R.raw.tich_chu_15,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_16,R.raw.tich_chu_16,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_17,R.raw.tich_chu_17,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_18,R.raw.tich_chu_18,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_19,R.raw.tich_chu_19,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_20,R.raw.tich_chu_20,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_21,R.raw.tich_chu_21,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_22,R.raw.tich_chu_22,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_23,R.raw.tich_chu_23,true, true));
        TichChu.add(new StoryPage( R.drawable.tich_chu_24,R.raw.tich_chu_24,true, true));
        dsTruyen.add(new Truyen(R.drawable.btn_tich_chu,"Tích chu",TichChu));

        //Tre Trăm đốt
        ArrayList<StoryPage> TreTramDot = new ArrayList<>();
        TreTramDot.add(new StoryPage( R.drawable.tre_tram_dot_1,R.raw.tre_tram_dot_1,true, true));
        TreTramDot.add(new StoryPage( R.drawable.tre_tram_dot_2,R.raw.tre_tram_dot_2,true, true));
        TreTramDot.add(new StoryPage( R.drawable.tre_tram_dot_3,R.raw.tre_tram_dot_3,true, true));
        TreTramDot.add(new StoryPage( R.drawable.tre_tram_dot_4,R.raw.tre_tram_dot_4,true, true));
        TreTramDot.add(new StoryPage( R.drawable.tre_tram_dot_5,R.raw.tre_tram_dot_5,true, true));
        TreTramDot.add(new StoryPage( R.drawable.tre_tram_dot_6,R.raw.tre_tram_dot_6,true, true));
        TreTramDot.add(new StoryPage( R.drawable.tre_tram_dot_7,R.raw.tre_tram_dot_7,true, true));
        TreTramDot.add(new StoryPage( R.drawable.tre_tram_dot_8,R.raw.tre_tram_dot_8,true, true));
        TreTramDot.add(new StoryPage( R.drawable.tre_tram_dot_9,R.raw.tre_tram_dot_9,true, true));
        TreTramDot.add(new StoryPage( R.drawable.tre_tram_dot_10,R.raw.tre_tram_dot_10,true, true));
        TreTramDot.add(new StoryPage( R.drawable.tre_tram_dot_11,R.raw.tre_tram_dot_11,true, true));
        TreTramDot.add(new StoryPage( R.drawable.tre_tram_dot_12,R.raw.tre_tram_dot_12,true, true));
        dsTruyen.add(new Truyen(R.drawable.btn_tre_tram_dot,"Tre trăm đốt",TreTramDot));
        listAdapter.notifyDataSetChanged();
    }
}
