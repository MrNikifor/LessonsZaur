package LessonClassObgect.HW1;
/*
Задание:
Создайте 2 класса. 1-й назовите Student. Он должен содержать в себе следующие атрибуты:
 номер студенческогно билета, имя, фамилию, год обучения, средняя оценка по математике,
 средняя оценка по экономике, средняя оценка по иностранному языку.
 2-й класс назовите StudentTest.
 В нем вы должны будете создать 3 разных объекта класса Student.
 Вывести на экран в читабельном виде среднюю арифмитическую оценку каждого студента
 (учитывая все 3 предмета)
*/

public class Student {
    int StudentIDNumber;
    String name;
    String surname;
    int YearOfStudy;
    Double AverageGradeInMathematics;
    Double AverageGradeInEconomics;
    Double AverageGradeInAForeignLanguage;
}
class StudentTest{
    public static void main(String[] args) {
        Student Sergei1 = new Student();
        Sergei1.StudentIDNumber = 1;
        Sergei1.name = "Sergei";
        Sergei1.surname = "Markushov";
        Sergei1.YearOfStudy = 2021;
        Sergei1.AverageGradeInMathematics = 8.5;
        Sergei1.AverageGradeInEconomics = 9.2;
        Sergei1.AverageGradeInAForeignLanguage = 9.3;

        Student Misha1 = new Student();
        Misha1.StudentIDNumber = 2;
        Misha1.name = "Misha";
        Misha1.surname = "Bogatirev";
        Misha1.YearOfStudy = 2017;
        Misha1.AverageGradeInMathematics = 5.5;
        Misha1.AverageGradeInEconomics = 9.5;
        Misha1.AverageGradeInAForeignLanguage = 6.9;
        Student Kolya1 = new Student();
        Kolya1.StudentIDNumber = 3;
        Kolya1.name = "Kolya";
        Kolya1.surname = "Lagutin";
        Kolya1.YearOfStudy = 2013;
        Kolya1.AverageGradeInMathematics = 9.3;
        Kolya1.AverageGradeInEconomics = 8.1;
        Kolya1.AverageGradeInAForeignLanguage = 3.6;

        System.out.println("Average rating Sergeya " + "- " + ((Sergei1.AverageGradeInMathematics + Sergei1.AverageGradeInEconomics + Sergei1.AverageGradeInAForeignLanguage) / 3));
        System.out.println("Average rating Mishi " + "- " + ((Misha1.AverageGradeInMathematics + Misha1.AverageGradeInEconomics + Misha1.AverageGradeInAForeignLanguage) / 3));
        System.out.println("Average rating Koli " + "- " + ((Kolya1.AverageGradeInMathematics + Kolya1.AverageGradeInEconomics + Kolya1.AverageGradeInAForeignLanguage) / 3));
    }
}
