import java.util.list;

public class people {
    private Sring name;
    private List<People> data;

    public Sting getName() { return name; }

    public List<People> getPeople() { return people; }

    public void setName(String name) {
        this.name = name;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + "\'" +
                ", people=" + people + "}";
    }
}
