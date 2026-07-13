public class Main{
    public static void main(String[] args) {
        Employee employee = new Employee(1, "ayush", "IT");
        System.out.printf("Employee name = %s, department = %s\n", employee.name, employee.department);

        Employee employee2 = new Employee(2, "devansh");
        System.out.printf("\nEmployee name = %s, department = %s\n", employee2.name, employee2.department);

        Student student = new Student(1, "Yash", "Mathematics");
        System.out.printf("\nStudent id = %s, name = %s, course  = %s", student.id, student.name, student.course);
    }
}