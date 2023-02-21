package DinamicStructureData;

import java.util.ArrayList;

public class Task1List {
    public static void main(String[] args) {
        int[] array = new int[4];
        //array[4] = 7;
        int[] array2 = {1,2,3};
        array[3] =2;


        ArrayList<String> myList = new ArrayList<>(); //Динамическая структура тип: ArrayList в которой будут храниться элементы с типом данных <Integer> или String, Objects
        myList.add("Яблоко");
        myList.add("Груша");
        myList.add("Банан");
        myList.add(3,"Малина");
        System.out.println(myList);
        myList.add(1,"Слива");
        System.out.println(myList); // Вклинили сливу на вместо между яблоком и грушей
        System.out.println(myList.get(3));
        System.out.println(myList.indexOf("Банан"));

        myList.remove(0);   //Удалили первый индекс
        myList.remove("Малина");//Удалили малину
        System.out.println(myList);


    }
}
