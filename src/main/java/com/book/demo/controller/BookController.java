package com.book.demo.controller;

import com.book.demo.entity.Book;
import com.book.demo.entity.BookType;
import com.book.demo.payload.LoginDto;
import com.book.demo.payload.TokenDto;
import com.book.demo.repo.BookRepository;
import com.book.demo.repo.BookTypeRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v2/book")
@Tag(name="Book Controller",description="to perform operation ")

//please use this url for swagger
// http://localhost:8080/swagger-ui/index.html#/
public class BookController {
   // @Autowired private JWTService jwtService;

    private BookRepository bookRepository;

    private BookTypeRepository bookTypeRepository;

    public BookController(BookRepository bookRepository, BookTypeRepository bookTypeRepository) {
        this.bookRepository = bookRepository;
        this.bookTypeRepository = bookTypeRepository;
    }
@Operation(
        summary = "to save data to db",
        description = "this ap[i used to save data"
)
    @PostMapping("/details")
    public ResponseEntity<Book>addDetail(@RequestBody Book book){
//find the id from booktype repo
        PasswordEncoder pass =new BCryptPasswordEncoder();
        book.setPassword(pass.encode(book.getPassword()));
        Book save = bookRepository.save(book);
        return new ResponseEntity<>(save, HttpStatus.CREATED);
    }

    //login verify
//    @PostMapping("/login")
//    public ResponseEntity<?>verifyLoginDetails(@RequestBody LoginDto loginDto){
//        Optional<Book> byUsername = bookRepository.findByUsername(loginDto.getUsername());
//            Book book= byUsername.get();
//        if (BCrypt.checkpw(loginDto.getPassword(),book.getPassword())){
//            String token = jwtService.generateToken(book);
//            TokenDto tokenDto=new TokenDto();
//            tokenDto.setToken(token);
//            tokenDto.setTokenType("JWT");
//            return new ResponseEntity<>(tokenDto,HttpStatus.OK);
//        }else{
//            return new ResponseEntity<>("invalid username or password",HttpStatus.UNAUTHORIZED);
//    }}

}
