package com.kevin.jpa.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<ParentModel, Long> {
}
