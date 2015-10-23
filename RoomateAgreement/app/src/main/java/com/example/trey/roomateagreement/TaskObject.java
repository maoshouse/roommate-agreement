package com.example.trey.roomateagreement;

import android.location.Location;

import java.util.Date;

/**
 * Created by maoshouse on 10/23/15.
 */
public class TaskObject {
    private int pID;
    private String pTask;
    private Date pDate;
    private Location pLocation;
    private String pDescription;

    public TaskObject(TaskObject other) {
        this.pID = other.getID();
        this.pTask = other.getTask();
        this.pDate = other.getDate();
        this.pLocation = other.getLocation();
        this.pDescription = other.getDescription();
    }
    public int getID() {
        return pID;
    }

    public void setID(int id) {
        this.pID = id;
    }

    public String getTask() {
        return this.pTask;
    }

    public void setTask(String task) {
        this.pTask = task;
    }

    public Date getDate() {
        return this.pDate;
    }

    public void setDate(Date date) {
        this.pDate = date;
    }

    public Location getLocation() {
        return this.pLocation;
    }

    public void setLocation(Location location) {
        this.pLocation = location;
    }

    public String getDescription() {
        return this.pDescription;
    }

    public void setDescription(String description) {
        this.pDescription = description;
    }

}
