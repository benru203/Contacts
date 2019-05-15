package com.example.contacts;

import java.util.ArrayList;

public class Data {

    private static ArrayList<Contact> contacts = new ArrayList<>();

    public static void save(Contact contact){
        contacts.add(contact);
    }

    public static ArrayList<Contact> getContacts(){
        return contacts;
    }

}
