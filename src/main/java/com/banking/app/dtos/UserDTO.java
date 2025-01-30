package com.banking.app.dtos;

import com.banking.app.enums.Role;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "User Data Transfer Object")
public class UserDTO {
    @Schema(description = "Unique username", example = "john_doe")
    private String username;

    @Schema(description = "User email", example = "john.doe@example.com")
    private String email;

    @Schema(description = "User role", example = "USER")
    private Role role;

    @Schema(description = "Full user's name", example = "John Edvarts")
    private String fullName;
}
