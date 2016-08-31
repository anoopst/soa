package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.Manufacturer;

/*@Repository
public interface ManufacturerRepository extends MongoRepository<Manufacturer, Integer> {

}*/

@RepositoryRestResource(path="/datarest")
public interface ManufacturerRepository extends MongoRepository<Manufacturer, Integer> {

}