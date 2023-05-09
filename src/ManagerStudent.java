import java.util.Scanner;

public class ManagerStudent {
    Student[] students = new Student[2];
    Scanner scanner = new Scanner(System.in);

    ManagerStudent() {
        students[0] = new Student(1, "Tùng", 20);
        students[1] = new Student(2, "Vương", 21);
    }

    public void show() {
        for (Student s : students) {
            System.out.println(s.getId() + " - " + s.getName() + " - " + s.getAge());
        }
    }

    public void add(){
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập Age");
        int age = Integer.parseInt(scanner.nextLine());

        Student student = new Student(id,name,age);

        Student[] newStudents = new Student[students.length + 1];
        newStudents[newStudents.length -1] = student;
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        students = newStudents;
    }


}
