package LessonAboutArrayList;

import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayListLesson arrayList = new ArrayListLesson();
//        arrayList.someMethode();
//        arrayList.seeArray();
//--------------------------------------------------------------------------------------------------------------------//
        //arrayList.add();
        arrayList.addOneHundredElements();
//--------------------------------------------------------------------------------------------------------------------//
        //Scanner scanner = new Scanner(System.in);
        arrayList.getElementIndex(5);
//--------------------------------------------------------------------------------------------------------------------//
        arrayList.sizeOurArrayList();
//--------------------------------------------------------------------------------------------------------------------//
        // arrayList.allElementInArray();
        arrayList.allElementInArray1();
//--------------------------------------------------------------------------------------------------------------------//
        arrayList.removeElement(4);
        arrayList.allElementInArray1();//для проверки удаления
    }
}
