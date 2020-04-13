import java.util.List;

public class Group {

    private String name;
    private List<Person> persons;

    public Group() {
    }

    public Group(String name, List<Person> persons) {
        this.name = name;
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "{\"name\":" + name +
                ",\"persons\":" + persons +
                "}";
    }
}