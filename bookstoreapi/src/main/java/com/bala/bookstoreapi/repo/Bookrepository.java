package com.bala.bookstoreapi.repo;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bala.bookstoreapi.entity.Book;

@Repository
public interface Bookrepository extends JpaRepository<Book, Integer>{

	List<Book> findAllBysnoIn(Set<Integer> snum);

}
