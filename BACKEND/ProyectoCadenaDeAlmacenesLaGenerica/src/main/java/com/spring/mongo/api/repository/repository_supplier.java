package com.spring.mongo.api.repository;

//IMPORT ELEMENT
import org.springframework.data.mongodb.repository.MongoRepository;
//IMPORT MODEL
import com.spring.mongo.api.model.model_supplier;

//BODY REPOSITORY
public interface repository_supplier extends MongoRepository <model_supplier, Integer>{
}
