package org.cyberrealm.tech.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.cyberrealm.tech.validation.FieldMatch;

@FieldMatch.List({
        @FieldMatch(
                field = "password",
                fieldMatch = "repeatPassword",
                message = "Password do not match!"
        )
})
public record UserRegistrationRequestDto(
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Size(min = 8, max = 20)
        String password,
        @NotBlank
        @Size(min = 8, max = 20)
        String repeatPassword,
        @NotBlank
        String firstName,
        @NotBlank
        String lastName
) {
}
