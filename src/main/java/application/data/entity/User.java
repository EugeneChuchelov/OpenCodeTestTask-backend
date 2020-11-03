package application.data.entity;

import javax.persistence.Id;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private RoleEnum role;

    //@OneToMany(fetch = FetchType.EAGER, cascade= CascadeType.ALL)
    @ElementCollection
    private Set<Long> formsId;

    //@OneToMany(fetch = FetchType.EAGER, cascade= CascadeType.ALL)
    @ElementCollection
    private Set<Long> completedFormsId;

    public User() {
    }

    public User(String username, String password, RoleEnum role, Set<Long> formsId, Set<Long> completedFormsId) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.formsId = formsId;
        this.completedFormsId = completedFormsId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public Set<Long> getForms() {
        return formsId;
    }

    public void setForms(Set<Long> formsId) {
        this.formsId = formsId;
    }

    public Set<Long> getCompletedForms() {
        return completedFormsId;
    }

    public void setCompletedForms(Set<Long> completedFormsId) {
        this.completedFormsId = completedFormsId;
    }
}
