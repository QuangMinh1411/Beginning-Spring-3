package com.heaven.chap2.controller;

import com.heaven.chap2.model.Video;
import com.heaven.chap2.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final VideoService videoService;
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("videos",videoService.getVideos());
        return "index";
    }

    @PostMapping("/new-video")
    public String newVideo(@ModelAttribute Video video){
        videoService.create(video);
        return "redirect:/";
    }

    @GetMapping("/react")
    public String react(){
        return "react";
    }
}
