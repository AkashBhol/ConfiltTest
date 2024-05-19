package Demo;

public class Student {
    private int id;
    private String name;
    private float sal;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSal(float sal) {
        this.sal = sal;
    }
    public String getName() {
        return name;
    }
    public float getSal() {
        return sal;
    }
    public Student(int id, String name, float sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", sal=" + sal + "]";
    }

    
}
