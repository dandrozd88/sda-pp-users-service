package com.sda.service;

import com.sda.dao.UsersDAO;
import com.sda.dto.UserDTO;
import com.sda.exception.NotFoundException;
import com.sda.mapper.UserMapper;
import com.sda.model.User;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserService {

    private final UsersDAO usersDAO;
    private final UserMapper userMapper;

    public List<UserDTO> findAll() {
        return usersDAO.findAll().stream()
                .map(user -> userMapper.map(user))
                .toList();
    }

    public UserDTO findByUsername(String username) {
        User user = usersDAO.findUserByUsername(username);
        if (user == null) {
            throw new NotFoundException("User with username %s not found!".formatted(username));
        }
        return userMapper.map(user);
    }

    public void deleteByUsername(String username){
        boolean deleted = usersDAO.deleteByUsername(username);
        if (!deleted) {
            throw new NotFoundException("User with username %s dose not exits!".formatted(username));
        }
    }


}
