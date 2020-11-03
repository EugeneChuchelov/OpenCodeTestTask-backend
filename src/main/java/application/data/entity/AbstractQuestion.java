package application.data.entity;

import javax.persistence.*;

//@Entity
public abstract class AbstractQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String text;

    @Enumerated(EnumType.STRING)
    private TypeEnum type;

    public AbstractQuestion() {
    }

    public AbstractQuestion(String text, TypeEnum type) {
        this.text = text;
        this.type = type;
    }
}
