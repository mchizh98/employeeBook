public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.printEmployees();

        System.out.println("Сумма затрат на зарплаты в месяц : " +storage.calculateAllSalary());

        System.out.println("Сотрудник с минимальной зарплатой : " +storage.findMinSalaryEmployee());

        System.out.println("Сотрудник с максимальной зарплатой : " + storage.findMaxSalaryEmployee());

        System.out.println("Средняя зарплата : " + storage.calculateAverageSalary());

        storage.printFullName();
    }
}