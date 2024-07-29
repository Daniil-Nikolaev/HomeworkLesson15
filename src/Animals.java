import java.util.Deque;
import java.util.LinkedList;

public class Animals {
    String animal;

    Deque <String> animals = new LinkedList();

    public void add(String animal){
        animals.addFirst(animal);
    }

    public void remove(){
        animals.removeLast();
    }

    @Override
    public String toString() {
        return "Animals{" +
                "animals=" + animals +
                '}';
    }
}
