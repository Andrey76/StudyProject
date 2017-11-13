import java.util.List;

/**
 * Created by andr_ on 13.11.2017.
 */
public class GroupTodo {
    private List<Todo> listOfBusiness;

    public GroupTodo() {
    }

    public GroupTodo(List<Todo> listOfBusiness) {
        this.listOfBusiness = listOfBusiness;
    }

    public List<Todo> getListOfBusiness() {
        return listOfBusiness;
    }

    public void setListOfBusiness(List<Todo> listOfBusiness) {
        this.listOfBusiness = listOfBusiness;
    }

    @Override
    public String toString() {
        return "GroupTodo{" +
                "listOfBusiness=" + listOfBusiness +
                '}';
    }
}
