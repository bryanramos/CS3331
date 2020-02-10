import java.util.List;
public class Teacher extends Member {
    private int salary;
    public List<Student> students;

    public Teacher() { }

    // SETTERS
    void setSalary(int s) { 
        salary = s; 
    } 
    void addStudent(Student s) {
        students.add(s);
    }
    void removeStudent(Student s) {
        students.remove(s);
    }
    // GETTERS
    int getSalary() {
        return salary;
    }
}