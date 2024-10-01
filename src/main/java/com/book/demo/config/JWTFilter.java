package com.book.demo.config;

import com.book.demo.entity.Book;
import com.book.demo.repo.BookRepository;

import jakarta.persistence.Column;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.web.authentication.WebAuthenticationDetails;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//import java.util.Optional;
//@Component
//public class JWTFilter extends OncePerRequestFilter {
//    @Autowired
//    private JWTService jwtService;
//    @Autowired
//    private BookRepository bookRepository;
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        String token = request.getHeader("Authorization");
//        if (token!=null&& token.startsWith("Bearer ")){
//            String tokenVal = token.substring(8, token.length() - 1);
//            String username = jwtService.verifyToken(tokenVal);
//            Optional<Book> opUsername = bookRepository.findByUsername(username);
//            if (opUsername.isPresent()){
//                Book book = opUsername.get();
//                UsernamePasswordAuthenticationToken auth= new UsernamePasswordAuthenticationToken(book,null,null);
//                auth.setDetails(new WebAuthenticationDetails(request));
//                SecurityContextHolder.getContext().setAuthentication(auth);
//        }}
//        filterChain.doFilter(request,response);
//    }
//}
