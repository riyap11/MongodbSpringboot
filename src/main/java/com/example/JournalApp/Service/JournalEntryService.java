package com.example.JournalApp.Service;

import com.example.JournalApp.Entity.JournalEntity;
import com.example.JournalApp.Repository.JournalEntryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepo journalEntryRepo;

    public void saveEntry(JournalEntity journalEntry) {
        journalEntryRepo.save(journalEntry);
    }

    public List<JournalEntity> getAll() {
        return journalEntryRepo.findAll();
    }

    public Optional<JournalEntity> findByIdd(ObjectId id) {
        return journalEntryRepo.findById(id);
    }


    public void deleteById(ObjectId id) {
        journalEntryRepo.deleteById(id);
    }

    public void updateEntry(ObjectId id,JournalEntity journalEntity) {
        journalEntryRepo.save(journalEntity);

    }


}
