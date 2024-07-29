import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class University {
    private List<Student> student = new ArrayList<>();

    public List<Student> listStudent() {
        student.add(new Student("oleg", 1, 1, 1, 1, 1));
        student.add(new Student("jerry", 2, 2, 2, 2, 2));
        student.add(new Student("james", 3, 3, 3, 3, 3));
        student.add(new Student("mike", 4, 4, 4, 4, 4));
        return student;
    }

    public void progress(){
        Iterator<Student> it = student.listIterator();
        while(it.hasNext()){
            Student s = it.next();
            if(s.getGpa()<3){
                System.out.println("Студент "+s.getName()+" отчислен");
                it.remove();
            }else {
                System.out.println("Студент "+s.getName()+" переходит на новый курс");
                s.setCourse(s.getCourse()+1);
            }
        }
    }

    public static void printStudents(List<Student> student, int course) {
        Iterator<Student> it = student.listIterator();
        System.out.println(" ");
        System.out.println("Студенты на курсе: ");
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }

    }
}
