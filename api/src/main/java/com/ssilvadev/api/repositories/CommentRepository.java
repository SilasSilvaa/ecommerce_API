package com.ssilvadev.api.repositories;

import com.ssilvadev.api.domain.model.Comment;
import com.ssilvadev.api.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Product> findByProductId(Long productId);
}
