package LessonClassObgect.HW1;
/*
Задание 1:
Создайте 2 класса. 1-й назовите Student. Он должен содержать в себе следующие атрибуты:
 номер студенческогно билета, имя, фамилию, год обучения, средняя оценка по математике,
 средняя оценка по экономике, средняя оценка по иностранному языку.
 2-й класс назовите StudentTest.
 В нем вы должны будете создать 3 разных объекта класса Student.
 Вывести на экран в читабельном виде среднюю арифмитическую оценку каждого студента
 (учитывая все 3 предмета)
*/
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

public class Student {
    int StudentIDNumber;
    String name;
    String surname;
    int YearOfStudy;
    double averageGradeInMathematics;
    double averageGradeInEconomics;
    double averageGradeInAForeignLanguage;
}
class StudentTest{
    double AverageRating(Student st){
        double average = (st.averageGradeInAForeignLanguage + st.averageGradeInEconomics + st.averageGradeInMathematics) / 3;
        System.out.println("Average rating student " + st.name + " " + st.surname + " = " + average);
        return average;
    }

    public static void main(String[] args) {
        Student Sergei1 = new Student();
        Sergei1.StudentIDNumber = 1;
        Sergei1.name = "Sergei";
        Sergei1.surname = "Markushov";
        Sergei1.YearOfStudy = 2021;
        Sergei1.averageGradeInMathematics = 8.5;
        Sergei1.averageGradeInEconomics = 7.2;
        Sergei1.averageGradeInAForeignLanguage = 9.3;


        Student Misha1 = new Student();
        Misha1.StudentIDNumber = 2;
        Misha1.name = "Misha";
        Misha1.surname = "Bogatirev";
        Misha1.YearOfStudy = 2017;
        Misha1.averageGradeInMathematics = 5.5;
        Misha1.averageGradeInEconomics = 9.5;
        Misha1.averageGradeInAForeignLanguage = 6.9;

        Student Kolya1 = new Student();
        Kolya1.StudentIDNumber = 3;
        Kolya1.name = "Kolya";
        Kolya1.surname = "Lagutin";
        Kolya1.YearOfStudy = 2013;
        Kolya1.averageGradeInMathematics = 9.3;
        Kolya1.averageGradeInEconomics = 8.1;
        Kolya1.averageGradeInAForeignLanguage = 7.6;

        StudentTest test = new StudentTest();
        test.AverageRating(Sergei1);
        test.AverageRating(Misha1);
        test.AverageRating(Kolya1);

//        System.out.println("Average rating " + Sergei1.name + " " + Sergei1.surname + " - " + ((Sergei1.averageGradeInMathematics + Sergei1.averageGradeInEconomics + Sergei1.averageGradeInAForeignLanguage) / 3));
//        System.out.println("Average rating " + Misha1.name + " " + Misha1.surname + " - " + ((Misha1.averageGradeInMathematics + Misha1.averageGradeInEconomics + Misha1.averageGradeInAForeignLanguage) / 3));
//        System.out.println("Average rating " + Kolya1.name + " " + Kolya1.surname + " - " + ((Kolya1.averageGradeInMathematics + Kolya1.averageGradeInEconomics + Kolya1.averageGradeInAForeignLanguage) / 3));
    }
}
