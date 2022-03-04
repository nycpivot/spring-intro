package com.nycpivot.springintro.repositories;

import com.nycpivot.springintro.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
