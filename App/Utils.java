package App;

import java.util.List;

public class Utils {
    static Company initData() {
        Person firstPerson = new Person("Jan", "Testowy");
        Person secondPerson = new Person("Kazimierz", "Przykładowy");
        Person thirdPerson = new Person("Maria", "Demo");

        Employee firstEmployee = new Employee(firstPerson, Departament.SALES);
        Employee secondEmployee = new Employee(secondPerson, Departament.ADMINISTRATION);
        Employee thirdEmployee = new Employee(thirdPerson, Departament.FINANCE);

        Company company = new Company("Super Firma");

        List<Employee> employees = company.getEmployees();
        employees.add(firstEmployee);
        employees.add(secondEmployee);
        employees.add(thirdEmployee);

        return company;
    }

}
