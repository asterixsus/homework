public class Employee {
    private String firstname;
    private String lastname;
    private int age;
    private int wages;

    public Employee(String firstname, String lastname, int age, int wages) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.wages = wages;

    }

    public String getFirstname() {
        return this.firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    public int getAge() {
        return this.age;
    }
    public int getWages() {
        return this.wages;
    }
    public void printInfo() {
        System.out.println("Имя: " + getFirstname() + " Фамилия: " + getLastname() + " Возраст: " + getAge() + " Зарплата: " + getWages());
    }

}
