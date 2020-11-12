package business;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Section implements Serializable {
    private Long id;
    private Kanban kanban;

    public Section() {
    }

    public Section(Long id, Kanban kanban) {
        this.id = id;
        this.kanban = kanban;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    public Kanban getKanban() {
        return kanban;
    }

    public void setKanban(Kanban kanban) {
        this.kanban = kanban;
    }
}
