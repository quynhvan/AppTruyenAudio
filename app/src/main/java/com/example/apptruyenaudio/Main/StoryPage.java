package com.example.apptruyenaudio.Main;

import android.os.Parcel;
import android.os.Parcelable;

public class StoryPage implements Parcelable {
    private int idImage;
    private int idAudio;
    private boolean isPlayLeft;
    private boolean isHomeLeft;

    public StoryPage(int idImage, int idAudio, boolean isPlayLeft, boolean isHomeLeft) {
        this.idImage = idImage;
        this.idAudio = idAudio;
        this.isPlayLeft = isPlayLeft;
        this.isHomeLeft = isHomeLeft;
    }


    protected StoryPage(Parcel in) {
        idImage = in.readInt();
        idAudio = in.readInt();
        isPlayLeft = in.readByte() != 0;
        isHomeLeft = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(idImage);
        dest.writeInt(idAudio);
        dest.writeByte((byte) (isPlayLeft ? 1 : 0));
        dest.writeByte((byte) (isHomeLeft ? 1 : 0));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<StoryPage> CREATOR = new Creator<StoryPage>() {
        @Override
        public StoryPage createFromParcel(Parcel in) {
            return new StoryPage(in);
        }

        @Override
        public StoryPage[] newArray(int size) {
            return new StoryPage[size];
        }
    };

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public int getIdAudio() {
        return idAudio;
    }

    public void setIdAudio(int idAudio) {
        this.idAudio = idAudio;
    }

    public boolean isPlayLeft() {
        return isPlayLeft;
    }

    public void setPlayLeft(boolean playLeft) {
        isPlayLeft = playLeft;
    }

    public boolean isHomeLeft() {
        return isHomeLeft;
    }

    public void setHomeLeft(boolean homeLeft) {
        isHomeLeft = homeLeft;
    }

    public static Creator<StoryPage> getCREATOR() {
        return CREATOR;
    }
}
