package com.springProject.journalApp.repository;

import com.springProject.journalApp.entity.JournalEntry;
import com.springProject.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepo extends MongoRepository<JournalEntry, ObjectId> {

}
