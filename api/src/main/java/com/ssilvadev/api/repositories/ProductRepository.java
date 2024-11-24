package com.ssilvadev.api.repositories;

import com.ssilvadev.api.domain.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Comment, Long> {
}
