public class Student extends Member {
    private char classification;
    private Teacher teacher;

    public Student() {}

    public Student(int id, String n, char c, String teacherName) {
        super(id, n);
        classification = c;
    }

    // SETTERS
    void setClassification(char c) {
        classification = c;
    }
    void setTeacherName(String s) {
        teacher.name = s;
    }
    // GETTERS
    char getClassification() {
        return classification;
    }
    String getTeacherName() {
        return teacher.getName();
    }
}