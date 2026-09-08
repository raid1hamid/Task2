import java.util.Date;
import java.util.Map;

public class Main {


    public static double calculateQASalary(Employee employee) {
        return 1000;
    }


    public static double calculateBESalary(Employee employee) {
        return 1500;
    }


    public static double calculateFESalary(Employee employee) {
        return 1400;
    }


    public static double calculateHRSalary(Employee employee) {
        return 1200;
    }

    public static void main(String[] args) {

        // إنشاء الموظفين
        Employee employee1 = new Employee(
                1,
                "Ahmad",
                "Ali",
                new Date(),
                Employee.PositionEnum.QA
        );

        Employee employee2 = new Employee(
                2,
                "Ali",
                "Rami",
                new Date(),
                Employee.PositionEnum.BE
        );

        Employee employee3 = new Employee(
                3,
                "Omar",
                "Hassan",
                new Date(),
                Employee.PositionEnum.FE
        );

        Employee employee4 = new Employee(
                4,
                "Sara",
                "Ahmad",
                new Date(),
                Employee.PositionEnum.HR
        );



        Map<Employee.PositionEnum, SalaryCalculator> salaryCalculators = Map.of(

                Employee.PositionEnum.QA,
                Main::calculateQASalary,

                Employee.PositionEnum.BE,
                Main::calculateBESalary,

                Employee.PositionEnum.FE,
                Main::calculateFESalary,

                Employee.PositionEnum.HR,
                Main::calculateHRSalary
        );



        double salary1 =
                salaryCalculators
                        .get(employee1.getPosition())
                        .calculate(employee1);

        double salary2 =
                salaryCalculators
                        .get(employee2.getPosition())
                        .calculate(employee2);

        double salary3 =
                salaryCalculators
                        .get(employee3.getPosition())
                        .calculate(employee3);

        double salary4 =
                salaryCalculators
                        .get(employee4.getPosition())
                        .calculate(employee4);


        // الطباعة
        System.out.println(
                employee1.getFirstName()
                        + " - "
                        + employee1.getPosition()
                        + " - Salary: "
                        + salary1
        );

        System.out.println(
                employee2.getFirstName()
                        + " - "
                        + employee2.getPosition()
                        + " - Salary: "
                        + salary2
        );

        System.out.println(
                employee3.getFirstName()
                        + " - "
                        + employee3.getPosition()
                        + " - Salary: "
                        + salary3
        );

        System.out.println(
                employee4.getFirstName()
                        + " - "
                        + employee4.getPosition()
                        + " - Salary: "
                        + salary4
        );
    }
}