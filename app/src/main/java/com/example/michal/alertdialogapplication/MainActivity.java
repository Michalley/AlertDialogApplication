package com.example.michal.alertdialogapplication;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AlertDialog ad1,ad2,ad3,ad4,ad5;
    LinearLayout ly;
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ly=(LinearLayout)findViewById(R.id.ly);


        AlertDialog.Builder adb1;
        adb1 = new AlertDialog.Builder(this);
        adb1.setMessage("You pressed the button");
        ad1 = adb1.create();


        AlertDialog.Builder adb2;
        adb2=new AlertDialog.Builder(this);
        adb2.setMessage("You pressed the button");
        adb2.setIcon(R.drawable.ic_launcher_foreground);
        ad2=adb2.create();


        AlertDialog.Builder adb3;
        adb3 = new AlertDialog.Builder(this);
        adb3.setMessage("You pressed the button");
        adb3.setIcon(R.drawable.ic_launcher_foreground);
        adb3.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) { }});
        ad3=adb3.create();


        AlertDialog.Builder adb4;
        adb4 = new AlertDialog.Builder(this);
        adb4.setMessage("Change Background Color");
        adb4.setPositiveButton("Change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                x=(int) (Math.random()*5+1);
                if (x==1){
                    ly.setBackgroundColor(Color.RED);}
                    if (x==2){
                    ly.setBackgroundColor(Color.GREEN);}
                    if (x==3){
                    ly.setBackgroundColor(Color.BLACK);}
                    if (x==4){
                    ly.setBackgroundColor(Color.CYAN);}
                    if (x==5){
                    ly.setBackgroundColor(Color.MAGENTA);}

            }
        });
        adb4.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) { }});
        ad4=adb4.create();

        AlertDialog.Builder adb5;
        adb5 = new AlertDialog.Builder(this);
        adb5.setMessage("Change Background Color");
        adb5.setPositiveButton("Change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                x=(int) (Math.random()*5+1);
                if (x==1){
                    ly.setBackgroundColor(Color.RED);}
                if (x==2){
                    ly.setBackgroundColor(Color.GREEN);}
                if (x==3){
                    ly.setBackgroundColor(Color.BLACK);}
                if (x==4){
                    ly.setBackgroundColor(Color.CYAN);}
                if (x==5){
                    ly.setBackgroundColor(Color.MAGENTA);}

            }
        });
        adb5.setNegativeButton("Clear", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ly.setBackgroundColor(Color.WHITE);
            }
        });
        adb5.setNeutralButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) { }});
        ad5=adb5.create();
    }

    public void btn1(View view){
        ad1.show();
    }

    public void btn2(View view) {
        ad2.show();
    }

    public void btn3(View view) {
        ad3.show();
    }

    public void btn4(View view) {
        ad4.show();
    }

    public void btn5(View view) {
        ad5.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Credits");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this,"Application Of Michal Leyovich",Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }
}
