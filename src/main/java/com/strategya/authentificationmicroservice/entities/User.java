package com.strategya.authentificationmicroservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

import java.security.Principal;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User  {
    @Id
    String id;
    String firstName;
    String lastName;
    String dateOfBirth;
    String email;
    String address;
    String contactNumber;
    String password;
    Role role;
    private  boolean accountLocked;
    private boolean enabled;




    public enum Role {
        ADMIN, CANDIDATE, EMPLOYEE, HR, USER
    }
}
