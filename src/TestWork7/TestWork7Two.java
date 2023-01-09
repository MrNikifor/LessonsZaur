package TestWork7;
/*Задание 7:
        1.Пересоздайте класс Employee таким образом, чтобы переменная salary ,была недоступная вне класса,переменная surname была доступна отовсюду, а переменная id
        только внутри пакета. Также создайте 3 public метода, которые будут показывать на дисплее значение этих перменных.
        Создайте для данного класса 3 разных конструктора с public, default и private access modifier-ми.
        В конструкторе присваивайте переменным класса значения из параметров. Создайте новые классы в том и другом пакете.
        Попытайтесь в них создать объекты класса Employee и вывести на экран значения переменных данного объекта с помощью метода print
        и методов самого класса.
        */
import MethodsAndConstructor.Employee;

public class TestWork7Two {
    public static void main(String[] args) {
        Employee empTest = new Employee(5);
//        Employee empTest1 = new Employee("Inna");
//        Employee empTest2 = new Employee(60000.50);

        //System.out.println(empTest.id);
        System.out.println(empTest.surname);
        //System.out.println(empTest.salary);

        empTest.showId();
        empTest.showSurname();
        empTest.showSalary();
    }
}
