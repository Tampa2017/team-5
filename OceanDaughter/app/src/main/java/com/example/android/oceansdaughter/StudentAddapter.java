package com.example.android.oceansdaughter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Quoc on 10/20/2017.
 */

public class StudentAddapter extends ArrayAdapter<Student> {
    public StudentAddapter(Activity context, ArrayList<Student> student){
        super(context,0,student);
    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.student_list, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Student currentStudent = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameClass = (TextView) listItemView.findViewById(R.id.classname);;
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameClass.setText(currentStudent.getClassName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView grade = (TextView) listItemView.findViewById(R.id.grade);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        grade.setText(currentStudent.getGrade());
        TextView studentName = (TextView) listItemView.findViewById(R.id.student_name);
        studentName.setText(currentStudent.getStudentName());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
