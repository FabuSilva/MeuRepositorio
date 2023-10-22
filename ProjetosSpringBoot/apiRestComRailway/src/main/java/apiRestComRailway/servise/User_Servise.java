package apiRestComRailway.servise;

import apiRestComRailway.domain.model.User;



public interface User_Servise {

    User findById(Long id);
    User create(User user);
}
