package Lesson3Generics;

import java.util.HashMap;
import java.util.Map;

public class CountMapImpl<Type> implements CountMap<Type> {
    private final Map<Type, Integer> map = new HashMap<>();

    @Override
    public void add(Type type) {
        Integer count = map.get(type);
        if (count == null) {
            count = 0;
        }
        map.put(type, ++count);
    }

    @Override
    public int getCount(Type type) {
        return map.get(type);
    }

    @Override
    public int remove(Type type) {
        return map.remove(type);
    }

    @Override
    public int size() {
        return map.size();
    }

    //Добавить все элементы из source в текущий контейнер,
    // при совпадении ключей,     суммировать значения
    @Override
    public void addAll(CountMap<Type> source) {
        for (Type key : source.toMap().keySet()) {
            Integer count = map.get(key);
            if (count == null) {
                count = 0;
            }
            map.put(key, source.getCount(key) + count);
        }
    }

    //Вернуть java.util.Map. ключ - добавленный элемент,
    // значение - количество его добавлений
    @Override
    public Map<Type, Integer> toMap() {
        return map;
    }

    @Override
    public void toMap(Map<Type, Integer> destination) {
        for (Type key : map.keySet()) {
            destination.put(key, map.get(key));
        }
    }

    public static void main(String[] args) {
        // пример использования:
        CountMap<Integer> map = new CountMapImpl<>();
        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);
        for (Map.Entry<Integer, Integer> i : map.toMap().entrySet()) {
            System.out.println(i.getKey());


        }
        System.out.println("**********************");
        for (Map.Entry<Integer, Integer> i : map.toMap().entrySet()) {

            System.out.println("Количество повторений числа "+i.getKey()+" = "+i.getValue());

        }
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_");
//        int count = map.getCount(5);
//        System.out.println(count);
//
//        count = map.getCount(6);
//        System.out.println(count);
//
//        count = map.getCount(10);
//        System.out.println(count);

//        for (Integer i : map.toMap().keySet()) {
//            System.out.println(i);
//        }


      System.out.println("С номером  10  удалено повторений :" + map.remove(10));
//
//        for (Integer i : map.toMap().keySet()) {
//            System.out.println(i);
//        }
        // map.remove(5);
        // for (Integer i:map.toMap().keySet()){

        //    System.out.println(i);
        // }
    }
}

