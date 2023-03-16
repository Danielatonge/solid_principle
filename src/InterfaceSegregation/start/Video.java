package InterfaceSegregation.start;

public class Video implements IVideoActions {
    private double duration;
    private int numberOfViews;

    @Override
    public double getNumberOfHoursPlayed() {
        return (duration / 3600.0) * numberOfViews;
    }

    @Override
    public void playRandomAdvert() {
        /* play an advert */
        System.out.println("Playing Advert");
    }
}
