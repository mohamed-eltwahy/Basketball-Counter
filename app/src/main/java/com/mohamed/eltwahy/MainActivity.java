package com.mohamed.eltwahy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView resaultA,resaultB;
    Button A3,A2,A1,B3,B2,B1,reset;
    int teamA=0;
    int teamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       initializeviews();
       A3();
       A2();
       A1();

       B3();
       B2();
       B1();

       reset();





    }
    public void initializeviews()
    {
        resaultA=(TextView)findViewById(R.id.team_a_resault);
        resaultB=(TextView)findViewById(R.id.team_b_resault);
        A3=(Button)findViewById(R.id.team_a_3);
        A2=(Button)findViewById(R.id.team_a_2);
        A1=(Button)findViewById(R.id.team_a_free);
        B3=(Button)findViewById(R.id.team_b_3);
        B2=(Button)findViewById(R.id.team_b_2);
        B1=(Button)findViewById(R.id.team_b_free);
        reset=(Button)findViewById(R.id.reset);
        resaultA.setText(""+teamA);
        resaultB.setText(""+teamB);


    }
    public void A3()
    {
        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                teamA=teamA+3;
                resaultA.setText(""+teamA);


            }
        });

    }
    public void A2()
    {
        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                teamA=teamA+2;
                resaultA.setText(""+teamA);


            }
        });

    }
    public void A1()
    {
        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                teamA=teamA+1;
                resaultA.setText(""+teamA);


            }
        });

    }
    public void B3()
    {
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamB=teamB+3;
                resaultB.setText(""+teamB);
            }
        });
    }
    public void B2()
    {
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamB=teamB+2;
                resaultB.setText(""+teamB);
            }
        });
    }
    public void B1()
    {
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamB=teamB+1;
                resaultB.setText(""+teamB);
            }
        });
    }

    public void reset ()
    {
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                teamA=0;
                teamB=0;
                resaultA.setText(""+teamA);
                resaultB.setText(""+teamB);
            }
        });
    }
}
