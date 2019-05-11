package com.example.demo10;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.AppComponentFactory;

import java.util.ArrayList;
import java.util.List;

public class BookingFragment extends android.support.v4.app.Fragment {

    List<flight> flightList;
    RecyclerView recyclerView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        recyclerView = (RecyclerView) container.findViewById(R.id.rvBooking);
        //recyclerView.setHasFixedSize(savedInstanceState);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        flightList = new ArrayList<>();

        flightList.add(
                new flight(
                        1,
                        null,
                        null,
                        "AHM",
                        "BANG",
                        1,
                        0
                )
        );

        FlightAdaptor adaptor = new FlightAdaptor(this.getContext(),flightList);

        recyclerView.setAdapter(adaptor);

        return inflater.inflate(R.layout.fragment_booking, container, false);
    }
}