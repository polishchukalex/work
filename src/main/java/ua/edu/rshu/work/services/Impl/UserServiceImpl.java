package ua.edu.rshu.work.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.edu.rshu.work.dao.UserDAO;
import ua.edu.rshu.work.models.UserModel;
import ua.edu.rshu.work.services.UserService;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public UserModel addUser(UserModel user) {
        return userDAO.saveAndFlush(user);
    }

//    @Override
//    public void deleteUser(UserModel user) {
//
//    }

    @Override
    public void editUser(int id, String name, String lastname) {
        UserModel user = getUserByID(id).get();
        user.setName(name);
        user.setLastname(lastname);
        userDAO.saveAndFlush(user);
    }

    @Override
    public Optional<UserModel> getUserByID(int id) {
        return Optional.ofNullable(userDAO.findOne(id));
    }

    @Override
    public List<UserModel> loadUserList() {
        return userDAO.findAll();
    }

    @Override
    public Optional<UserModel> getUserByLogin(String login) {
        return Optional.ofNullable(userDAO.findByName(login));
    }
}
