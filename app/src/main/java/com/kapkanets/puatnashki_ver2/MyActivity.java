package com.kapkanets.puatnashki_ver2;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;


public class MyActivity extends Activity implements View.OnClickListener {

    ImageButton imagebutton1, imagebutton2, imagebutton3, imagebutton4, imagebutton5, imagebutton6, imagebutton7, imagebutton8, imagebutton9;
    ImageButton imagebutton10, imagebutton11, imagebutton12, imagebutton13, imagebutton14, imagebutton15, imagebutton16, imageButtonStart;
    ImageButton imageDog, imageAlex, imageCat, imageGirl;
    TextView textRecord;

    ArrayList<Integer> etalonList = new ArrayList<Integer>();
    ArrayList<Integer> myList = new ArrayList<Integer>();
    ArrayList<ImageButton> buttons = new ArrayList<ImageButton>();
    ArrayList<Bitmap> pictures = new ArrayList<Bitmap>();
    HashSet<Integer> mySet = new HashSet<Integer>();
    Bitmap p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16;
    Bitmap a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
    Bitmap c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16;
    Bitmap g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12, g13, g14, g15, g16;
    int tmax = 0;
    int butInt;
    int buttonPic;
    long startTime;
    long timeSpent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);




        p1 = BitmapFactory.decodeResource(getResources(), R.drawable.p1);
        p2 = BitmapFactory.decodeResource(getResources(), R.drawable.p2);
        p3 = BitmapFactory.decodeResource(getResources(), R.drawable.p3);
        p4 = BitmapFactory.decodeResource(getResources(), R.drawable.p4);
        p5 = BitmapFactory.decodeResource(getResources(), R.drawable.p5);
        p6 = BitmapFactory.decodeResource(getResources(), R.drawable.p6);
        p7 = BitmapFactory.decodeResource(getResources(), R.drawable.p7);
        p8 = BitmapFactory.decodeResource(getResources(), R.drawable.p8);
        p9 = BitmapFactory.decodeResource(getResources(), R.drawable.p9);
        p10 = BitmapFactory.decodeResource(getResources(), R.drawable.p10);
        p11 = BitmapFactory.decodeResource(getResources(), R.drawable.p11);
        p12 = BitmapFactory.decodeResource(getResources(), R.drawable.p12);
        p13 = BitmapFactory.decodeResource(getResources(), R.drawable.p13);
        p14 = BitmapFactory.decodeResource(getResources(), R.drawable.p14);
        p15 = BitmapFactory.decodeResource(getResources(), R.drawable.p15);
        p16 = BitmapFactory.decodeResource(getResources(), R.drawable.p16);
        //фото Алекс
        a1 = BitmapFactory.decodeResource(getResources(), R.drawable.a1);
        a2 = BitmapFactory.decodeResource(getResources(), R.drawable.a2);
        a3 = BitmapFactory.decodeResource(getResources(), R.drawable.a3);
        a4 = BitmapFactory.decodeResource(getResources(), R.drawable.a4);
        a5 = BitmapFactory.decodeResource(getResources(), R.drawable.a5);
        a6 = BitmapFactory.decodeResource(getResources(), R.drawable.a6);
        a7 = BitmapFactory.decodeResource(getResources(), R.drawable.a7);
        a8 = BitmapFactory.decodeResource(getResources(), R.drawable.a8);
        a9 = BitmapFactory.decodeResource(getResources(), R.drawable.a9);
        a10 = BitmapFactory.decodeResource(getResources(), R.drawable.a10);
        a11 = BitmapFactory.decodeResource(getResources(), R.drawable.a11);
        a12 = BitmapFactory.decodeResource(getResources(), R.drawable.a12);
        a13 = BitmapFactory.decodeResource(getResources(), R.drawable.a13);
        a14 = BitmapFactory.decodeResource(getResources(), R.drawable.a14);
        a15 = BitmapFactory.decodeResource(getResources(), R.drawable.a15);
        a16 = BitmapFactory.decodeResource(getResources(), R.drawable.a16);
        //фото Cat
        c1 = BitmapFactory.decodeResource(getResources(), R.drawable.c1);
        c2 = BitmapFactory.decodeResource(getResources(), R.drawable.c2);
        c3 = BitmapFactory.decodeResource(getResources(), R.drawable.c3);
        c4 = BitmapFactory.decodeResource(getResources(), R.drawable.c4);
        c5 = BitmapFactory.decodeResource(getResources(), R.drawable.c5);
        c6 = BitmapFactory.decodeResource(getResources(), R.drawable.c6);
        c7 = BitmapFactory.decodeResource(getResources(), R.drawable.c7);
        c8 = BitmapFactory.decodeResource(getResources(), R.drawable.c8);
        c9 = BitmapFactory.decodeResource(getResources(), R.drawable.c9);
        c10 = BitmapFactory.decodeResource(getResources(), R.drawable.c10);
        c11 = BitmapFactory.decodeResource(getResources(), R.drawable.c11);
        c12 = BitmapFactory.decodeResource(getResources(), R.drawable.c12);
        c13 = BitmapFactory.decodeResource(getResources(), R.drawable.c13);
        c14 = BitmapFactory.decodeResource(getResources(), R.drawable.c14);
        c15 = BitmapFactory.decodeResource(getResources(), R.drawable.c15);
        c16 = BitmapFactory.decodeResource(getResources(), R.drawable.c16);
        //фото Алекс
        g1 = BitmapFactory.decodeResource(getResources(), R.drawable.g1);
        g2 = BitmapFactory.decodeResource(getResources(), R.drawable.g2);
        g3 = BitmapFactory.decodeResource(getResources(), R.drawable.g3);
        g4 = BitmapFactory.decodeResource(getResources(), R.drawable.g4);
        g5 = BitmapFactory.decodeResource(getResources(), R.drawable.g5);
        g6 = BitmapFactory.decodeResource(getResources(), R.drawable.g6);
        g7 = BitmapFactory.decodeResource(getResources(), R.drawable.g7);
        g8 = BitmapFactory.decodeResource(getResources(), R.drawable.g8);
        g9 = BitmapFactory.decodeResource(getResources(), R.drawable.g9);
        g10 = BitmapFactory.decodeResource(getResources(), R.drawable.g10);
        g11 = BitmapFactory.decodeResource(getResources(), R.drawable.g11);
        g12 = BitmapFactory.decodeResource(getResources(), R.drawable.g12);
        g13 = BitmapFactory.decodeResource(getResources(), R.drawable.g13);
        g14 = BitmapFactory.decodeResource(getResources(), R.drawable.g14);
        g15 = BitmapFactory.decodeResource(getResources(), R.drawable.g15);
        g16 = BitmapFactory.decodeResource(getResources(), R.drawable.g16);


        imageCat= (ImageButton) findViewById(R.id.imageCat);
        imageGirl = (ImageButton) findViewById(R.id.imageGirl);
        imageDog = (ImageButton) findViewById(R.id.imageDog);
        imageAlex = (ImageButton) findViewById(R.id.imageAlex);
        imageButtonStart = (ImageButton) findViewById(R.id.imageButtonStart);
        imagebutton1 = (ImageButton) findViewById(R.id.imageButton1);
        imagebutton2 = (ImageButton) findViewById(R.id.imageButton2);
        imagebutton3 = (ImageButton) findViewById(R.id.imageButton3);
        imagebutton4 = (ImageButton) findViewById(R.id.imageButton4);
        imagebutton5 = (ImageButton) findViewById(R.id.imageButton5);
        imagebutton6 = (ImageButton) findViewById(R.id.imageButton6);
        imagebutton7 = (ImageButton) findViewById(R.id.imageButton7);
        imagebutton8 = (ImageButton) findViewById(R.id.imageButton8);
        imagebutton9 = (ImageButton) findViewById(R.id.imageButton9);
        imagebutton10 = (ImageButton) findViewById(R.id.imageButton10);
        imagebutton11 = (ImageButton) findViewById(R.id.imageButton11);
        imagebutton12 = (ImageButton) findViewById(R.id.imageButton12);
        imagebutton13 = (ImageButton) findViewById(R.id.imageButton13);
        imagebutton14 = (ImageButton) findViewById(R.id.imageButton14);
        imagebutton15 = (ImageButton) findViewById(R.id.imageButton15);
        imagebutton16 = (ImageButton) findViewById(R.id.imageButton16);

        imageCat.setOnClickListener(this);
        imageGirl.setOnClickListener(this);
        imageDog.setOnClickListener(this);
        imageAlex.setOnClickListener(this);
        imageButtonStart.setOnClickListener(this);
        imagebutton1.setOnClickListener(this);
        imagebutton2.setOnClickListener(this);
        imagebutton3.setOnClickListener(this);
        imagebutton4.setOnClickListener(this);
        imagebutton5.setOnClickListener(this);
        imagebutton6.setOnClickListener(this);
        imagebutton7.setOnClickListener(this);
        imagebutton8.setOnClickListener(this);
        imagebutton9.setOnClickListener(this);
        imagebutton10.setOnClickListener(this);
        imagebutton11.setOnClickListener(this);
        imagebutton12.setOnClickListener(this);
        imagebutton13.setOnClickListener(this);
        imagebutton14.setOnClickListener(this);
        imagebutton15.setOnClickListener(this);
        imagebutton16.setOnClickListener(this);

        buttons.add(imagebutton1);
        buttons.add(imagebutton2);
        buttons.add(imagebutton3);
        buttons.add(imagebutton4);
        buttons.add(imagebutton5);
        buttons.add(imagebutton6);
        buttons.add(imagebutton7);
        buttons.add(imagebutton8);
        buttons.add(imagebutton9);
        buttons.add(imagebutton10);
        buttons.add(imagebutton11);
        buttons.add(imagebutton12);
        buttons.add(imagebutton13);
        buttons.add(imagebutton14);
        buttons.add(imagebutton15);
        buttons.add(imagebutton16);

        pictures.add(p1);
        pictures.add(p2);
        pictures.add(p3);
        pictures.add(p4);
        pictures.add(p5);
        pictures.add(p6);
        pictures.add(p7);
        pictures.add(p8);
        pictures.add(p9);
        pictures.add(p10);
        pictures.add(p11);
        pictures.add(p12);
        pictures.add(p13);
        pictures.add(p14);
        pictures.add(p15);
        pictures.add(p16);
        unClickable();

            Random rand = new Random();
            while (myList.size() != 16) {
                int c = rand.nextInt(16);
                if (mySet.add(c)) {
                    myList.add(c);
                }
            }
        // эталонный массив для проверки того что картинка собрана
        for (int i=0; i<16; i++) {
            etalonList.add(i);
        }

        Log.d("myList", String.valueOf(myList));

        for (int i = 0; i < myList.size(); i++) {
            // tmax = myList.get(i);
            if (myList.get(i) == 15) {
                tmax = i;
            }
        }
        Log.d("tmax", String.valueOf(tmax));


    }

    public void myTimer () {



        if (myList == etalonList) {
            timeSpent  = (System.currentTimeMillis() - startTime)/1000;
            textRecord.setText("Ваше время: \n"+timeSpent +" секунд");
        }

    }

    public void alexArray() {
        pictures.clear();
        pictures.add(a1);
        pictures.add(a2);
        pictures.add(a3);
        pictures.add(a4);
        pictures.add(a5);
        pictures.add(a6);
        pictures.add(a7);
        pictures.add(a8);
        pictures.add(a9);
        pictures.add(a10);
        pictures.add(a11);
        pictures.add(a12);
        pictures.add(a13);
        pictures.add(a14);
        pictures.add(a15);
        pictures.add(a16);
        for (int i=0; i<16; i++) {
        buttons.get(i).setImageBitmap(pictures.get(i));
        }
    }



    public void girlArray() {
        pictures.clear();
        pictures.add(g1);
        pictures.add(g2);
        pictures.add(g3);
        pictures.add(g4);
        pictures.add(g5);
        pictures.add(g6);
        pictures.add(g7);
        pictures.add(g8);
        pictures.add(g9);
        pictures.add(g10);
        pictures.add(g11);
        pictures.add(g12);
        pictures.add(g13);
        pictures.add(g14);
        pictures.add(g15);
        pictures.add(g16);
        for (int i=0; i<16; i++) {
            buttons.get(i).setImageBitmap(pictures.get(i));
        }
    }

    public void dogArray() {
        pictures.add(p1);
        pictures.add(p2);
        pictures.add(p3);
        pictures.add(p4);
        pictures.add(p5);
        pictures.add(p6);
        pictures.add(p7);
        pictures.add(p8);
        pictures.add(p9);
        pictures.add(p10);
        pictures.add(p11);
        pictures.add(p12);
        pictures.add(p13);
        pictures.add(p14);
        pictures.add(p15);
        pictures.add(p16);
        for (int i=0; i<16; i++) {
            buttons.get(i).setImageBitmap(pictures.get(i));
        }
    }


    public void catArray() {
        pictures.add(c1);
        pictures.add(c2);
        pictures.add(c3);
        pictures.add(c4);
        pictures.add(c5);
        pictures.add(c6);
        pictures.add(c7);
        pictures.add(c8);
        pictures.add(c9);
        pictures.add(c10);
        pictures.add(c11);
        pictures.add(c12);
        pictures.add(c13);
        pictures.add(c14);
        pictures.add(c15);
        pictures.add(c16);
        for (int i=0; i<16; i++) {
            buttons.get(i).setImageBitmap(pictures.get(i));
        }
    }


    public void unClickable() {
        imagebutton1.setClickable(false);
        imagebutton2.setClickable(false);
        imagebutton3.setClickable(false);
        imagebutton4.setClickable(false);
        imagebutton5.setClickable(false);
        imagebutton6.setClickable(false);
        imagebutton7.setClickable(false);
        imagebutton8.setClickable(false);
        imagebutton9.setClickable(false);
        imagebutton10.setClickable(false);
        imagebutton11.setClickable(false);
        imagebutton12.setClickable(false);
        imagebutton13.setClickable(false);
        imagebutton14.setClickable(false);
        imagebutton15.setClickable(false);
        imagebutton16.setClickable(false);
    }


    public void blockUnblockButtons() {
        if (tmax == 0) {
//кнопки разблокируются
            imagebutton2.setClickable(true);
            imagebutton5.setClickable(true);
//кнопки блокируются
            imagebutton1.setClickable(false);
            imagebutton3.setClickable(false);
            imagebutton4.setClickable(false);
            imagebutton6.setClickable(false);
            imagebutton7.setClickable(false);
            imagebutton8.setClickable(false);
            imagebutton9.setClickable(false);
            imagebutton10.setClickable(false);
            imagebutton11.setClickable(false);
            imagebutton12.setClickable(false);
            imagebutton13.setClickable(false);
            imagebutton14.setClickable(false);
            imagebutton15.setClickable(false);
            imagebutton16.setClickable(false);
        }
        if (tmax == 1) {
//кнопки разблокируются
            imagebutton1.setClickable(true);
            imagebutton6.setClickable(true);
            imagebutton3.setClickable(true);
//кнопки блокируются
            imagebutton2.setClickable(false);
            imagebutton4.setClickable(false);
            imagebutton5.setClickable(false);
            imagebutton7.setClickable(false);
            imagebutton8.setClickable(false);
            imagebutton9.setClickable(false);
            imagebutton10.setClickable(false);
            imagebutton11.setClickable(false);
            imagebutton12.setClickable(false);
            imagebutton13.setClickable(false);
            imagebutton14.setClickable(false);
            imagebutton15.setClickable(false);
            imagebutton16.setClickable(false);
        }
        if (tmax == 2) {
//кнопки разблокируются
            imagebutton2.setClickable(true);
            imagebutton4.setClickable(true);
            imagebutton7.setClickable(true);
//кнопки блокируются
            imagebutton1.setClickable(false);
            imagebutton3.setClickable(false);
            imagebutton5.setClickable(false);
            imagebutton6.setClickable(false);
            imagebutton8.setClickable(false);
            imagebutton9.setClickable(false);
            imagebutton10.setClickable(false);
            imagebutton11.setClickable(false);
            imagebutton12.setClickable(false);
            imagebutton13.setClickable(false);
            imagebutton14.setClickable(false);
            imagebutton15.setClickable(false);
            imagebutton16.setClickable(false);
        }
        if (tmax == 3) {
//кнопки разблокируются
            imagebutton3.setClickable(true);
            imagebutton8.setClickable(true);
//кнопки блокируются
            imagebutton1.setClickable(false);
            imagebutton2.setClickable(false);
            imagebutton4.setClickable(false);
            imagebutton5.setClickable(false);
            imagebutton6.setClickable(false);
            imagebutton7.setClickable(false);
            imagebutton9.setClickable(false);
            imagebutton10.setClickable(false);
            imagebutton11.setClickable(false);
            imagebutton12.setClickable(false);
            imagebutton13.setClickable(false);
            imagebutton14.setClickable(false);
            imagebutton15.setClickable(false);
            imagebutton16.setClickable(false);
        }
        if (tmax == 4) {
//кнопки разблокируются
            imagebutton1.setClickable(true);
            imagebutton6.setClickable(true);
            imagebutton9.setClickable(true);
//кнопки блокируются
            imagebutton2.setClickable(false);
            imagebutton3.setClickable(false);
            imagebutton4.setClickable(false);
            imagebutton5.setClickable(false);
            imagebutton7.setClickable(false);
            imagebutton8.setClickable(false);
            imagebutton10.setClickable(false);
            imagebutton11.setClickable(false);
            imagebutton12.setClickable(false);
            imagebutton13.setClickable(false);
            imagebutton14.setClickable(false);
            imagebutton15.setClickable(false);
            imagebutton16.setClickable(false);
        }
        if (tmax == 5) {
//кнопки разблокируются
            imagebutton2.setClickable(true);
            imagebutton5.setClickable(true);
            imagebutton7.setClickable(true);
            imagebutton10.setClickable(true);
//кнопки блокируются
            imagebutton1.setClickable(false);
            imagebutton3.setClickable(false);
            imagebutton4.setClickable(false);
            imagebutton6.setClickable(false);
            imagebutton8.setClickable(false);
            imagebutton9.setClickable(false);
            imagebutton11.setClickable(false);
            imagebutton12.setClickable(false);
            imagebutton13.setClickable(false);
            imagebutton14.setClickable(false);
            imagebutton15.setClickable(false);
            imagebutton16.setClickable(false);
        }
        if (tmax == 6) {
//кнопки разблокируются
            imagebutton3.setClickable(true);
            imagebutton6.setClickable(true);
            imagebutton8.setClickable(true);
            imagebutton11.setClickable(true);
//кнопки блокируются
            imagebutton1.setClickable(false);
            imagebutton2.setClickable(false);
            imagebutton4.setClickable(false);
            imagebutton5.setClickable(false);
            imagebutton7.setClickable(false);
            imagebutton9.setClickable(false);
            imagebutton10.setClickable(false);
            imagebutton12.setClickable(false);
            imagebutton13.setClickable(false);
            imagebutton14.setClickable(false);
            imagebutton15.setClickable(false);
            imagebutton16.setClickable(false);
        }
        if (tmax == 7) {
//кнопки разблокируются
            imagebutton4.setClickable(true);
            imagebutton7.setClickable(true);
            imagebutton12.setClickable(true);
//кнопки блокируются
            imagebutton1.setClickable(false);
            imagebutton2.setClickable(false);
            imagebutton3.setClickable(false);
            imagebutton5.setClickable(false);
            imagebutton6.setClickable(false);
            imagebutton8.setClickable(false);
            imagebutton9.setClickable(false);
            imagebutton10.setClickable(false);
            imagebutton11.setClickable(false);
            imagebutton13.setClickable(false);
            imagebutton14.setClickable(false);
            imagebutton15.setClickable(false);
            imagebutton16.setClickable(false);
        }
        if (tmax == 8) {
//кнопки разблокируются
            imagebutton5.setClickable(true);
            imagebutton10.setClickable(true);
            imagebutton13.setClickable(true);
//кнопки блокируются
            imagebutton1.setClickable(false);
            imagebutton2.setClickable(false);
            imagebutton3.setClickable(false);
            imagebutton4.setClickable(false);
            imagebutton6.setClickable(false);
            imagebutton7.setClickable(false);
            imagebutton8.setClickable(false);
            imagebutton9.setClickable(false);
            imagebutton11.setClickable(false);
            imagebutton12.setClickable(false);
            imagebutton14.setClickable(false);
            imagebutton15.setClickable(false);
            imagebutton16.setClickable(false);
        }
        if (tmax == 9) {
//кнопки разблокируются
            imagebutton6.setClickable(true);
            imagebutton9.setClickable(true);
            imagebutton11.setClickable(true);
            imagebutton14.setClickable(true);
//кнопки блокируются
            imagebutton1.setClickable(false);
            imagebutton2.setClickable(false);
            imagebutton3.setClickable(false);
            imagebutton4.setClickable(false);
            imagebutton5.setClickable(false);
            imagebutton7.setClickable(false);
            imagebutton8.setClickable(false);
            imagebutton10.setClickable(false);
            imagebutton12.setClickable(false);
            imagebutton13.setClickable(false);
            imagebutton15.setClickable(false);
            imagebutton16.setClickable(false);
        }
        if (tmax == 10) {
//кнопки разблокируются
            imagebutton7.setClickable(true);
            imagebutton10.setClickable(true);
            imagebutton12.setClickable(true);
            imagebutton15.setClickable(true);
//кнопки блокируются
            imagebutton1.setClickable(false);
            imagebutton2.setClickable(false);
            imagebutton3.setClickable(false);
            imagebutton4.setClickable(false);
            imagebutton5.setClickable(false);
            imagebutton6.setClickable(false);
            imagebutton8.setClickable(false);
            imagebutton9.setClickable(false);
            imagebutton11.setClickable(false);
            imagebutton13.setClickable(false);
            imagebutton14.setClickable(false);
            imagebutton16.setClickable(false);
        }
        if (tmax == 11) {
//кнопки разблокируются
            imagebutton8.setClickable(true);
            imagebutton11.setClickable(true);
            imagebutton16.setClickable(true);
//кнопки блокируются
            imagebutton1.setClickable(false);
            imagebutton2.setClickable(false);
            imagebutton3.setClickable(false);
            imagebutton4.setClickable(false);
            imagebutton5.setClickable(false);
            imagebutton6.setClickable(false);
            imagebutton7.setClickable(false);
            imagebutton9.setClickable(false);
            imagebutton10.setClickable(false);
            imagebutton12.setClickable(false);
            imagebutton13.setClickable(false);
            imagebutton14.setClickable(false);
            imagebutton15.setClickable(false);
        }
        if (tmax == 12) {
//кнопки разблокируются
            imagebutton9.setClickable(true);
            imagebutton14.setClickable(true);

//кнопки блокируются
            imagebutton1.setClickable(false);
            imagebutton2.setClickable(false);
            imagebutton3.setClickable(false);
            imagebutton4.setClickable(false);
            imagebutton5.setClickable(false);
            imagebutton6.setClickable(false);
            imagebutton7.setClickable(false);
            imagebutton8.setClickable(false);
            imagebutton10.setClickable(false);
            imagebutton11.setClickable(false);
            imagebutton12.setClickable(false);
            imagebutton13.setClickable(false);
            imagebutton15.setClickable(false);
            imagebutton16.setClickable(false);

        }
        if (tmax == 13) {
//кнопки разблокируются
            imagebutton10.setClickable(true);
            imagebutton13.setClickable(true);
            imagebutton15.setClickable(true);
//кнопки блокируются
            imagebutton1.setClickable(false);
            imagebutton2.setClickable(false);
            imagebutton3.setClickable(false);
            imagebutton4.setClickable(false);
            imagebutton5.setClickable(false);
            imagebutton6.setClickable(false);
            imagebutton7.setClickable(false);
            imagebutton8.setClickable(false);
            imagebutton9.setClickable(false);
            imagebutton11.setClickable(false);
            imagebutton12.setClickable(false);
            imagebutton14.setClickable(false);
            imagebutton16.setClickable(false);
        }
        if (tmax == 14) {
//кнопки разблокируются
            imagebutton11.setClickable(true);
            imagebutton14.setClickable(true);
            imagebutton16.setClickable(true);
//кнопки блокируются
            imagebutton1.setClickable(false);
            imagebutton2.setClickable(false);
            imagebutton3.setClickable(false);
            imagebutton4.setClickable(false);
            imagebutton5.setClickable(false);
            imagebutton6.setClickable(false);
            imagebutton7.setClickable(false);
            imagebutton8.setClickable(false);
            imagebutton9.setClickable(false);
            imagebutton10.setClickable(false);
            imagebutton12.setClickable(false);
            imagebutton15.setClickable(false);
            imagebutton13.setClickable(false);

        }
        if (tmax == 15) {
//кнопки разблокируются
            imagebutton12.setClickable(true);
            imagebutton15.setClickable(true);

//кнопки блокируются
            imagebutton1.setClickable(false);
            imagebutton2.setClickable(false);
            imagebutton3.setClickable(false);
            imagebutton4.setClickable(false);
            imagebutton5.setClickable(false);
            imagebutton6.setClickable(false);
            imagebutton7.setClickable(false);
            imagebutton8.setClickable(false);
            imagebutton9.setClickable(false);
            imagebutton10.setClickable(false);
            imagebutton11.setClickable(false);
            imagebutton13.setClickable(false);
            imagebutton14.setClickable(false);
            imagebutton16.setClickable(false);
        }


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageDog:
                pictures.clear();
                dogArray();
                myTimer ();
                break;
            case R.id.imageAlex:
                pictures.clear();
                alexArray();
                myTimer ();
                break;
            case R.id.imageCat:
                pictures.clear();
                catArray();
                myTimer ();
                break;
            case R.id.imageGirl:
                pictures.clear();
                girlArray();
                myTimer ();
                break;

            case R.id.imageButtonStart:
                startTime = System.currentTimeMillis();
                blockUnblockButtons();
                for (int i = 0; i < 16; i++) {
                    buttons.get(i).setImageBitmap(pictures.get(myList.get(i)));
                }
                Log.d("mylist", String.valueOf(myList));
                break;
            case R.id.imageButton1:
                blockUnblockButtons();
                buttonPic = imagebutton1.getId();
                Log.d("imagebutton1", String.valueOf(buttonPic));
                if (tmax == 1) {
                    buttons.get(1).setImageBitmap(pictures.get(myList.get(0)));
                    buttons.get(0).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 1, 0);
                    tmax = 0;
                }
                if (tmax == 4) {
                    buttons.get(4).setImageBitmap(pictures.get(myList.get(0)));
                    buttons.get(0).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 4, 0);
                    tmax = 0;
                }
                blockUnblockButtons();
                break;
            case R.id.imageButton2:
                blockUnblockButtons();
                buttonPic = imagebutton2.getId();
                Log.d("imagebutton2", String.valueOf(buttonPic));
                if (tmax == 0) {
                    buttons.get(0).setImageBitmap(pictures.get(myList.get(1)));
                    buttons.get(1).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 0, 1);
                    tmax = 1;
                }
                if (tmax == 5) {
                    buttons.get(5).setImageBitmap(pictures.get(myList.get(1)));
                    buttons.get(1).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 5, 1);
                    tmax = 1;
                }
                if (tmax == 2) {
                    buttons.get(2).setImageBitmap(pictures.get(myList.get(1)));
                    buttons.get(1).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 2, 1);
                    tmax = 1;
                }
                blockUnblockButtons();
                break;
            case R.id.imageButton3:
                blockUnblockButtons();
                buttonPic = imagebutton3.getId();
                Log.d("imagebutton3", String.valueOf(buttonPic));
                if (tmax == 1) {
                    buttons.get(1).setImageBitmap(pictures.get(myList.get(2)));
                    buttons.get(2).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 1, 2);
                    tmax = 2;
                }
                if (tmax == 3) {
                    buttons.get(3).setImageBitmap(pictures.get(myList.get(2)));
                    buttons.get(2).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 3, 2);
                    tmax = 2;
                }
                if (tmax == 6) {
                    buttons.get(6).setImageBitmap(pictures.get(myList.get(2)));
                    buttons.get(2).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 6, 2);
                    tmax = 2;
                }
                blockUnblockButtons();
                break;
            case R.id.imageButton4:
                blockUnblockButtons();
                buttonPic = imagebutton4.getId();
                Log.d("imagebutton4", String.valueOf(buttonPic));
                if (tmax == 2) {
                    buttons.get(2).setImageBitmap(pictures.get(myList.get(3)));
                    buttons.get(3).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 2, 3);
                    tmax = 3;
                }
                if (tmax == 7) {
                    buttons.get(7).setImageBitmap(pictures.get(myList.get(3)));
                    buttons.get(3).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 7, 3);
                    tmax = 3;
                }
                blockUnblockButtons();
                break;
            case R.id.imageButton5:
                blockUnblockButtons();
                buttonPic = imagebutton5.getId();
                Log.d("imagebutton5", String.valueOf(buttonPic));
                if (tmax == 0) {
                    buttons.get(0).setImageBitmap(pictures.get(myList.get(4)));
                    buttons.get(4).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 0, 4);
                    tmax = 4;
                }
                if (tmax == 5) {
                    buttons.get(5).setImageBitmap(pictures.get(myList.get(4)));
                    buttons.get(4).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 5, 4);
                    tmax = 4;
                }
                if (tmax == 8) {
                    buttons.get(8).setImageBitmap(pictures.get(myList.get(4)));
                    buttons.get(4).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 8, 4);
                    tmax = 4;
                }
                blockUnblockButtons();
                break;
            case R.id.imageButton6:
                blockUnblockButtons();
                buttonPic = imagebutton6.getId();
                Log.d("imagebutton6", String.valueOf(buttonPic));
                if (tmax == 1) {
                    buttons.get(1).setImageBitmap(pictures.get(myList.get(5)));
                    buttons.get(5).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 1, 5);
                    tmax = 5;
                }
                if (tmax == 4) {
                    buttons.get(4).setImageBitmap(pictures.get(myList.get(5)));
                    buttons.get(5).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 4, 5);
                    tmax = 5;
                }
                if (tmax == 6) {
                    buttons.get(6).setImageBitmap(pictures.get(myList.get(5)));
                    buttons.get(5).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 6, 5);
                    tmax = 5;
                }
                if (tmax == 9) {
                    buttons.get(9).setImageBitmap(pictures.get(myList.get(5)));
                    buttons.get(5).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 9, 5);
                    tmax = 5;
                }
                blockUnblockButtons();
                break;
            case R.id.imageButton7:
                blockUnblockButtons();
                buttonPic = imagebutton7.getId();
                Log.d("imagebutton7", String.valueOf(buttonPic));
                if (tmax == 2) {
                    buttons.get(2).setImageBitmap(pictures.get(myList.get(6)));
                    buttons.get(6).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 2, 6);
                    tmax = 6;
                }
                if (tmax == 5) {
                    buttons.get(5).setImageBitmap(pictures.get(myList.get(6)));
                    buttons.get(6).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 5, 6);
                    tmax = 6;
                }
                if (tmax == 7) {
                    buttons.get(7).setImageBitmap(pictures.get(myList.get(6)));
                    buttons.get(6).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 7, 6);
                    tmax = 6;
                }
                if (tmax == 10) {
                    buttons.get(10).setImageBitmap(pictures.get(myList.get(6)));
                    buttons.get(6).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 10, 6);
                    tmax = 6;
                }
                blockUnblockButtons();
                break;
            case R.id.imageButton8:
                blockUnblockButtons();
                buttonPic = imagebutton8.getId();
                Log.d("imagebutton8", String.valueOf(buttonPic));
                if (tmax == 3) {
                    buttons.get(3).setImageBitmap(pictures.get(myList.get(7)));
                    buttons.get(7).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 3, 7);
                    tmax = 7;
                }
                if (tmax == 6) {
                    buttons.get(6).setImageBitmap(pictures.get(myList.get(7)));
                    buttons.get(7).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 6, 7);
                    tmax = 7;
                }
                if (tmax == 11) {
                    buttons.get(11).setImageBitmap(pictures.get(myList.get(7)));
                    buttons.get(7).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 11, 7);
                    tmax = 7;
                }
                blockUnblockButtons();
                break;
            case R.id.imageButton9:
                blockUnblockButtons();
                buttonPic = imagebutton9.getId();
                Log.d("imagebutton9", String.valueOf(buttonPic));
                if (tmax == 4) {
                    buttons.get(4).setImageBitmap(pictures.get(myList.get(8)));
                    buttons.get(8).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 4, 8);
                    tmax = 8;
                }
                if (tmax == 9) {
                    buttons.get(9).setImageBitmap(pictures.get(myList.get(8)));
                    buttons.get(8).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 9, 8);
                    tmax = 8;
                }
                if (tmax == 12) {
                    buttons.get(12).setImageBitmap(pictures.get(myList.get(8)));
                    buttons.get(8).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 12, 8);
                    tmax = 8;
                }
                blockUnblockButtons();
                break;
            case R.id.imageButton10:
                blockUnblockButtons();
                buttonPic = imagebutton10.getId();
                Log.d("imagebutton10", String.valueOf(buttonPic));
                if (tmax == 5) {
                    buttons.get(5).setImageBitmap(pictures.get(myList.get(9)));
                    buttons.get(9).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 5, 9);
                    tmax = 9;
                }
                if (tmax == 8) {
                    buttons.get(8).setImageBitmap(pictures.get(myList.get(9)));
                    buttons.get(9).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 8, 9);
                    tmax = 9;
                }
                if (tmax == 10) {
                    buttons.get(10).setImageBitmap(pictures.get(myList.get(9)));
                    buttons.get(9).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 10, 9);
                    tmax = 9;
                }
                if (tmax == 13) {
                    buttons.get(13).setImageBitmap(pictures.get(myList.get(9)));
                    buttons.get(9).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 13, 9);
                    tmax = 9;
                }
                blockUnblockButtons();
                break;
            case R.id.imageButton11:
                blockUnblockButtons();
                buttonPic = imagebutton11.getId();
                Log.d("imagebutton11", String.valueOf(buttonPic));
                if (tmax == 6) {
                    buttons.get(6).setImageBitmap(pictures.get(myList.get(10)));
                    buttons.get(10).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 6, 10);
                    tmax = 10;
                }
                if (tmax == 9) {
                    buttons.get(9).setImageBitmap(pictures.get(myList.get(10)));
                    buttons.get(10).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 9, 10);
                    tmax = 10;
                }
                if (tmax == 11) {
                    buttons.get(11).setImageBitmap(pictures.get(myList.get(10)));
                    buttons.get(10).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 11, 10);
                    tmax = 10;
                }
                if (tmax == 14) {
                    buttons.get(14).setImageBitmap(pictures.get(myList.get(10)));
                    buttons.get(10).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 14, 10);
                    tmax = 10;
                }
                blockUnblockButtons();
                break;
            case R.id.imageButton12:
                blockUnblockButtons();
                buttonPic = imagebutton12.getId();
                Log.d("imagebutton12", String.valueOf(buttonPic));
                if (tmax == 10) {
                    buttons.get(10).setImageBitmap(pictures.get(myList.get(11)));
                    buttons.get(11).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 10, 11);
                    tmax = 11;
                }
                if (tmax == 7) {
                    buttons.get(7).setImageBitmap(pictures.get(myList.get(11)));
                    buttons.get(11).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 7, 11);
                    tmax = 11;
                }
                if (tmax == 15) {
                    buttons.get(15).setImageBitmap(pictures.get(myList.get(11)));
                    buttons.get(11).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 15, 11);
                    tmax = 11;
                }
                blockUnblockButtons();
                break;
            case R.id.imageButton13:
                blockUnblockButtons();
                buttonPic = imagebutton13.getId();
                Log.d("imagebutton13", String.valueOf(buttonPic));
                if (tmax == 8) {
                    buttons.get(8).setImageBitmap(pictures.get(myList.get(12)));
                    buttons.get(12).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 8, 12);
                    tmax = 12;
                }
                if (tmax == 13) {
                    buttons.get(13).setImageBitmap(pictures.get(myList.get(12)));
                    buttons.get(12).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 13, 12);
                    tmax = 12;
                }
                blockUnblockButtons();
                break;
            case R.id.imageButton14:
                blockUnblockButtons();
                buttonPic = imagebutton14.getId();
                Log.d("imagebutton14", String.valueOf(buttonPic));
                if (tmax == 9) {
                    buttons.get(9).setImageBitmap(pictures.get(myList.get(13)));
                    buttons.get(13).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 9, 13);
                    tmax = 13;
                }
                if (tmax == 12) {
                    buttons.get(12).setImageBitmap(pictures.get(myList.get(13)));
                    buttons.get(13).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 12, 13);
                    tmax = 13;
                }
                if (tmax == 14) {
                    buttons.get(14).setImageBitmap(pictures.get(myList.get(13)));
                    buttons.get(13).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 14, 13);
                    tmax = 13;
                }
                blockUnblockButtons();
                break;
            case R.id.imageButton15:
                blockUnblockButtons();
                buttonPic = imagebutton15.getId();
                Log.d("imagebutton15", String.valueOf(buttonPic));
                if (tmax == 10) {
                    buttons.get(10).setImageBitmap(pictures.get(myList.get(14)));
                    buttons.get(14).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 10, 14);
                    tmax = 14;
                }
                if (tmax == 13) {
                    buttons.get(13).setImageBitmap(pictures.get(myList.get(14)));
                    buttons.get(14).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 13, 14);
                    tmax = 14;
                }
                if (tmax == 15) {
                    buttons.get(15).setImageBitmap(pictures.get(myList.get(14)));
                    buttons.get(14).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 15, 14);
                    tmax = 14;
                }
                blockUnblockButtons();
                break;
            case R.id.imageButton16:
                blockUnblockButtons();
                buttonPic = imagebutton16.getId();
                Log.d("imagebutton16", String.valueOf(buttonPic));
                if (tmax == 11) {
                    buttons.get(11).setImageBitmap(pictures.get(myList.get(15)));
                    buttons.get(15).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 11, 15);
                    tmax = 15;
                }
                if (tmax == 14) {
                    buttons.get(14).setImageBitmap(pictures.get(myList.get(15)));
                    buttons.get(15).setImageBitmap(pictures.get(15));
                    Collections.swap(myList, 14, 15);
                    tmax = 15;
                }
                blockUnblockButtons();
                break;
        }


    }


}
