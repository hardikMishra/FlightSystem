package com.example.demo10;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.AppComponentFactory;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class BookingFragment extends android.support.v4.app.Fragment {

    List<flight> flightList;
    RecyclerView recyclerView;

    Date date;
    Time time;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_booking, container, false);

        flightList = new ArrayList<>();
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());

        flightList.add(
                new flight(
                        690,
                        date = new Date(119,04,25),
                        time = new Time(13,45,30),
                        "UDR",
                        "BRL",
                        1,
                        0
                )
        );

        flightList.add(
                new flight(
                        345,
                        date = new Date(119,04,25),
                        time = new Time(12,40,00),
                        "BOM",
                        "GOA",
                        2,
                        0
                )
        );

        flightList.add(
                new flight(
                        456,
                        date = new Date(119,04,26),
                        time = new Time(13,41,35),
                        "UDR",
                        "DEL",
                        2,
                        1
                )
        );
        recyclerView = rootView.findViewById(R.id.rvBooking);

        recyclerView.setLayoutManager(mLayoutManager);
        FlightAdaptor adaptor = new FlightAdaptor(flightList);

        recyclerView.setAdapter(adaptor);



        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



    }
}