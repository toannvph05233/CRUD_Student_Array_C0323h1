import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerStudent managerStudent = new ManagerStudent();
        while (true) {
            System.out.println("---------------------------------------------------");
            System.out.println("Quản Lý Sinh Viên");
            System.out.println("1. Hiển Thị");
            System.out.println("2. Thêm Sinh Viên");
            System.out.println("3. Sửa Sinh Viên");
            System.out.println("4. Xóa Sinh Viên");
            System.out.println("5. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    // hiển thị;
                    managerStudent.show();
                    break;
                case 2:
                    // Thêm
                    managerStudent.add();
                    break;
                case 3:
                    // sửa: nhập id muốn sửa
                    managerStudent.edit();
                    break;
                case 4:
                    // xóa theo id;
                    managerStudent.delete();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
