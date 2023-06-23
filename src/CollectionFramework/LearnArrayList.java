package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {

    public static void main(String[] args) {
//        String[] studentsName = new String[30];
//        studentsName[0] = "Erik";
//        studentsName[29] = "Harish";
//        studentsName[30] = "Raman";

        ArrayList<String> studentsName = new ArrayList<>();
        // initial size is n and when n are full
        // size is increased by n + n/2 + 1
        // elements are automatically copied
//        studentsName.add("Erik");
//        studentsName.add("BroCode");
//        studentsName.add("NeetCode");
//        studentsName.add("Yes Theory");
//
//        System.out.println(studentsName);
//
//        // adding at a specific index
//        studentsName.add(3, "Anuj Bhaiya");
//        studentsName.add("Nishant Chahar");
//        studentsName.add(4, "Love Babbar");
//
//        System.out.println(studentsName);
//
//        System.out.println(studentsName.get(2));

        List<Integer> list  = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(10*i);
        }

        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.remove(Integer.valueOf(80));
        System.out.println(list);

        list.clear();
        System.out.println(list);


    }
}
