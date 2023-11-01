package service.impl;

import model.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class UserServiceImpl implements UserService {

    private static final List<User> USERS = new ArrayList<>();

    private static final Logger log = Logger.getLogger(UserServiceImpl.class.getName());

    /**
     * method for saving user
     */
    @Override
    public void save(long id, String firstName, String lastName, int age) {
        final Optional<User> userOptional = USERS.stream().filter(u -> u.getId() == id).findFirst();
        if (userOptional.isPresent()) {
            log.severe("User with id - " + id + " already exists");
        } else {
            USERS.add(new User(id, firstName, lastName, age));
            log.info("User successfully saved.");
        }
    }
}
