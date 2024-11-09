package com.Placement.FullStack.service.impl;

import com.Placement.FullStack.model.Contact;
import com.Placement.FullStack.repository.ContactRepository;
import com.Placement.FullStack.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Marks this class as a Spring Bean
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();  // Fetches all contacts from the database
    }

    @Override
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);  // Saves the contact to the database
    }

    // Implement other methods as needed
}
