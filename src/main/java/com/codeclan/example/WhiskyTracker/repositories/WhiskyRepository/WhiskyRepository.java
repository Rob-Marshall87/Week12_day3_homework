package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long>, WhiskyRepositoryCustom {
    List<Whisky> getWhiskyByYear(int Year);

    List<Whisky> getWhiskyByDistilleryIdAndYear(Long distilleryId, int year);

    List<Whisky> getWhiskyByDistilleryId(Long distilleryId);
}
