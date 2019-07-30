package com.test;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] a = {1,2,3,4,1,2,3};
        countArrayItem(a);
    }

    public static void countArrayItem(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length;i++){

            for (int j = 0;j < arr.length;j++){

                if (arr[i] == arr[j]){
                    count++;
                }

            }
            map.put(arr[i],count);
            count = 0;
        }

        show(map);

    }

    public static void show(HashMap<Integer,Integer> map){

        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet){

            System.out.println(key + "出现的次数是:"+map.get(key)+"次!");

        }

    }
}
