package com.Placement.FullStack.service;

import java.util.List;

import com.Placement.FullStack.model.Contact;


public interface ContactService {
    List<Contact> getAllContacts();
    Contact saveContact(Contact contactontact);
}
