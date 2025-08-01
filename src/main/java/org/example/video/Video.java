package org.example.video;

public abstract class Video {

    private String title;
    private int duration;

    public String getInfo(){
        return "Title: " + title + ", Duration: " + duration;
    }

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
