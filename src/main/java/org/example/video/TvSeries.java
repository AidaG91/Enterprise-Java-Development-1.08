package org.example.video;

public class TvSeries extends Video{

    private int episodes;

    public TvSeries(String title, int duration, int epidodes) {
        super(title, duration);
        this.episodes = epidodes;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Episode: " + episodes;
    }
}
