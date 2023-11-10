package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToALnALtoArray {
    public static void main(String[] args) {

        //ARRAY TO ARRAYLIST

        //Using Arrays.asList
        String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
        List<String> str=new ArrayList<>(Arrays.asList(array));
        System.out.println(str);

        //Using Collections.addAll
        String[] array1 = new String[] {"J2EE", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
        List<String> str1=new ArrayList<>();
        Collections.addAll(str1,array1);
        System.out.println(str1);

        //Using ArrayList.addAll
        String[] array2 = new String[] {"JAVA8", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};

        ArrayList<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(array2));
        System.out.println(list);

        //Using Stream
        String[] array3 = new String[] {"SQL", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
        List<String> li=Arrays.stream(array3).collect(Collectors.toList());
        System.out.println(li);


        //Arraylist to array
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("JAVA");

        arrayList.add("JSP");

        arrayList.add("ANDROID");

        arrayList.add("STRUTS");

        arrayList.add("HADOOP");

        arrayList.add("JSF");

        String[] st=new String[arrayList.size()];
        arrayList.toArray();

        for (String lis:arrayList){
            System.out.print(lis+",");
        }


    }
}
