package DependencyInversion.start;


public class YouTubeVideoManager {
    private double duration;
    private int numberOfViews;

    public double getNumberOfHoursPlayed() {
        return (duration / 3600.0) * numberOfViews;
    }

    public void playRandomAdvert() {
        /* play an advert from YouTube */
        System.out.println("Playing Advert from YouTube");
    }
}
