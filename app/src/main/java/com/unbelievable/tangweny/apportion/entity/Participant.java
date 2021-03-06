package com.unbelievable.tangweny.apportion.entity;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by tangweny on 2016/2/24.
 */
public class Participant implements Parcelable {

    private int parId;
    private String parTime;
    private String parName;

    public int getParId() {
        return parId;
    }

    public void setParId(int parId) {
        this.parId = parId;
    }

    public String getParTime() {
        return parTime;
    }

    public void setParTime(String parTime) {
        this.parTime = parTime;
    }

    public String getParName() {
        return parName;
    }

    public void setParName(String parName) {
        this.parName = parName;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(parId);
        dest.writeString(parTime);
        dest.writeString(parName);
    }
    public static final Creator<Participant> CREATOR = new Creator<Participant>(){
        public Participant createFromParcel(Parcel in)
        {
            return new Participant(in);
        }

        public Participant[] newArray(int size)
        {
            return new Participant[size];
        }
    };
    private Participant(Parcel in)
    {
        this.parId = in.readInt();
        this.parTime = in.readString();
        this.parName = in.readString();
    }
    public Participant(){

    }
}
