package com.example.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.model.Book;

@Repository
@EnableJpaRepositories
public interface BookRepo extends JpaRepository<Book,Integer>{
		@Query(value="select * from Book where author=?1", nativeQuery=true)
		List<Book> findBookByAuthor(String author);
		//findProductByBrand
		
		//irrespective of which database you use this Query will work
		@Query("SELECT b from Book b WHERE b.title = ?1")
		List<Book> findBookByTitle(String title);
		//findProductByBrand
	
}
