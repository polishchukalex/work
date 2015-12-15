package ua.edu.rshu.work.services;

import ua.edu.rshu.work.models.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserService {

    UserModel addUser(UserModel user);

//    void deleteUser(UserModel user);

    void editUser(int id, String name, String lastname);

    Optional<UserModel> getUserByID(int id);

    List<UserModel> loadUserList();

    Optional<UserModel> getUserByLogin(String login);
}
