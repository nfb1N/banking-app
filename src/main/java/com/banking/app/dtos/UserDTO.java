package com.banking.app.dtos;

import com.banking.app.enums.Role;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Schema(description = "User Data Transfer Object")
public class UserDTO {
    @Schema(description = "Unique username", example = "john_doe")
    private String username;

    @Schema(description = "User email", example = "john.doe@example.com")
    private String email;

    @Schema(description = "User role", example = "USER")
    private Role role;
}
