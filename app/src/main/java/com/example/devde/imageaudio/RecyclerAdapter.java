package com.example.devde.imageaudio;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private ArrayList<Dataprovider> arrayList = new ArrayList<Dataprovider>();
    Context context;

    public RecyclerAdapter(ArrayList<Dataprovider> arrayList,Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_layout,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view,arrayList,context);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Dataprovider dataprovider = arrayList.get(position);
        holder.imageView.setImageResource(dataprovider.getImage());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageView;
        ArrayList<Dataprovider> dataproviders = new ArrayList<Dataprovider>();
        Context context;

        public MyViewHolder(View itemView, ArrayList<Dataprovider> arrayList, Context context) {
            super(itemView);
            this.dataproviders = dataproviders;
            this.context = context;
            itemView.setOnClickListener(this);
            imageView = itemView.findViewById(R.id.image);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            int[] sounds = {R.raw.baboon_monkey,R.raw.camel,R.raw.cheetah,R.raw.dog,R.raw.jaguar,R.raw.wolf7};
            if(position == 0) {
                MediaPlayer mediaPlayer = MediaPlayer.create(v.getContext(),sounds[0] );
                mediaPlayer.start();
            } else if(position == 1) {
                MediaPlayer mediaPlayer = MediaPlayer.create(v.getContext(),sounds[1] );
                mediaPlayer.start();
            } else if(position == 2) {
                MediaPlayer mediaPlayer = MediaPlayer.create(v.getContext(), sounds[2]);
                mediaPlayer.start();
            } else if(position == 3) {
                MediaPlayer mediaPlayer = MediaPlayer.create(v.getContext(), sounds[3]);
                mediaPlayer.start();
            } else if(position == 4) {
                MediaPlayer mediaPlayer = MediaPlayer.create(v.getContext(), sounds[4]);
                mediaPlayer.start();
            } else if(position == 5) {
                MediaPlayer mediaPlayer = MediaPlayer.create(v.getContext(), sounds[5]);
                mediaPlayer.start();
            }

        }
    }
}
