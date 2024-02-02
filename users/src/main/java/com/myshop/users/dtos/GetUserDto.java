package com.myshop.users.dtos;

import com.myshop.users.entities.Role;
import lombok.Builder;

@Builder
public record GetUserDto(

        Integer UserId,
        String username,

        String firstname,

        String lastname,

        String email,

        Role role) {
}
