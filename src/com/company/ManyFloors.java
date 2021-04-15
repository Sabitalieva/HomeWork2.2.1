package com.company;

import java.util.TooManyListenersException;

public class ManyFloors extends ThreeStorey implements Printable {
    private int floor;

    public ManyFloors(int floor,int doors,int windows,int rooms, String master ){
        super(doors,windows,rooms,master);
        this.floor = floor;
    }
    public int getFloor(){
        return floor;
    }

    @Override
    public void Print() {
        System.out.println("Floor- "+getFloor()+" Doors- "+super.getDoors()+" Windows- "+"Rooms- "+super.getRooms()+" Master- "+super.getMaster());
    }
}
