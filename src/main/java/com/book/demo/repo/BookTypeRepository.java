package com.book.demo.repo;

import com.book.demo.entity.BookType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookTypeRepository extends JpaRepository<BookType, Long> {
}