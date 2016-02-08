package com.drifter.armada.model;


import android.graphics.Point;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PlayerFleet {
    private Ship[] fleet = new Ship[1];



    private Ship destroyer;
    private Ship cruiser;
    private Ship submarine;
    private Ship battleship;
    private Ship carrier;


    public PlayerFleet(Set<Point> coords) {
        //Point[] coords = {new Point(0,0), new Point(0,1), new Point(0,2)};
        Ship cruiser = new Ship("cruiser", coords);
        this.fleet[0] = cruiser;


    }

/*    public PlayerFleet(Ship[] fleet) {
        this.fleet = fleet;

    }*/

    public Set<Point> getFleet() {
        Set<Point> arraySet = new HashSet<>();

        for (int i=0; i < fleet.length; i++){
            Set<Point> shipChoords = fleet[i].getShipCoords();
            Iterator iterator = shipChoords.iterator();
            while (iterator.hasNext()){
                arraySet.add((Point) iterator.next());
            }
            //shipChoords.add()
/*            for (int j=0; j < shipChoords.size(); j++) {

            }*/
        };

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
