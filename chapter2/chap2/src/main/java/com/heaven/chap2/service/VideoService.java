package com.heaven.chap2.service;

import com.heaven.chap2.model.Video;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoService {
    private List<Video> videos = List.of( //
            new Video("Need HELP with your SPRING BOOT 3 App?"),
    new Video("Don't do THIS to your own CODE!"),
    new Video("SECRETS to fix BROKEN CODE!"));
    public List<Video> getVideos() {
        return videos;
    }

    public Video create(Video video){
        List<Video> extend = new ArrayList<>(videos);
        extend.add(video);
        this.videos = List.copyOf(extend);
        return video;
    }
}
