package vn.sps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.sps.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
