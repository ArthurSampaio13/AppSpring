package com.client.ws.apispring.service.Impl;

import com.client.ws.apispring.dto.UserDTO;
import com.client.ws.apispring.exception.BadRequestException;
import com.client.ws.apispring.exception.NotFoundException;
import com.client.ws.apispring.mapper.UserMapper;
import com.client.ws.apispring.model.User;
import com.client.ws.apispring.model.UserType;
import com.client.ws.apispring.repository.UserRepository;
import com.client.ws.apispring.repository.UserTypeRepository;
import com.client.ws.apispring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserTypeRepository userTypeRepository;

    @Override
    public User create(UserDTO userDTO) {
        if (Objects.nonNull(userDTO.getId())) {
            throw new BadRequestException("id não deve ser nulo");
        }

        var userTypeOpt = userTypeRepository.findById(userDTO.getUserTypeId());

        if (userTypeOpt.isEmpty()) {
            throw new NotFoundException("userTypeId não encontrado");
        }

        UserType userType = userTypeOpt.get();
        User user = UserMapper.fromDtoToEntity(userDTO, userType, null);
        return userRepository.save(user);
    }
}
