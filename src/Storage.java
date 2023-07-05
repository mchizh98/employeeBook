public class Storage {
    private static Employee[] employees = new Employee[10];
    public Storage (){
        employees[0] = new Employee("Гришко","Оксана","Валерьевна",1,10000);
        employees[1] = new Employee("Алидина","Александра","Игоревна",2,13000);
        employees[2] = new Employee("Королёва","Ксения","Алексеевна",3,15000);
        employees[3] = new Employee("Пухова","Кристина","Игоревна",4,20000);
        employees[4] = new Employee("Чиж","Мария","Вячеславовна",5,90000);
        employees[5] = new Employee("Кошимбаева","Алия","Аслановна",6,35000);
        employees[6] = new Employee("Имарова","Ольга","Ивановна",7,12000);
        employees[7] = new Employee("Быкова","Олеся","Родионовна",8,16000);
        employees[8] = new Employee("Горова","Алина","Ростиславовна",9,21000);
        employees[9] = new Employee("Пушко","Эвелина","Святославовна",10,25000);
    }

    public void printEmployees(){
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
    public double calculateAllSalary(){
        double salaries = 0;
        for (Employee employee : employees){
            salaries += employee.getSalary();
        }
        return salaries;
    }

    public Employee findMinSalaryEmployee(){
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees){
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public Employee findMaxSalaryEmployee(){
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees){
            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public double calculateAverageSalary(){
        return calculateAllSalary() / employees.length;
    }

    public void printFullName(){
        for (Employee employee : employees){
            System.out.println(employee.getFullName());
        }
    }
}
