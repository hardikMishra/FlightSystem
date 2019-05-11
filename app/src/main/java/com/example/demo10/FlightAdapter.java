package com.example.demo10;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class FlightAdaptor extends RecyclerView.Adapter<FlightAdaptor.FligthViewHolder> {

    private Context mCtx;
    private List<flight> flightList;

    public FlightAdaptor(Context mCtx, List<flight> flightList){
        this.mCtx = mCtx;
        this.flightList = flightList;
    }

    public FlightAdaptor(List<flight> flightList) {
        this.mCtx = mCtx;
        this.flightList = flightList;

    }


    @NonNull
    @Override
    public FligthViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.layout_booking_flight, null);
        return new FligthViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FligthViewHolder fligthViewHolder, int i) {
        flight flight = flightList.get(i);
        fligthViewHolder.textViewTime.setText(String.valueOf(flight.getTime()));
        fligthViewHolder.textViewDestination.setText(flight.getDestination());
        fligthViewHolder.textViewSource.setText(flight.getSource1());
        fligthViewHolder.textViewDate.setText(String.valueOf(flight.getDate()));
        fligthViewHolder.textViewFlightNo.setText(String.valueOf(flight.getFlightNo()));
        fligthViewHolder.textViewChildCount.setText(String.valueOf(flight.getNoOfChildren()));
        fligthViewHolder.textViewAdultCount.setText(String.valueOf(flight.getNoOfAdults()));
    }

    @Override
    public int getItemCount() {
        return flightList.size();
    }

    public class FligthViewHolder extends RecyclerView.ViewHolder {

        TextView textViewDate, textViewTime, textViewSource, textViewDestination, textViewAdultCount, textViewChildCount, textViewFlightNo;

        public FligthViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewFlightNo = itemView.findViewById(R.id.tvFlightNo);
            textViewAdultCount = itemView.findViewById(R.id.tvTotalAdults);
            textViewChildCount = itemView.findViewById(R.id.tvTotalChildren);
            textViewSource = itemView.findViewById(R.id.tvSourceBooking);
            textViewDestination = itemView.findViewById(R.id.tvDestinationBooking);
            textViewDate = itemView.findViewById(R.id.tvDateBooking);
            textViewTime = itemView.findViewById(R.id.tvTimeBooking);
        }
    }
}