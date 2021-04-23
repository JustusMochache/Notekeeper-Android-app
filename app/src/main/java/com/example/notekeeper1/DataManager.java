package com.example.notekeeper1;

//this is a singleton


import java.util.ArrayList;
import java.util.List;

public class DataManager {

    private static DataManager ourInstance = null;

    private List<CourseInfo> mCourses = new ArrayList<>();
    private List<NoteInfo> mNotes = new ArrayList<>();

    public static DataManager getInstance() {
        if(ourInstance == null){
            ourInstance = new DataManager();
            ourInstance.initializeCourses();
            ourInstance.initializeExampleNotes();
        }
        return ourInstance;
    }

    public String getCurrentUserName() { return "Justus Mfalme";}

    public String getCurrentUserEmail() { return  "justusm10@gmail.com";}

    private void initializeExampleNotes() {
    }

    private void initializeCourses() {
    }

    public List<CourseInfo> getmCourses() {
        return mCourses;
    }
    public CourseInfo getCourse(String id){
        for (CourseInfo course : mCourses){
            if (id.equals(course.getCourseId()))
                return course;
        }
        return null;
    }

    public List<NoteInfo> getmNotes() {
        return mNotes;
    }
}
