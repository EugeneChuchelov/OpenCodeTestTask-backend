package application.data.entity;

import javax.persistence.*;

import java.time.LocalDateTime;

//@Entity
public abstract class AbstractForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private User creator;

    private String title;

    private LocalDateTime created_at;

    public AbstractForm() {
    }

    public AbstractForm(User creator, String title, LocalDateTime created_at) {
        this.creator = creator;
        this.title = title;
        this.created_at = created_at;
    }
}
