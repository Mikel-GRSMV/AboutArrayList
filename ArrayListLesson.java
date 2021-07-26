package LessonAboutArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLesson {

//   private int[] x = new int[3];
//
//   public void someMethode(){
//        for (int i = 0; i < x.length; i++) { //если в размере укажем больше элементов то будет ошибка переполнения
//            // для избежания такой ошибки и был придуман ArrayList
//            x[i] = 1; // в каждую ячейку массива поместим число 1
//        }
//   }
//
//    public void seeArray(){
//        for (int i = 0; i < x.length; i++) {
//            System.out.println(i + " - " + x[i]);
//        }
//    }

    List<Integer> arrayList = new ArrayList();//можно вместо List ссылать на ArrayList(но так не совсем праильно)(!)

    //первый метод ArrayList - add(). Он добавляет элемент в массив
    public void add() { //добавление элемента при помощи метода add
        arrayList.add(1);
        System.out.println(arrayList);
    }

    public void addOneHundredElements() {
        for (int i = 2; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);//и тк у всех объектов класса ArrayList определен метод ToString у нас будет
        // отображено содержимое этого List'а
    }

    //второй метод ArrayList - get(). Он позволяет взять массив по индексу
    public void getElementIndex(int index) {
        System.out.println(arrayList.get(index));
    }

    //третий метод ArrayList - size(). Он позволяет уивидить размер этого List'а
    public void sizeOurArrayList() {
        System.out.println(arrayList.size());
    }

    //Способы прохождения по элементам ArrayList'а
    public void allElementInArray() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
    public void allElementInArray1() {
        for (Integer element : arrayList) {
            System.out.println(element);
        }
    }

    //четвертый метод ArrayList - remove(). Он позволяет удалить элемент по индексу
    public void removeElement(int index) { //удаляется элемент и все остальные элементы переносятся влево и это не эффективно
        //для решения этой проблемы используется LinkedList
        arrayList.remove(index);
        //(!) Это делается вот здесь
    }
}























