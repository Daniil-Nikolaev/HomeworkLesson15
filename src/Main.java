import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        //1.
        System.out.println("Введите числа через запятую : ");
        String numbers = sc.nextLine();

        Set <String> set = new HashSet<>();
        for (int i = 0; i < numbers.length(); i++) {
            set.add(numbers.charAt(i)+"");
        }
        System.out.println(set);
//        //2.
        Animals animals = new Animals();
        animals.add("elephant");
        System.out.println(animals);
        animals.add("dog");
        System.out.println(animals);
        animals.add("cat");
        System.out.println(animals);
        animals.add("monkey");
        System.out.println(animals);
        animals.remove();
        System.out.println(animals);
        animals.remove();
        System.out.println(animals);
        //3.
        University university = new University();
        System.out.println(university.listStudent());
        university.progress();
        System.out.print(university.listStudent());
        university.printStudents(university.listStudent(),1);




        


    }
}