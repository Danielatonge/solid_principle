package LiskovSubstitution.start;

import java.util.ArrayList;
import java.util.List;

/* GOAL: A variable of a given type may be assigned a value of
 * any subtype of that type
 */

/*
 * Consider classes Video and PremiumVideo, PremiumVideo inheriting from Video
 * 1. How is Liskov Substitution violated in this case
 * 2. How can we fix this issue
 */


/* Note: See inheritance differently
 * Classes shouldn't be extended only based on the fact that
 * they share something in common (e.g. Penguins are Birds by they don't fly)
 */

public class Runner {

    public static void main(String[] args) throws Exception {

        List<Video> videos = new ArrayList<>();
        videos.add(new Video());
        videos.add(new PremiumVideo());

        for (Video video : videos) {
            video.playRandomAdvert();
        }
    }
}
