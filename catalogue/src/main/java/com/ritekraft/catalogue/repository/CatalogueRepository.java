package com.ritekraft.catalogue.repository;

import com.ritekraft.catalogue.entity.Catalogue;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CatalogueRepository extends MongoRepository<Catalogue, String> {
}
