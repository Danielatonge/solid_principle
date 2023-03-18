package InterfaceSegregation.start;

import java.util.ArrayList;
import java.util.List;

/* GOAL: Clients should not be forced to depend on methods
 * that they do not use
 */

/*
 * Context/Questions:
 * Consider classes Video and PremiumVideo which implement IVideoActions.
 * However, PremiumVideos do not show advertisement.
 * 1. How is Interface Segregation violated in this case
 * 2. Modify Classes to Satisfy ISP
 */

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
