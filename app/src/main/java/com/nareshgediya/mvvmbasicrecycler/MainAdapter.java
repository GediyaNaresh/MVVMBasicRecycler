package com.nareshgediya.mvvmbasicrecycler;



import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private Context context;
    private List<MainData> dataArrayList;

    public MainAdapter(Context context, List<MainData> dataArraylist){
        this.context = context;
        this.dataArrayList = dataArraylist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_item,parent,false);
        Log.d("abc","View Holder");
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.textView.setText(dataArrayList.get(position).getName());
        holder.imageView.setImageResource(R.mipmap.ic_launcher);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, dataArrayList.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });


    }


    @Override
    public int getItemCount() {
        return dataArrayList.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image1);
            textView = itemView.findViewById(R.id.text1);

        }
    }
}

