package ua.edu.rshu.work.dao;

import ua.edu.rshu.work.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<UserModel, Integer> {

    UserModel findByName(String name);
}
