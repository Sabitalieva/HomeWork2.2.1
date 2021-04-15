package com.company;

 class ThreeStorey extends TwoStorey implements Printable  {
    private int doors;

    public ThreeStorey(int doors,int windows,int rooms, String master){
        super(windows,rooms,master);
        this.doors = doors;
    }
    public int getDoors(){
        return doors;
    }

    @Override
    public void Print() {
        System.out.println("Doors- "+getDoors()+" Windows- "+super.getWindows()+" Rooms- "+super.getRooms()+" Master- "+super.getMaster());

    }
}
