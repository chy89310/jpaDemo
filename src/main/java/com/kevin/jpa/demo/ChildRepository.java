package com.kevin.jpa.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository<ChildModel, Long> {
}
