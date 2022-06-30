import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Array list
        ArrayList<String> list = new ArrayList<>();
        list.add("gineeey");
        list.add("zxc");
        list.add("eqw");
        list.add("asd");
        list.add("blacky");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("zxc");
        list2.add("eqw");
        list2.add("asd");
        list2.add("perks");
        list2.add("string");

        // To compare lists
        for (String str : list) {
            System.out.println(list2.contains(str));
        }

        //Test if list is empty
        list2.removeAll(list2);
        if (list2.isEmpty())
            System.out.println(list2);


        //Linked List
        LinkedList<String> lnkList = new LinkedList<>();
        lnkList.add("first");
        lnkList.add("second");
        lnkList.add("third");
        lnkList.add("fourth");

        LinkedList<String> lnkList2 = new LinkedList<>();
        lnkList2.add("first");
        lnkList2.add("second");
        lnkList2.add("third");
        lnkList2.add("fourth");

        Collections.shuffle(lnkList2);
        lnkList.add(2, "goood");
        Collections.swap(lnkList, 1, 2);


        //print reverse odrer
        Iterator it = lnkList2.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        //HashSet
        HashSet<String> set = new HashSet<>();
        set.add("Vienas");
        set.add("Antras");
        set.add("trecias");
        set.add("ketvirtas");

        Iterator its = set.iterator();

        HashSet<String> set1 = new HashSet<>();
        set1.add("Football");
        set1.add("basket");
        set1.add("pizza");
        set1.add("trecias");

          //Compare sets and remove same elements
        set.retainAll(set1);
        System.out.println(set1);
        System.out.println(set);


        //Tree set
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(4);
        tree.add(7);
        tree.add(8);
        tree.add(2);

        System.out.println(tree);
        //reverse view
        Iterator i = tree.descendingIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        //remove element
        tree.remove(4);


        //PRIORITY QUEUE
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(90);
        queue.add(41);
        queue.add(32);
        queue.add(87);
        queue.add(6);

        System.out.println(queue);
        //maximum priority
        Integer val;
        while( (val = queue.poll()) != null) {
            System.out.println(val+"  ");
        }


        //Hash Map
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Antunes", 3);
        map.put("fred", 3);
        map.put("gas", 20);
        map.put("berel", 10);
        System.out.println(map.size());
        System.out.println(map.containsKey(8));


        //Tree map
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5,"haram");
        treeMap.put(3,"lipsium");
        treeMap.put(10,"strilemto");
        treeMap.put(1,"pistoletos");
        System.out.println(treeMap);
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.subMap(1,true,5,false));
        System.out.println(treeMap.navigableKeySet());

    }
}