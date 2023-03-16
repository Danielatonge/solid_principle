package InterfaceSegregation.start;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws Exception {

        List<IVideoActions> videos = new ArrayList<>();
        videos.add(new Video());
        videos.add(new PremiumVideo());

        for (IVideoActions video : videos) {
            video.playRandomAdvert();
        }
    }
}
