package com.drifter.armada;

import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.ArraySet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.GridLayout;
import android.widget.Switch;
import android.widget.Toast;

import com.drifter.armada.dialogs.PlaceShip;
import com.drifter.armada.model.PlayerFleet;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setup extends AppCompatActivity {

    Intent intent = getIntent();
    private static final String TAG = Setup.class.getSimpleName();

    // Ship ship = new Ship("Battleship", coords);*/

    private int destroyer = 2;
    private int cruiser =3;
    private int submarine = 3;
    private int battleship = 4;
    private int carrier = 5;
    private int shpCnt;

/*    Point[] coords = {new Point(0,0), new Point(0,1), new Point(0,2)};*/
    private PlayerFleet fleet;
    private Set<Point> hitBox;
    private Switch s;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        s = (Switch) findViewById(R.id.rotate);
        //grid layout
        GridLayout gameBoard = (GridLayout) findViewById(R.id.gameBoard);
        gameBoard.setColumnCount(10);
        gameBoard.setRowCount(10);
        getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        shpCnt=0;


/*        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    //do stuff when Switch is ON
                    Toast.makeText(getApplicationContext(), "The Switch is " + (isChecked),
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "The Switch is " + (isChecked),
                            Toast.LENGTH_SHORT).show();
                }
            }
        });*/



        for (int row = 0; row < gameBoard.getRowCount(); row++){
            for (int col = 0; col < gameBoard.getColumnCount(); col++){

                final Button chordButton = new Button(this);
                gameBoard.addView(chordButton);
                chordButton.getLayoutParams().width = 55;
                chordButton.getLayoutParams().height = 55;

                Point p =new Point(row,col);
                chordButton.setTag(p);


                // add click listener:
                chordButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View btn) {
                        Button butt = (Button) btn;
                        Point p = (Point) butt.getTag();
                        if (s.isChecked()) {
                            int hb = battleship;
                            // Point[] hitBox = new  Point[hb];
                            hitBox = new HashSet<Point>();
                            if (p.y <= 9 - hb) {

                                for (int i = 0; i < hb; i++) {
                                    hitBox.add(new Point(p.x, p.y + i));

                                    //chordButton.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                                }
                            } else {

                                for (int i = 0; i < hb; i++) {
                                    hitBox.add(new Point(p.x, p.y - i));

                                    //chordButton.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                                }
                                //Log.d(TAG, "You Clicked " +  p.toString() ); //+ shpCnt + " " + fleet.getFleet().toString());
                            }

                            if (shpCnt < 5) {

                                String shipType = "";
                                fleet = new PlayerFleet(shpCnt, hitBox, shipType);
                                Log.d(TAG, "shpcnt" + " " + shpCnt);
                                shpCnt++;

                            }
                            fleet.getFleet();

                            //Log.d(TAG, "fleet" + " " + fleet.getFleet().toString());// + fleet.getFleet().toString());

                        }

                        Log.d(TAG, "You Clicked " + p.toString());
                        Toast.makeText(getApplicationContext(), "The Switch is " + s.isChecked(),
                                Toast.LENGTH_LONG).show();



/*
                        FragmentManager fm = getFragmentManager();
                        PlaceShip Fire = new PlaceShip();
                        Fire.show(fm, "Sample Fragment");*/


//check for ship

/*                        if((fleet.getFleet()).contains(p)){
                            chordButton.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                        }else {
                            chordButton.getBackground().setColorFilter(Color.TRANSPARENT, PorterDuff.Mode.MULTIPLY);
                        }*/


                    }
                });
// end of click





            }


        }







    }

}
