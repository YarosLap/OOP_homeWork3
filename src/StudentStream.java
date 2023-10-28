import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Реализуем интерфейс Iterable
class StudentStream implements Iterable<StudentGroup> {

    private final int streamNumber;
    private final List<StudentGroup> groups;

    public StudentStream(int streamNumber) {
        this.streamNumber = streamNumber;
        this.groups = new ArrayList<>();
    }

// Добавляем группу в поток
    public void addGroup(StudentGroup group) {
        this.groups.add(group);
    }

    // Возвращаем номер потока
    public int getStreamNumber() {
        return streamNumber;
    }


    public List<StudentGroup> getGroups() {
        return groups;
    }


// Задействуем iterator
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();

    }
}

class StudentGroup implements Comparable<StudentGroup> {
    private String name;
    private int numberOfStudents;

    public StudentGroup(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;

    }

    public String getName() {
        return name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    // Реализуем сравнение количества студентов
    public int compareTo(StudentGroup otherGroup) {
        return Integer.compare(this.numberOfStudents, otherGroup.numberOfStudents);
    }


// Реализуем корректный вывод информации
    public String toString() {

        return "Group " + name + " (" + numberOfStudents + " students)";

    }
}
