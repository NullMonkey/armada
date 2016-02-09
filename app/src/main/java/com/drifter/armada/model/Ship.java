package com.drifter.armada.model;


import android.graphics.Point;
import android.util.Log;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ship {

    private String  shipName;
    private static final String TAG = Ship.class.getSimpleName();

    private Cell[] shipCells;
   // private Point[] shipCoords;
    private Set<Point> shipCoords;
    private boolean   sunk;
    private int     shipLength;

    public Ship (String name, Set<Point> coords) {
        this.setShipCoords(coords);

        this.setShipName(name);
        this.setSunk(false);

       Log.d(TAG, "created ship at choords :" + coords.toString());
    }


    public Cell[] getShipCells() {
        return shipCells;
    }

    public void setShipCells(Cell[] shipCells) {
        this.shipCells = shipCells;
    }


    public Set<Point> getShipCoords() {
        //Set<Point> arraySet = new HashSet<>(Arrays.asList(shipCoords));
        Log.d(TAG, "ship choords :"+ shipCoords.toString());
        return shipCoords;
    }

    public void setShipCoords(Set<Point> shipCoords) {

        this.shipCoords = shipCoords;
    }




    public boolean isSunk() {
        return sunk;
    }

    public void setSunk(boolean sunk) {
        this.sunk = sunk;
    }







    public int getShipLength() {
        return shipLength;
    }

    public void setShipLength(int shipLength) {
        this.shipLength = shipLength;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }




}
