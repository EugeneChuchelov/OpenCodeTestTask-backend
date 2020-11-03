package application.data.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @Enumerated(EnumType.STRING)
    private TypeEnum type;

    @OneToMany(fetch = FetchType.EAGER, cascade= CascadeType.ALL)//, mappedBy = "question")
    @ElementCollection
    private Set<Answer> answers;

    public Question() {
    }

    public Question(String text, TypeEnum type, Set<Answer> answers) {
        this.text = text;
        this.type = type;
        this.answers = answers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }
}
