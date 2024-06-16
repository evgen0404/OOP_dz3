// Создать класс Студент
// � Создать класс УчебнаяГруппа
// � Создать класс УчебнаяГруппаИтератор, заставив его реализовать
// интерфейс Iterator
// � Реализовать его контракты (включая удаление)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {

        StudentGroup studentGroup1 = new StudentGroup();
        StudentGroup studentGroup2 = new StudentGroup();
        StudentGroup studentGroup3 = new StudentGroup();

        Student van = new Student("Van", 4);
        Student igor = new Student("Igorechick", 1);
        Student alex = new Student("Alex", 2);
        Student alexey = new Student("Alexey", 3);


        // studentGroup.addStudent(van);
        // studentGroup.addStudent(igor);
        // studentGroup.addStudent(alex);
        // studentGroup.addStudent(alexey);

        // System.out.println("студенты " + studentGroup.students);
        // Iterator<Student> iterator = new StudentGroupIterator(studentGroup);

        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        // for(Student student: studentGroup) {
        //     System.out.println(student);
        // }

        // ArrayList<Student> arrayList = new ArrayList<>(List.of(van, igor, alex, alexey));

        // System.out.println(arrayList);

        // public int compare(Student o1, Student o2) {
        //     return o1.id - o2.id;
        // }
        // Collections.sort(arrayList, (s1, s2) -> s1.id - s2.id); // лямда выражение

        // Collections.sort(arrayList, new StudentComparator()); // сортировка, второй аргумент обратная сортировка
        // System.out.println(arrayList);

        studentGroup1.addStudent(van);
        studentGroup1.addStudent(igor);
        studentGroup2.addStudent(alex);
        studentGroup3.addStudent(alexey);

        StreamGroup streamGroup1 = new StreamGroup("Поток 1",new ArrayList<>(Arrays.asList(studentGroup1, studentGroup2)));
        StreamGroup streamGroup2 = new StreamGroup("Поток 2",new ArrayList<>(Arrays.asList(studentGroup1, studentGroup2, studentGroup3)));
        StreamGroup streamGroup3 = new StreamGroup("Поток 3",new ArrayList<>(Arrays.asList(studentGroup1)));
        
        List<StreamGroup> streamGroups = new ArrayList<>(Arrays.asList(streamGroup1, streamGroup2, streamGroup3));

        StreamGroupService service = new StreamGroupService();
        service.sortStreamGroups(streamGroups);

        for (StreamGroup streamGroup : streamGroups) {
            System.out.println(streamGroup.toString());
        }
    }

}