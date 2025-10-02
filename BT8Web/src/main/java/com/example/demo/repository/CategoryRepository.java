package com.example.demo.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByCategoryNameContaining(String name);
    Optional<Category> findByCategoryName(String name);
}
