package edu.mum.cs.cs425.demos.elibrarydemocrudweb.repository;

import edu.mum.cs.cs425.demos.elibrarydemocrudweb.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
    // This interface definition relies on the public abstract methods
    // inherited from the super interface, CrudRepository<T, ID>
    // We may override any or add more methods here, if needed.
    public abstract Iterable<Book> findBookByPublisherContainsOrIsbnContainsOrTitleContainsOrderByTitle(String s, String s1, String s2);
    public abstract Iterable<Book> findBookByTitleContainsOrderByTitle(String s);
}
