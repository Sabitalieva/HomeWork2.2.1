package com.company;

import java.util.SplittableRandom;

public class TwoStorey extends Home implements Printable{
    private int windows;

    public TwoStorey(int windows,int rooms, String master ){
        super (rooms,master);
        this.windows = windows;


    }
    public int getWindows(){
        return windows;
    }

    @Override
    public void Print() {
        System.out.println("Rooms- "+super.getRooms()+"Master- "+super.getMaster()+"Windows-" + getWindows());
    }
}
