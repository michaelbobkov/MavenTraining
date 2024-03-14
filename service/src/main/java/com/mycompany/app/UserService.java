package main.java.com.mycompany.app;

import java.util.Optional;

public class UserService {

    private final UserDAO userDAO = new UserDAO();

    public Optional<UserDTO> getUser(Long id) {
        return userDAO.findById(id).map(user -> new UserDTO(user.getName()));
    }

}
