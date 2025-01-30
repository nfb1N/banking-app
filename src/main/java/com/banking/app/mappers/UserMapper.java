package com.banking.app.mappers;

import com.banking.app.dtos.UserDTO;
import com.banking.app.entities.User;


public class UserMapper {
    public static UserDTO toDTO(User user) {
        return UserDTO.builder()
                .username(user.getUsername())
                .email(user.getEmail())
                .fullName(user.getFullName())
                .role(user.getRole())
                .build();
    }

    public static User toEntity(UserDTO dto) {
        return User.builder()
                .username(dto.getUsername())
                .email(dto.getEmail())
                .fullName(dto.getFullName())
                .role(dto.getRole())
                .build();
    }
}

