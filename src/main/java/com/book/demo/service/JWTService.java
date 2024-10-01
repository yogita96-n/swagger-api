//package com.book.demo.service;
//
//import com.auth0.jwt.JWT;
//import com.auth0.jwt.algorithms.Algorithm;
//import com.auth0.jwt.interfaces.DecodedJWT;
//import com.book.demo.entity.Book;
//import com.book.demo.repo.BookRepository;
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
//import org.springframework.stereotype.Service;
//
//import java.util.Date;
//
//@Service
//public class JWTService {
//    @Value("${jwt.algorithm.key}")
//    private String algorithmKey;
//    @Value("${jwt.issuer}")
//    private String issuer;
//    @Value("${jwt.expiry.time}")
//    private int expiryTime;
//    Algorithm algorithm;
//    private final BookRepository bookRepository;
//
//    public JWTService(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
//    public final String BOOK_NAME="";
//
//    @PostConstruct
//    public void PostConstruct(){
//        algorithm = Algorithm.HMAC256(algorithmKey);
//    }
//    public String generateToken(Book book){
//        return JWT.create().withClaim(BOOK_NAME,book.getBookName()).
//                withExpiresAt(new Date(System.currentTimeMillis()+expiryTime)).
//                withIssuer(issuer).sign(algorithm);
//    }
//    public String verifyToken(String token) {
//        DecodedJWT decodeJwt = JWT.require(algorithm).withIssuer(issuer).build().verify(token);
//        return decodeJwt.getClaim(BOOK_NAME).asString();
//    }
//}
