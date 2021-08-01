package com.keyword;

import java.util.EnumSet;
import java.util.Set;

enum Car{FORD,MERCEDES,BMW,SUZUKI,VOLKSWAGEN}
public class EnumSetCopyOf
{
    public static void main(String[] args)
    {
        Set<Car> set1 = EnumSet.allOf(Car.class);
        System.out.println("Before Copying, the Set is "+set1);
        Set set2 = EnumSet.copyOf(set1);
        System.out.println("After Copying, the Set is "+set2);
    }
}
