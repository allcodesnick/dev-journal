package com.allcodesnick.den.skatemaddness.model;



import lombok.Data;


import javax.persistence.*;

@Data
@Entity
@Table(uniqueConstraints={
        @UniqueConstraint(columnNames = {"username", "password"})
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.ORDINAL)
    private Roles role;

    private boolean isEnabled;

    private boolean isAccountNonExpired;

    private boolean isAccountNonLocked;

    private boolean isCredentialsNonExpired;


    public User(){
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.role = Roles.USER;
        this.isEnabled = true;
        this.isAccountNonExpired = true;
        this.isAccountNonLocked = true;
        this.isCredentialsNonExpired = true;
    }


}