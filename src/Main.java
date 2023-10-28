import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        StudentStream stream = new StudentStream(1);

        System.out.println("Поток студентов:");
//Формируем разные группы студентов
        StudentGroup group1 = new StudentGroup("Group 1", 20);
        StudentGroup group2 = new StudentGroup("Group 2", 15);
        StudentGroup group3 = new StudentGroup("Group 3", 10);

        // Добавляем группы в поток
        stream.addGroup(group1);
        stream.addGroup(group2);
        stream.addGroup(group3);

        // Выводим группы в консоль по дефолту (по порядку)
        for (StudentGroup group : stream) {
            System.out.println(group);
        }

        System.out.println("\nОтсортированный поток студентов:");
        // Выводим группы в консоль с сортировкой по количеству студентов по возрастанию
        Collections.sort(stream.getGroups());
        for (StudentGroup group : stream) {
            System.out.println(group);
        }
    }
} 