import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class GroupTodo {

    private List<ToDo> listOfBusiness;

    public GroupTodo() {
    }

    public GroupTodo(List<ToDo> listOfBusiness) {
        this.listOfBusiness = listOfBusiness;
    }

    @OneToMany (targetEntity = ToDo.class, mappedBy = "groupTodo")
    public List<ToDo> getListOfBusiness() {
        return listOfBusiness;
    }

    public void setListOfBusiness(List<ToDo> listOfBusiness) {
        this.listOfBusiness = listOfBusiness;
    }

    @Override
    public String toString() {
        return "GroupTodo{" +
                "listOfBusiness=" + listOfBusiness +
                '}';
    }
}
