package com.bearabitcf.dialogfragment;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ObjectAnimator.ofFloat(getWindow().getDecorView(),"translationY",0,500).start();
    }

    public void dialog(View v) {
//        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.BearDialog);
//        AlertDialog dialog = builder.create();
//        dialog.getWindow().getDecorView().findViewById(android.R.id.content).setBackgroundColor(0x00000000);
//        dialog.setView(View.inflate(this, R.layout.fragment_dialog, null));
////        builder.setTitle("我能跟着动么");
////        builder.setPositiveButton("撒", new DialogInterface.OnClickListener() {
////            @Override
////            public void onClick(DialogInterface dialogInterface, int i) {
////
////            }
////        });
//        dialog.show();

        JumpBearDialogFragment jumpBear = new JumpBearDialogFragment();
        jumpBear.show(getFragmentManager(), "JumpBear");
    }

    public void embedded(View view) {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        ft.add(R.id.container, new JumpBearDialogFragment()).commit();
    }
}
