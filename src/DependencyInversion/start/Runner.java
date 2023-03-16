package DependencyInversion.start;

import java.util.ArrayList;
import java.util.List;

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
