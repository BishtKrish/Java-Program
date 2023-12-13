import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesExample {

    public static void main(String[] args) {
        ArrayList<Integer> numbersWithDuplicates = new ArrayList<>();
        numbersWithDuplicates.add(5);
        numbersWithDuplicates.add(10);
        numbersWithDuplicates.add(5);
        numbersWithDuplicates.add(20);
        numbersWithDuplicates.add(10);
        numbersWithDuplicates.add(30);

        ArrayList<Integer> numbersWithoutDuplicates = removeDuplicates(numbersWithDuplicates);

        System.out.println("Original ArrayList with Duplicates: " + numbersWithDuplicates);
        System.out.println("ArrayList without Duplicates: " + numbersWithoutDuplicates);
    }

    private static ArrayList<Integer> removeDuplicates(ArrayList<Integer> listWithDuplicates) {
 
        HashSet<Integer> set = new HashSet<>(listWithDuplicates);

        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(set);

        return listWithoutDuplicates;
    }
}

