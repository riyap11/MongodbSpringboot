package com.example.JournalApp.Repository;

import com.example.JournalApp.Entity.JournalEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepo extends MongoRepository<JournalEntity, ObjectId> {

}
