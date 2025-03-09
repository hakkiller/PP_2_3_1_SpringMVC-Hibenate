package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

@Service
public interface UserService {

    List<User> getAllUsers();

    User getUser(Long id);

    User update(Long id);

    void saveUser(User user);

    void deleteUser(Long id);
}