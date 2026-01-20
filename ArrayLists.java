/*
 * What is ArrayList?
 * It is one of the most important concept of collection framework in java which is little bit similar to Arrays but very different from Arrays.
 * 
 * In arrays we store the data as chunks and this has certain properties like :-
 * 1. It has fixed size.
 * 2. The chunks are stored in a continuous memory location.
 * 3. In arrays we can store only Primitive data-types like int, float, char, string etc.
 * 
 * The ArrayList over comes the above disadvantages of Arrays as :-
 * 1. It doesn't have fixed size.
 * 2. The chunks are stored in a non-continuous memory location.
 * 3. In ArrayList we can store only as Objects.
 * 4. ArrayList is stored in Heap memory.
 * 
 * Before starting from the scratch of Data Structures we have to study about Collection Frameworks.
 * 
 * What is Collection Framework?
 * We know how to implement the data structures from scratch but when we go for competitive programming then we don't have to create data structures from scratch there are already data structures present in JAVA we just need to implement them.
 * 
 */

/*
 * On every collection we do perform some operations, and we are going to do the same on ArrayList too.
 * 
 * Operations in ArrayList :-
 * 1. Add :- To add the elements in ArrayList.
 * 2. Get :- To retrieve the element from certain index in ArrayList.
 * 3. Modify :- To modify / replace element at certain index in ArrayList.
 * 4. Delete / Remove :- To delete element at certain index in ArrayList.
 * 5. Iterate :- To loop over and ArrayList.
 * 
 * To use ArrayList in JAVA we need to import the package called "import java.util.ArrayList;"
 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String args[]) {
        // As we discussed earlier that we store the objects in the ArrayList so we
        // cannot use int, float, boolean etc. here, instead we have to use class of
        // this data-types such as Integer, Float, Boolean, String, etc. i.e. it starts
        // with Uppercase and we have to write fullName of the datatype.

        // Both the methods below are correct to create an ArrayList.
        // ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Boolean> list2 = new ArrayList<>();
        // ArrayList<String> list3 = new ArrayList<>();

        // To add elements :- Elements are added at the end of the ArrayList.
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(56);

        System.out.println(list);

        // To get elements :-
        int element = list.get(1);
        System.out.println(element);

        // To add elements in between the ArrayList :-
        list.add(1, 1); // element added at the 1st index and the element added is 1.
        System.out.println(list);

        // To replace element we use set(); here 1st value is index and 2nd value is
        // element.
        list.set(0, 5);
        System.out.println(list);

        // To delete the element from certain index we use remove();
        list.remove(4);
        System.out.println(list);

        // To get the length / size of the ArrayList :-
        int size = list.size();
        System.out.println(size);

        // To loop over the ArrayList :-
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        // Sort :- In ArrayList we can sort the elements in ascending order easily by
        // using 'Collections.sort()' function which is already optimized and to use
        // this we need to import is as "import java.util.Collections;"
        Collections.sort(list);
        System.out.println(list);

        // This sorting function cannot be used on Array.

        // That's all we need to know about ArrayList. It is very rare that we'll use
        // any functions other than the discussed above.
    }
}
/*---------------------------------------------------------------- */

