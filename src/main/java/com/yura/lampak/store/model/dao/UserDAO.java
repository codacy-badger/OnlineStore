package com.yura.lampak.store.model.dao;


import com.yura.lampak.store.model.entities.User;

import java.util.Collection;

public interface UserDAO {
    void saveUser(User user);
    Collection<User> getAllUsers();
    User getById(int user_id);
    User getByCredentials(String email, String password);
    void removeUser (int user_id);
}
