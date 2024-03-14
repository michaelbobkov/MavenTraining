package main.java.com.mycompany.app;

import java.util.Optional;

public class UserDAO {
    public Optional<User> findById(Long id) {
        User user = new User();
        user.setName("Michael");
        return Optional.of(user);
    }

}
