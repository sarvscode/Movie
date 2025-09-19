package com.example.MyRefernces.Books;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRep extends JpaRepository<Book, Integer> {
	@Query(value = "SELECT * FROM book ORDER BY name asc, price DESC", nativeQuery = true)
	List<Book> findnameAndPrice(); 
	
	 @Query(value = "SELECT * FROM book WHERE author = :author", nativeQuery = true)
	    List<Book> findBooksByAuthor(String author);
		
	 @Query(value = "SELECT * FROM book WHERE category = :category AND price ", nativeQuery = true)
	    List<Book> filterByCategoryAndPrice(String category, Long price);
	
}
