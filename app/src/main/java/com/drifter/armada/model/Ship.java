package com.drifter.armada.model;


import android.graphics.Point;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ship {

    private String  shipName;


    private Cell[] shipCells;
   // private Point[] shipCoords;
    private Set<Point> shipCoords;
    private boolean   sunk;
    private int     shipLength;

    public Ship (String name, Set<Point> coords) {
        this.setShipCoords(coords);

        this.setShipName(name);
        this.setSunk(false);

    }


    public Cell[] getShipCells() {
        return shipCells;
    }

    public void setShipCells(Cell[] shipCells) {
        this.shipCells = shipCells;
    }


    public Set<Point> getShipCoords() {
        //Set<Point> arraySet = new HashSet<>(Arrays.asList(shipCoords));
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
