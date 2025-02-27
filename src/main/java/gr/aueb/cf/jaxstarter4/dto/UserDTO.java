package gr.aueb.cf.jaxstarter4.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserDTO {

    @NotNull
    @Size(min = 3, max = 20, message =  "Username length must be between 3 - 20 characters")
    private String username;
    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$",
            message = "Password must contain at least one uppercase letter, one lowercase letter, one digit, and be at least 8 characters long"
    )
    private String passsword;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPasssword() {
        return passsword;
    }
    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }
}
