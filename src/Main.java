import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //LIST
//        List<String> maleNames = new ArrayList<>(); //создаем мужской список
//
//        //заполняем
//        maleNames.add("Vasya");
//        maleNames.add("Kolya");
//        maleNames.add("Petya");
//        maleNames.add("Ivan");
//        maleNames.add("Fedya");
//
//        //выводим
//        for (String i: maleNames) {
//            System.out.println(i);
//        }
//
//        System.out.println();
//        //проверка на содержание имени
//        if(maleNames.contains("Gena")){
//            System.out.println("The list contains the name Gena");
//        }
//        else System.out.println("The list doesn't contains the name Gena");
//
//        System.out.println();
//        //удаление обьекта
//        System.out.println("Remove object");
//        maleNames.remove("Petya");
//        for (String i: maleNames) {
//            System.out.println(i);
//        }
//
//        System.out.println();
//        //удаление обьекта по интексу
//        System.out.println("Remove object by index");
//        maleNames.remove(2);
//        for (String i: maleNames) {
//            System.out.println(i);
//        }

        //создаем женский список
//        List <String> femaleNames = new ArrayList<>();
//        femaleNames.add("Ira");
//        femaleNames.add("Klava");
//        femaleNames.add("Sveta");
//        femaleNames.add("Dusia");
//        femaleNames.add("Masha");
//
//        for (String i: femaleNames) {
//            System.out.println(i);
//        }
//
//        System.out.println();
//        //добавляем коллекцию жен имен в мужскую
//        System.out.println("Add femaleNames collection to maleNames");
//        maleNames.addAll(femaleNames);
//        for (String i: maleNames) {
//            System.out.println(i);
//        }
//
//        int count = 0;
//        for (String i:maleNames) {
//            count++;
//        }
//        System.out.println("The quantity of elements in this collection = " + count);

//        //QUEUE
//        Queue<String> surnames = new LinkedList<>();
//        surnames.add("Ivanov");
//        surnames.add("Petrov");
//        surnames.add("Sidorov");
//        surnames.add("Pupkin");
//        surnames.add("Vasechkin");
//
//        Iterator<String> itr = surnames.iterator();
//        while (itr.hasNext()) {
//            System.out.println("Doctor calls pationt " + surnames.poll());
//            Thread.sleep(1000);
//        }

        //STACK
        Stack<String> plates = new Stack<>();
        plates.push("Big");
        plates.push("Middle");
        plates.push("Small");

        System.out.println(plates);
        System.out.println("The plate " + plates.pop() + " in cupboard");
        System.out.println("The plate " + plates.pop() + " in cupboard");
        System.out.println("The plate " + plates.pop() + " in cupboard");
        System.out.println(plates);
        System.out.println("All plates in cupboard");

    }
}
