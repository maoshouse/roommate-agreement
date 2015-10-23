package com.example.trey.roomateagreement;

import java.util.ArrayList;

/**
 * Created by maoshouse on 10/23/15.
 */
public class TaskGroup {
    private int pGroupID;
    private ArrayList<TaskObject> pTasks;

    public TaskGroup() {
        pTasks = new ArrayList<TaskObject>();
    }

    public TaskGroup(int groupID) {
        this.pGroupID = groupID;
    }

    public int getGroupID() {
        return this.pGroupID;
    }

    public ArrayList<TaskObject> getTasks() {
        return this.pTasks;
    }

    public void setTasks(ArrayList<TaskObject> tasks) {
        for (TaskObject t : tasks) {
            this.pTasks.add(new TaskObject(t));
        }
    }

}
