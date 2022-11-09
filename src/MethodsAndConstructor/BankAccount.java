package MethodsAndConstructor;
/*
Задание 2:
1.В классе BankAccount Добавте 2 метода. Первый метод называется popolnenieScheta и увеличивает сумму которая укакзана в параметре этого метода.
Второй метод называется SnyatieSoScheta и уменьшает баланс на сумму, которая указана в параметре этого метода.
2.Измените  класс StudentTest так, чтобы среднюю арифмитическую оценку студента выводил на экран метод. Т.е.
создайте 1 метод, параметр которого - это объект класса Student1, а в теле метода будет вычисляться средняя арифмитическая оценка выводится на экран.
3.Создайте класс Employee с атрибутами id, surname, age, salary, departament, которые должны задаваться в конструкторе.
В данном классе также создайте метод увеличения зарплаты вдвое. Создайте второй класс EmployeeTest в котором создайте 2 объекта
класса Employee. Увеличте зарплату каждому работнику вдвое с помощью метода и выведите на экран значение этой зарплаты.
*/
public class BankAccount {
String name = "Igor";
Double balance = 50.0;

void popolnenieScheta(Double poplnenie){
    System.out.println("On the account of " + name + " - " + balance);
    System.out.println("Topped up the account for the amount " + " - " + poplnenie);
    balance += poplnenie;
    System.out.println("Invoice amount " + name + " after topping up the balance " + " - " + balance );
    System.out.println();
}
void snyatieSoScheta(Double snyatie){
    System.out.println("On the account of " + name + " - " + balance);
    System.out.println("Money was withdrawn in the amount of " + " - " + snyatie);
    balance -= snyatie;
    System.out.println("Invoice amount " + name + " after withdrawing funds " + " - " + balance );
    System.out.println();
}
}
class BankAccountTest{
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.popolnenieScheta(30.4);
        acc.snyatieSoScheta(50.7);
    }
}
