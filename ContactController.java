package com.example.sharingapp;

public class ContactController {

    public Contact contact;

    public ContactController(Contact contact){
        this.contact = contact;
    }

    public String getId(){
        return contact.getId();
    }

    public void setId(){
        contact.setId();
    }

    public String getEmail(){
        return contact.getEmail();
    }

    public void setEmail(String email){
        contact.setEmail(email);
    }

    public String getUsername(){
        return contact.getUsername();
    }

    public void setUserName(String username){
        contact.setUsername(username);
    }

    public String getStatus(){
        return contact.getStatus();
    }

    public void setStatus(String status){
        contact.setStatus(status);
    }

    public Contact getContact(){
        return this.contact;
    }

    public void addObserver(Observer observer){
        contact.addObserver(observer);
    }

    public void removeObserver(Observer observer){
        contact.removeObserver(observer);
    }

}
