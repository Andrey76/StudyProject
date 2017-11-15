import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ToDo {

    private String business;
    @ManyToOne
    @JoinColumn(name = "business_id")
    private GroupTodo groupTodo;

    public ToDo() {
    }

    public ToDo(String business) {
        this.business = business;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "business='" + business + '\'' +
                '}';
    }
}
