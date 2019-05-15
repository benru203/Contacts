package com.example.contacts;

public class Contact {

    private String name, lastName, phone;
    private  int photo;

    public Contact(String name, String lastName, String phone, int photo) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.photo = photo;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void save(){
        Data.save(this);
    }
}
