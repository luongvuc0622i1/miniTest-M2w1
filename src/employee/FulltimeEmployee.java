package employee;

public class FulltimeEmployee extends Employee {
    private int bonusSalary;
    private int deductionSalary;
    private int salary;

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(int bonusSalary, int deductionSalary, int salary) {
        this.bonusSalary = bonusSalary;
        this.deductionSalary = deductionSalary;
        this.salary = salary;
    }

    public FulltimeEmployee(int id, String name, int age, int phone, String email, int bonusSalary, int deductionSalary, int salary) {
        super(id, name, age, phone, email);
        this.bonusSalary = bonusSalary;
        this.deductionSalary = deductionSalary;
        this.salary = salary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public int getDeductionSalary() {
        return deductionSalary;
    }

    public void setDeductionSalary(int deductionSalary) {
        this.deductionSalary = deductionSalary;
    }

    @Override
    public int getSalary() {
        return (salary + bonusSalary + deductionSalary);
    }

    @Override
    public String toString() {
        return "FulltimeEmployee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", phone=" + getPhone() +
                ", salary='" + getSalary() + '\'' +
                '}';
    }
}
