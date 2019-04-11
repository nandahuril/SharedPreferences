package com.example.nanda.sharedpreference;

import com.example.nanda.sharedpreference.Models.Note;
import com.example.nanda.sharedpreference.Models.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Data {

    private static List<User> users;
    private static List<Note> notes;

    static {
        users = new ArrayList<>();
        users.add(new User("nanda", "rahasia"));
        users.add(new User("huril", "rahasia"));
        users.add(new User("aini", "rahasia"));

        notes = new ArrayList<>();
        notes.add(new Note("Lorem Ipsum", new Date(), "Pada suatu detik hiduplah sepasang kekasih...."));
        notes.add(new Note("Lorem Ipsum", new Date(), "Pada suatu menit hiduplah sepasang kekasih...."));
        notes.add(new Note("Lorem Ipsum", new Date(), "Pada suatu jam hiduplah sepasang kekasih...."));
        notes.add(new Note("Lorem Ipsum", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
        notes.add(new Note("Lorem Ipsum", new Date(), "Pada suatu bulan hiduplah sepasang kekasih...."));
    }

    public static List<User> getUsers() {
        return users;
    }

    public static List<Note> getNotes() {
        return notes;
    }
}

