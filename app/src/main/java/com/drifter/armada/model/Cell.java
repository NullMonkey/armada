package com.drifter.armada.model;


import android.graphics.Point;

public class Cell {

    private boolean player;
    private boolean enemy;
    private boolean miss;
    private Point location;

    public Cell(boolean player, Point location, boolean enemy) {
        this.player = player;
        this.location = location;
        this.miss = false;
        this.enemy = enemy;
    }

    public boolean isPlayer() {
        return player;
    }

    public void setPlayer(boolean player) {
        this.player = player;
    }


    public boolean isEnemy() {
        return enemy;
    }

    public void setEnemy(boolean enemy) {
        this.enemy = enemy;
    }


    public boolean isMiss() {
        return miss;
    }

    public void setMiss(boolean miss) {
        this.miss = miss;
    }


    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }






}
