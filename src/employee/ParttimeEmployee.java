package employee;

public class ParttimeEmployee extends Employee {
    private int hour;
    private int salary;

    public ParttimeEmployee() {
    }

    public ParttimeEmployee(int hour, int salary) {
        this.hour = hour;
        this.salary = salary;
    }

    public ParttimeEmployee(int id, String name, int age, int phone, String email, int hour, int salary) {
        super(id, name, age, phone, email);
        this.hour = hour;
        this.salary = salary;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public int getSalary() {
        return (salary*hour/8);
    }

    @Override
    public String toString() {
        return "ParttimeEmployee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", phone=" + getPhone() +
                ", salary='" + getSalary() + '\'' +
                '}';
    }
}
