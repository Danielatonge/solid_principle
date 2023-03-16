package LiskovSubstitution.start;

public class Video {
    private double duration;
    private int numberOfViews;

    public double getNumberOfHoursPlayed() {
        return (duration / 3600.0) * numberOfViews;
    }

    public void playRandomAdvert() throws Exception {
        /* play an advert*/
        System.out.println("Playing Advert");
    }
}
