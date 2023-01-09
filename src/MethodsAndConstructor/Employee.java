package MethodsAndConstructor;
/*
Задание 5:
1.В классе BankAccount Добавте 2 метода. Первый метод называется popolnenieScheta и увеличивает сумму которая укакзана в параметре этого метода.
Второй метод называется SnyatieSoScheta и уменьшает баланс на сумму, которая указана в параметре этого метода.
2.Измените  класс StudentTest так, чтобы среднюю арифмитическую оценку студента выводил на экран метод. Т.е.
создайте 1 метод, параметр которого - это объект класса Student1, а в теле метода будет вычисляться средняя арифмитическая оценка выводится на экран.
3.Создайте класс Employee с атрибутами id, surname, age, salary, departament, которые должны задаваться в конструкторе.
В данном классе также создайте метод увеличения зарплаты вдвое. Создайте второй класс EmployeeTest в котором создайте 2 объекта
класса Employee. Увеличте зарплату каждому работнику вдвое с помощью метода и выведите на экран значение этой зарплаты.

Задание 7:
1.Пересоздайте класс Employee таким образом, чтобы переменная salary ,была недоступная вне класса,переменная surname была доступна отовсюду, а переменная id
только внутри пакета. Также создайте 3 public метода, которые будут показывать на дисплее значение этих перменных.
Создайте для данного класса 3 разных конструктора с public, default и private access modifier-ми.
В конструкторе присваивайте переменным класса значения из параметров. Создайте новые классы в том и другом пакете.
Попытайтесь в них создать объекты класса Employee и вывести на экран значения переменных данного объекта с помощью метода print
и методов самого класса.
*/
public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String departament;

    Employee( int id2, String surname2, int age2, double salary2,String departament2 ){
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        departament = departament2;
    }

    public Employee(int id) {
        this.id = id;
    }

    Employee(String surname) {
        this.surname = surname;
    }

    private Employee(double salary) {
       this.salary = salary;
    }

    public void showSurname(){
        System.out.println("Surname employee" + "  " + surname);
    }
    public void showId(){
        System.out.println("Id employee" + " - " + id);
    }
    public void showSalary(){
        System.out.println("Salary employee" + " - " + salary);
    }
    double doubleSalary(){
        salary *= 2;
        return salary;
    }
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(3, "Evdokimov", 33, 55000, "Traktorist");
        Employee emp2 = new Employee(5, "Navalow", 27, 220000, "It");

        System.out.println("Salary increase employee " + emp1.departament + " " + emp1.surname + " " + " = " + emp1.doubleSalary());
        System.out.println();
        System.out.println("Salary increase employee " + emp2.departament + " " + emp2.surname + " " + " = " + emp2.doubleSalary());

        //Задание 7
         Employee empTest1 = new Employee(5);
         Employee empTest2 = new Employee("Yra");
         // Employee empTest3 = new Employee(10000,5);

        System.out.println(empTest1.id);
        System.out.println(empTest1.surname);
        // System.out.println(empTest1.salary);

        empTest1.showId();
        empTest1.showSurname();
        empTest1.showSalary();
    }
}
