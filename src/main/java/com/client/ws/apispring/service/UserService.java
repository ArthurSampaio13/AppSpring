package com.client.ws.apispring.service;

import com.client.ws.apispring.dto.UserDTO;
import com.client.ws.apispring.model.User;

public interface UserService {
    User create(UserDTO userDTO);
}
