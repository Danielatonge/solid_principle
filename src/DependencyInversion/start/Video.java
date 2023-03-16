package DependencyInversion.start;

public class Video {
    YouTubeVideoManager manager;

    public Video(YouTubeVideoManager manager) {
        this.manager = manager;
    }

    public double getNumberOfHoursPlayed() {
        return manager.getNumberOfHoursPlayed();
    }

    public void playRandomAdvert() {
        manager.playRandomAdvert();
    }
}
