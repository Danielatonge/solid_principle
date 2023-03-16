package InterfaceSegregation.start;

public class PremiumVideo implements IVideoActions {
    private double duration;
    private int numberOfViews;

    @Override
    public double getNumberOfHoursPlayed() {
        return (duration / 3600.0) * numberOfViews;
    }

    @Override
    public void playRandomAdvert() throws Exception {
        throw new Exception("No Ads play during Premium videos ISP");
    }
}
