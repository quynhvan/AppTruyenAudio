package com.example.apptruyenaudio.Main;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Truyen implements Parcelable {
    private String title;
    private int IdImage;
    private ArrayList<StoryPage> listPage;


    public Truyen( int idImage, String title,ArrayList<StoryPage> listPage) {
        this.title = title;
        IdImage = idImage;
        this.listPage = listPage;
    }

    protected Truyen(Parcel in) {
        title = in.readString();
        IdImage = in.readInt();
        listPage = in.createTypedArrayList(StoryPage.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeInt(IdImage);
        dest.writeTypedList(listPage);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Truyen> CREATOR = new Creator<Truyen>() {
        @Override
        public Truyen createFromParcel(Parcel in) {
            return new Truyen(in);
        }

        @Override
        public Truyen[] newArray(int size) {
            return new Truyen[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIdImage() {
        return IdImage;
    }

    public void setIdImage(int idImage) {
        IdImage = idImage;
    }

    public ArrayList<StoryPage> getListPage() {
        return listPage;
    }

    public void setListPage(ArrayList<StoryPage> listPage) {
        this.listPage = listPage;
    }
}
