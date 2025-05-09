package com.project.opportunities.repository;

import com.project.opportunities.domain.model.Project;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    @Query(value = "FROM Project p WHERE p.status = 'ACTIVE'")
    Page<Project> findAllByStatus_Active(Pageable pageable);

    @Query(value = "FROM Project p WHERE p.status = 'SUCCESSFULLY_COMPLETED'")
    Page<Project> findAllByStatus_SuccessfullyCompleted(Pageable pageable);

    @EntityGraph(attributePaths = "image")
    Optional<Project> findProjectById(Long id);
}
