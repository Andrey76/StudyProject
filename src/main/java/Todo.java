import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Todo {
    @ManyToOne
    @JoinColumn(name = "business_id")
    private String business;

    public Todo() {
    }

    public Todo(String business) {
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
        return "Todo{" +
                "business='" + business + '\'' +
                '}';
    }
}
