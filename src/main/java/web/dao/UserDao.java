package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUser();

    User getUser(Long id);

    User update(Long id);

    void saveUser(User user);

    void deleteUser(Long id);

}