public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Иван", "Иванов", 45, 50000);
        Employee employee2 = new Employee("Пётр", "Петров", 24, 20000);
        Employee employee3 = new Employee("Семён", "Семёнов", 40, 35000);
        Employee employee4 = new Employee("Андрей", "Андреев", 24, 20000);
        Employee employee5 = new Employee("Максим", "Максимов", 40, 35000);
        employee1.printInfo();
        employee2.printInfo();
        employee3.printInfo();
        employee4.printInfo();
        employee5.printInfo();
        System.out.println("-------------------------");

        Employee[] persArray = new Employee[5];
        persArray[0] = employee1;
        persArray[1] = employee2;
        persArray[2] = employee3;
        persArray[3] = employee4;
        persArray[4] = employee5;
        for (int i=0; i < persArray.length; i++)
            if (persArray[i].getAge() > 40) persArray[i].printInfo();


    }
}
