package com.bala.bookstoreapi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bala.bookstoreapi.entity.Book;

@Repository
public interface Bookrepository extends JpaRepository<Book, Integer>{

	List<Book> findAllBysno(Integer snum);

}
