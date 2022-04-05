package com.xingyechen.security.impl;

import com.xingyechen.security.dao.UserRepository;
import com.xingyechen.security.entity.User;
import com.xingyechen.security.model.JwtUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xingyechen
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //todo 获取用户信息
        User user = userRepository.findByUsername(username);
        //todo 获取角色列表
        return new JwtUser(user);
    }

}

