import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class GroupTodo {

    private List<Todo> listOfBusiness;

    public GroupTodo() {
    }

    public GroupTodo(List<Todo> listOfBusiness) {
        this.listOfBusiness = listOfBusiness;
    }

    @OneToMany (targetEntity = Todo.class, mappedBy = "groupTodo")
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
