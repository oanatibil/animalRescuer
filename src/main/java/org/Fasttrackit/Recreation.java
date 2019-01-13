package org.Fasttrackit;

public class Recreation {
    private String name;
    private int duration;
    private boolean groupActvity;
    private String place;
    private long recreationDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isGroupActvity() {
        return groupActvity;
    }

    public void setGroupActvity(boolean groupActvity) {
        this.groupActvity = groupActvity;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public long getRecreationDate() {
        return recreationDate;
    }

    public void setRecreationDate(long recreationDate) {
        this.recreationDate = recreationDate;
    }
}
