package DependencyInversion.start;

import java.util.ArrayList;
import java.util.List;

/* GOAL:
 * Higher-level components shouldn't depend on lower-level
 * components. Both should depend on abstractions.
 * Abstractions shouldn't depend on details: details should
 * depend on abstractions
 */

/* Context:
 * We continue to manage videos in our system. Currently, we
 * support only YouTube videos on our platform because that is
 * the only API available to us. However, new requirements come
 * saying need to support more Video Managers like TikTok
 * Netflix e.t.c
 * */

/* Questions:
 * Why does Video class violate DIP?
 * What if we wish to use TikTokVideoManager and make sure to
 * follow the DIP?
 *
 * Constraints:
 * Do not modify YouTubeVideoManager.
 * We want to modify the Video class once and for all and
 * never have to modify it again.
 * */
public class Runner {
    public static void main(String[] args) {

        List<Video> videos = new ArrayList<>();
        YouTubeVideoManager manager = new YouTubeVideoManager();

        videos.add(new Video(manager));
        videos.add(new Video(manager));

        for (Video video : videos) {
            video.playRandomAdvert();
        }
    }
}
