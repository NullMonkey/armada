package com.drifter.armada.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.drifter.armada.R;

/**
 * Created by Drifter on 2/8/2016.
 */

public class PlaceShip extends DialogFragment {
   /* @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.dialog_place_ship)
                .setPositiveButton(R.string.place, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // FIRE ZE MISSILES!
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_sample_dialog, container, false);
        getDialog().setTitle("Simple Dialog");

        Button dismiss = (Button) rootView.findViewById(R.id.dismiss);
        Button place = (Button) rootView.findViewById(R.id.place);





        dismiss.setOnClickListener(new View.OnClickListener() {

            @Override
           public void onClick(View v) {
                dismiss();
            }




        });


        return rootView;
    }


}
