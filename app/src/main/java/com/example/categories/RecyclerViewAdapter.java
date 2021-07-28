package com.example.categories;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MYViewHolder> {

    private Context mContext;
    private List<Course> mData;

    public RecyclerViewAdapter(Context mContext,List<Course> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MYViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.course_item_list,parent,false);

        return new MYViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  RecyclerViewAdapter.MYViewHolder holder, int position) {

        holder.tv_course_title.setText(mData.get(position).getTitle());
        holder.img_course_thumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,Course_Activity.class);


                intent.putExtra("CourseTitle",mData.get(position).getTitle());
                intent.putExtra("Description",mData.get(position).getDescription());
                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());

                mContext.startActivity(intent);



            }
        });



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MYViewHolder extends  RecyclerView.ViewHolder{

        TextView tv_course_title;
        ImageView img_course_thumbnail;
        CardView cardView;

        public MYViewHolder(View itemView){
            super(itemView);

            tv_course_title = (TextView) itemView.findViewById(R.id.course_title_id);
            img_course_thumbnail = (ImageView) itemView.findViewById(R.id.course_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);
        }
    }


}
