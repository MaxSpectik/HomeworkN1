import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> vec1=  new Vector<String>(10);
        List<String> arr1=  new ArrayList<String>(12);
        ArrayDeque<Integer> que = new ArrayDeque<Integer>();
        que.add(10);
        que.add(12);
        que.addFirst(1);
        que.addLast(2);
        System.out.println(que);
        Set<Integer> set = new HashSet<Integer>();
        Map<Integer,Integer> map1  = new HashMap<Integer,Integer>();
        map1.put(1,3);
    }
    }