package com.io.baraka.sqlite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseRvAdapter extends RecyclerView.Adapter<CourseRvAdapter.ViewHolder> {

    //variable for array list and context
    private ArrayList<CourseModal>courseModalArrayList;
    private Context context;


    //constructor

    public CourseRvAdapter(ArrayList<CourseModal>courseModalArrayList, Context context) {
        this.courseModalArrayList = courseModalArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CourseRvAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //inflate layout file for recycler view items
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_rv_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseRvAdapter.ViewHolder holder, int position) {

        //set data to views of recycler view items
        CourseModal modal = courseModalArrayList.get(position);
        holder.courseNameTV.setText(modal.getCourseName());
        holder.courseDescTV.setText(modal.getCourseDescription());
        holder.courseDurationTV.setText(modal.getCourseDuration());
        holder.courseTracksTV.setText(modal.getCourseTracks());


    }

    @Override
    public int getItemCount() {

        //return size of array
        return courseModalArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        //var for textviews
        private TextView courseNameTV,courseDescTV,courseDurationTV,courseTracksTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //initialise textviews

            courseNameTV = itemView.findViewById(R.id.idTVCourseName);
            courseDescTV = itemView.findViewById(R.id.idTVCourseDescription);
            courseDurationTV = itemView.findViewById(R.id.idTVCourseDuration);
            courseTracksTV = itemView.findViewById(R.id.idTVCourseTracks);
        }
    }
}
