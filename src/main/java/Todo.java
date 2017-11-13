/**
 * Created by andr_ on 13.11.2017.
 */
public class Todo {
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
