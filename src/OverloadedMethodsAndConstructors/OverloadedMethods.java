package OverloadedMethodsAndConstructors;
/*Задание 6:
1. Создайте класс, в котором будут 5 overloaded методов, которые вычесляют сумму нуля, одного, двух, трех и четырех целых чисел
соответственно, передают эту сумму в output и выводят ее на экран. В случае когда слогаемые отсутствуют (т.е. когда параметров нет).
сумма пусть равняется 0.
2. Измените класс Student так, чтобы имели 3 конструктора.
1 - принемает все параметры.
2 - только id, name, surname, course.
3 - не имеет значений. Создайте в классе StudentTest 3 объекта с помощью разных конструкторов.
*/
public class OverloadedMethods {
    int suma(){
        int result = 0;
        System.out.println("Method amount " + " = " + result);
        return result;
    }
    int suma(int a){
        int result1 = a;
        System.out.println("Method amount " + " = " + result1);
        return result1;
    }
    int suma(int a, int b){
        int result2 = a+b;
        System.out.println("Method amount " + " = " + result2);
        return result2;
    }
    int suma(int a, int b, int c){
        int result3 = a+b+c;
        System.out.println("Method amount " + " = " + result3);
        return result3;
    }
    int suma(int a, int b, int c, int d){
        int result4 = a+b+c+d;
        System.out.println("Method amount " + " = " + result4);
        return result4;
    }

}
class Summa{
    public static void main(String[] args) {
       OverloadedMethods s = new OverloadedMethods();
       s.suma();
       s.suma(2);
       s.suma(3,4);
       s.suma(5,6,7);
       s.suma(4,5,9,7);

    }

}
