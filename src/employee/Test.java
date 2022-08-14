package employee;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        FulltimeEmployee employee1 = new FulltimeEmployee(01, "employee1", 20, 0000, "email1",50, 3, 2000);
        FulltimeEmployee employee2 = new FulltimeEmployee(02, "employee2", 20, 0000, "email1",50, 6, 1500);
        FulltimeEmployee employee3 = new FulltimeEmployee(03, "employee3", 20, 0000, "email1",100, 9, 2100);
        FulltimeEmployee employee4 = new FulltimeEmployee(04, "employee4", 20, 0000, "email1",100, 0, 2500);
        FulltimeEmployee employee5 = new FulltimeEmployee(05, "employee5", 20, 0000, "email1",100, 3, 2300);

        ParttimeEmployee employee6 = new ParttimeEmployee(06, "employee6", 25, 0001, "email2", 4, 1500);
        ParttimeEmployee employee7 = new ParttimeEmployee(07, "employee7", 25, 0001, "email2", 10, 1800);
        ParttimeEmployee employee8 = new ParttimeEmployee(10, "employee8", 27, 0001, "email2", 6, 1500);
        ParttimeEmployee employee9 = new ParttimeEmployee(11, "employee9", 25, 0001, "email2", 8, 1800);
        ParttimeEmployee employee10 = new ParttimeEmployee(12, "employee10", 25, 0001, "email2", 4, 1500);

        Employee[] employeeList = {employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9, employee10};

        //Lương trung bình toàn công ty
        double sum=0;
        for(Employee e: employeeList) {
            sum += e.getSalary();
        }
        double avg = sum/employeeList.length;
        System.out.println("Lương trung bình của nhận viên cả công ty là: " + avg);

        //Nv full có lương < luong trung bình
        System.out.println("\nDanh sách nhân viên toàn thời gian có lương thấp hơn tb là: ");
        for(Employee e: employeeList) {
            if (e instanceof FulltimeEmployee && e.getSalary() < avg) {
                System.out.println(e);
            }
        }

        //Số lương phải trả cho tất cả nhân viên parttime:
        System.out.println("\nBảng lương parttime:");
        sum=0;
        for (Employee e: employeeList) {
            if (e instanceof ParttimeEmployee) {
                System.out.println(e);
                sum += e.getSalary();
            }
        }
        System.out.println("Tổng số tiền trả lương cho parttime là: " + sum);

        //Sắp xếp nhân viên toàn thời gian theo số lương tăng dần
        System.out.println("\nDanh sách lương của Fulltime tăng dần là:");
        Arrays.sort(employeeList);
        for (Employee e: employeeList) {
            if (e instanceof FulltimeEmployee) {
                System.out.println(e);
            }
        }
    }
}
