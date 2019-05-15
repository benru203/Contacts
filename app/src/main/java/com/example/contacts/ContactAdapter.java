package com.example.contacts;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    private ArrayList<Contact> contacts;
    private Resources res;

    public ContactAdapter(Context context, ArrayList<Contact> contacts){
        this.contacts = contacts;
        this.res = context.getResources();
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);
        return new ContactViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position ){
        final Contact c = contacts.get(position);
        holder.name.setText(c.getName());
        holder.lastName.setText(c.getLastName());
        holder.phone.setText(c.getPhone());
        holder.photo.setImageDrawable(ResourcesCompat.getDrawable(res, c.getPhoto(),null));
    }

    @Override
    public int getItemCount(){
        return 3;
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private TextView lastName;
        private TextView phone;
        private ImageView photo;

        public ContactViewHolder(View item){
            super(item);
            name = (TextView)item.findViewById(R.id.lblName);
            lastName = (TextView)item.findViewById(R.id.lblLastName);
            phone = (TextView)item.findViewById(R.id.lblPhone);
            photo = (ImageView)item.findViewById(R.id.imgPhoto);
        }
    }

}
