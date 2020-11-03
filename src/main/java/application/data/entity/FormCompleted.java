package application.data.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class FormCompleted {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String creator;

    private String completer;

    private LocalDateTime created_at;

    private LocalDateTime completed_at;

    @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @ElementCollection
    private Set<QuestionCompleted> questions;

    public FormCompleted() {
    }

    public FormCompleted(String title, String creator, String completer,
                         LocalDateTime created_at, LocalDateTime completed_at,
                         Set<QuestionCompleted> questions) {
        this.title = title;
        this.creator = creator;
        this.completer = completer;
        this.created_at = created_at;
        this.completed_at = completed_at;
        this.questions = questions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCompleter() {
        return completer;
    }

    public void setCompleter(String completer) {
        this.completer = completer;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getCompleted_at() {
        return completed_at;
    }

    public void setCompleted_at(LocalDateTime completed_at) {
        this.completed_at = completed_at;
    }

    public Set<QuestionCompleted> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<QuestionCompleted> questions) {
        this.questions = questions;
    }
}
