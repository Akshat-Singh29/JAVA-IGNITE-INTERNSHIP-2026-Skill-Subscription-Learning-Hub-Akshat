package com.skills.hub.model;

import jakarta.persistence.*;

/*
=========================================================
WHAT IS THIS CLASS?
=========================================================

This represents a SKILL PACK (like a course)

 Example:
- Java Basics
- Spring Boot Mastery
- Python Fundamentals

Each object = one course

=========================================================
*/

@Entity
@Table(name = "skill_packs")
public class SkillPack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private Double price;

    // =========================
    // GETTERS AND SETTERS
    // =========================

    public SkillPack() {
     
    }
    public Long getId() {
        return id;
    }
        // store price
        this.price = price;
    }
}
}
