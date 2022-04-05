package com.xingyechen.security.dao;

import com.xingyechen.security.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author xingyechen
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    /**
     * @param username
     * @return
     */
    User findByUsername(String username);
}

