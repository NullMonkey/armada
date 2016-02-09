package com.drifter.armada.model;


import android.graphics.Point;
import android.util.Log;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PlayerFleet {
    private Ship[] fleet = new Ship[5];

    private static final String TAG = PlayerFleet.class.getSimpleName();

    private Ship destroyer;
    private Ship cruiser;
    private Ship submarine;
    private Ship battleship;
    private Ship carrier;
    private int fltCnt;
    Set<Point> arraySet = new HashSet<>();

    public PlayerFleet(int i, Set<Point> coords, String shipType ) {
        //Point[] coords = {new Point(0,0), new Point(0,1), new Point(0,2)};
        Ship newship = new Ship("", coords);

        this.fleet[i] = newship;
        Log.d(TAG, "add cruiser to "+i);
        fltCnt=i;
        arraySet.addAll(coords);
/*       Iterator<Point> it = coords.iterator();
        while (it.hasNext()){
            arraySet.add(it.next());
            Log.d(TAG, "addArray :" + " " + it.next());

        }*/

    }

/*    public PlayerFleet(Ship[] fleet) {
        this.fleet = fleet;

    }*/

    public Set<Point> getFleet() {


        Log.d(TAG, "fleetcnt :" + fltCnt + " " + fleet[fltCnt].getShipCoords());
/*        Iterator<Point> it = fleet[fltCnt].getShipCoords().iterator();
        while (it.hasNext()){
            arraySet.add(it.next());
            //Log.d(TAG, "addArray :" + " " + it.next());

        }*/

        Log.d(TAG, "fleetArray :" + " " + arraySet.toString());

/*        for (int i=0; i <= fltCnt; i++){

            //arraySet.addAll(fleet[i].getShipCoords());
*//*
            Iterator<Point> iterator = shipChoords.iterator();
           Point thing;
        while (iterator.hasNext()){
           thing = iterator.next();

           Log.d(TAG, "ship choords :" );
           arraySet.add((Point) iterator.next());
           }
           shipChoords.add()*//*

*//*            for (int j=0; j < shipChoords.size; j++) {
                Log.d(TAG, "ship choords :" );
            }*//*
        }*/

        return arraySet;
    }

/*    public void setFleet(Ship[] fleet) {
        this.fleet = fleet;
    }*/


    public Ship getDestroyer() {
        return destroyer;
    }

    public void setDestroyer(Ship destroyer) {
        this.destroyer = destroyer;
    }

    public Ship getSubmarine() {
        return submarine;
    }

    public void setSubmarine(Ship submarine) {
        this.submarine = submarine;
    }

    public Ship getCruiser() {
        return cruiser;
    }

    public void setCruiser(Ship cruiser) {
        this.cruiser = cruiser;
    }

    public Ship getBattleship() {
        return battleship;
    }

    public void setBattleship(Ship battleship) {
        this.battleship = battleship;
    }

    public Ship getCarrier() {
        return carrier;
    }

    public void setCarrier(Ship carrier) {
        this.carrier = carrier;
    }

















}
