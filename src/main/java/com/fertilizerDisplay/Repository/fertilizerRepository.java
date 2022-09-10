package com.fertilizerDisplay.Repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.fertilizerDisplay.Entity.*;

@Repository
public interface fertilizerRepository extends JpaRepositoryImplementation<fertilizerDisplay , Integer> {

}
