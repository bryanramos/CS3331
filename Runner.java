public class Runner {
    public static void main(String[] args) {
        Student s = new Student();

        s.setID(1234);
        s.setName("John");
        s.setClassification('J');
        s.setTeacherName("Omar");

        System.out.println("Student ID: " + s.getID());
        System.out.println("Name: " + s.getName());
        System.out.println("Classification: " + s.getClassification());
        System.out.println("Teacher Name: " + s.getTeacherName());
    }
}