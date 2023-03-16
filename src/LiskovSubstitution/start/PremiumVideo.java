package LiskovSubstitution.start;

// No need to play ads in a PremiumVideo
public class PremiumVideo extends Video {
    private int premiumId;

    @Override
    public void playRandomAdvert() throws Exception {
        throw new Exception("No Ads play during Premium videos LSP");
    }
}