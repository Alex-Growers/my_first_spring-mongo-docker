package com.example.firstdockerproject;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GremlinsRepository extends MongoRepository<GremlinEntity, String> {
}
