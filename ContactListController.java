package com.example.sharingapp;

import android.content.Context;

import java.util.ArrayList;

public class ContactListController {

    private ContactList contactList;

    public ContactListController(ContactList contactList){
        this.contactList = contactList;
    }

    public void setContacts(ArrayList<Contact> contactList){
        this.contactList.setContacts(contactList);
    }

    public ArrayList<Contact> getContacts(){
        return this.contactList.getContacts();
    }

    public boolean addContact(Contact contact, Context context){
        AddContactCommand addContactCommand = new AddContactCommand(contactList, contact, context);
        addContactCommand.execute();
        return addContactCommand.isExecuted();
    }

    public boolean deleteContact(Contact contact, Context context){
        DeleteContactCommand deleteContactCommand = new DeleteContactCommand(contactList, contact, context);
        deleteContactCommand.execute();
        return deleteContactCommand.isExecuted();
    }

    public boolean editContact(Contact contact, Contact updated_contact, Context context){
        EditContactCommand editContactCommand = new EditContactCommand(contactList, contact, updated_contact, context);
        editContactCommand.execute();
        return editContactCommand.isExecuted();
    }

    public Contact getContact(int index){
        return contactList.getContact(index);
    }

    public int getIndex(Contact contact){
        return contactList.getIndex(contact);
    }

    public int getSize(){
        return contactList.getSize();
    }

    public void loadContacts(Context context){
        contactList.loadContacts(context);
    }

    public void addObserver(Observer observer) {
        contactList.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
        contactList.removeObserver(observer);
    }

    public Contact getContactByUsername(String username){
        return contactList.getContactByUsername(username);
    }

    public boolean hasContact(Contact contact){
        if(getContacts() != null){
            return true;
        }
        return false;
    }

    public ArrayList<String> getAllUsernames(){
        ArrayList<Contact> list = contactList.getContacts();
        ArrayList<String> newList = new ArrayList<String>();
        for(Contact c: list){
            newList.add(c.getUsername());
        }
        return newList;
    }

}
