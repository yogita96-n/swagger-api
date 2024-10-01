package com.book.demo.controller;

import com.book.demo.entity.BookType;
import com.book.demo.repo.BookTypeRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/book-type")
@Tag(name="Book Type Controller",description="to perform book type  operation ")
public class BookTypeController {
    @Autowired
    private BookTypeRepository bookTypeRepository;
    @Operation(
            description = "used to save data"
            ,summary = "save book types"
    )
    @PostMapping()
    public ResponseEntity<BookType> addDetail(@RequestBody BookType bookType){
        BookType save = bookTypeRepository.save(bookType);
        return new ResponseEntity<>(save, HttpStatus.CREATED);
    }
}
