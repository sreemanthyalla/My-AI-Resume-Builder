package com.example.resumebuilder.service;

import com.example.resumebuilder.model.Resume;
import org.springframework.stereotype.Service;

@Service
public class ResumeService {

    public String generateResume(Resume resume) {

        return """
        ===========================
        %s
        Email: %s
        ===========================

        PROFESSIONAL SUMMARY
        A motivated candidate with strong skills in %s and a passion for learning and growth.

        SKILLS
        %s

        EXPERIENCE
        %s
        """.formatted(
                resume.getName(),
                resume.getEmail(),
                resume.getSkills(),
                resume.getSkills(),
                resume.getExperience()
        );
    }
}
