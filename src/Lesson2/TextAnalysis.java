package Lesson2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class TextAnalysis {


    public static void main(String[] args) throws IOException {
        File file = new File("d:/data.txt");
        String text = new String(Files.readAllBytes(Paths.get(String.valueOf(file))), StandardCharsets.UTF_8);
        // 1.подсчитать количество слов.
        int wordsCount;
        String[] words = text.toLowerCase().replace("[,.!:?]", "").split("[-#$%^&!?,.0-9\\s]+");
        wordsCount = words.length;
        System.out.println("количество слов " + wordsCount);
        System.out.println("***************************");

//        Задание 2: Выведите на экран список различных слов файла, отсортированный по возрастанию их длины
//        (компаратор сначала по длине слова, потом по тексту).
        //    return obj1.name.compereTo(obj2.name); сравнивем имя 1 обьекта сравниваем со 2 именем
        List<String> list = Arrays.asList(words);
        Collections.sort(list, new WordAnalysis<String>());
        System.out.println("Выведите на экран список различных слов файла\n" + list);
        System.out.println("***************************");

        //Задание 3: Подсчитайте и выведите на экран сколько раз каждое слово встречается в файле.
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : words) {
     if (!map.containsKey(s)){
         map.put(s,1);
     }else {
         map.put(s,map.get(s)+1);
     }
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println("сколько раз каждое слово встречается в файле \n" + pair.getKey() + " " + pair.getValue() + "раз");
        }
        System.out.println("***************************");

        // Задание 4: Выведите на экран все строки файла в обратном порядке.
        List<String> reversList = Arrays.asList(words);
        Collections.reverse(reversList);
        System.out.println("Выведите на экран все строки файла в обратном порядке \n" + reversList);

        System.out.println("***************************");
        //Задание 5: Реализуйте свой Iterator для обхода списка в обратном порядке.
        List<String> stringArrayList = Arrays.asList(words);
        ReverseIterator<String> myIter = new ReverseIterator<>(stringArrayList);
        while (myIter.hasNext()) {

            System.out.print(" " + myIter.next());
        }

        System.out.println();
        System.out.println("***************************");

        //Задание 6: Выведите на экран строки, номера которых задаются пользователем в произвольном порядке.
        List<Integer> listNamber = Arrays.asList(2, 4, 7, 13);
        listNamber.stream().forEach((i) -> System.out.println(i + ": " + list.get(i)));

    }


}






