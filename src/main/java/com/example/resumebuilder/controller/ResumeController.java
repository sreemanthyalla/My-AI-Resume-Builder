package com.example.resumebuilder.controller;

import com.example.resumebuilder.model.Resume;
import com.example.resumebuilder.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ResumeController {

    private final ResumeService resumeService;

    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("resume", new Resume());
        return "index";
    }

    @PostMapping("/generate")
    public String generateResume(@ModelAttribute Resume resume, Model model) {
        String generatedResume = resumeService.generateResume(resume);
        model.addAttribute("result", generatedResume);
        return "resume";
    }
}
