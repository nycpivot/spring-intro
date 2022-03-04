package com.nycpivot.springintro.repositories;

import com.nycpivot.springintro.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
