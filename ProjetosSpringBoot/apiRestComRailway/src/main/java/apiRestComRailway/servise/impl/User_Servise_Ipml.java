package apiRestComRailway.servise.impl;

import apiRestComRailway.domain.model.User;
import apiRestComRailway.domain.repository.UserRepository;
import apiRestComRailway.servise.User_Servise;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class User_Servise_Ipml implements User_Servise {

    private final UserRepository repository;

    public User_Servise_Ipml(UserRepository repository) {
        this.repository=repository;
    }

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if(user.getId() != null && repository.existsById(user.getId())){
            throw new IllegalStateException();
        }
        return repository.save(user);
    }
}
