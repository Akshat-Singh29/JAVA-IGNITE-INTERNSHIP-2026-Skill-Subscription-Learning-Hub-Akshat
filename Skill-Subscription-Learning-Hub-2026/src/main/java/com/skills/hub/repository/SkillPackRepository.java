package com.skills.hub.repository;
import java.util.List;
import com.skills.hub.model.SkillPack;
import org.springframework.data.jpa.repository.JpaRepository;

/*
=========================================================
WHAT IS THIS FILE?
=========================================================

SkillPackRepository handles database operations
for SkillPack (courses).

 Used for:
- Adding new courses
- Viewing courses
- Updating courses
- Deleting courses

=========================================================
*/

public interface SkillPackRepository extends JpaRepository<SkillPack, Long> {
    List<SkillPack> findByTitleContainingIgnoreCase(String keyword);// No custom methods needed initially
}
