package com.example.demoServer.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demoServer.boot.model.Book;


public interface BookRepository extends CrudRepository<Book,String> {

	
}
