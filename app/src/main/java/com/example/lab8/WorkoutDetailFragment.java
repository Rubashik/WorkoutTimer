package com.example.lab8;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class WorkoutDetailFragment extends Fragment {
    private long workoutId;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_workout_detail,container,false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view !=null){
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Workout workout = Workout.workouts[(int) workoutId];
            title.setText(workout.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(workout.getDescription());

            StopwatchFragment workoutDetailFragment = (StopwatchFragment) getFragmentManager().findFragmentById(R.id.detail_frag);




        }
    }

    public void setWorkout(long id) {
        this.workoutId = id;
    }
}


