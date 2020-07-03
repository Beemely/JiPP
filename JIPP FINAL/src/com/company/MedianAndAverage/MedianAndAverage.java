package com.company.MedianAndAverage;
import  com.company.*;
import com.company.enums.Salary;

import javax.print.attribute.standard.Media;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianAndAverage {

    public static void CrList() {
        List<Double> listOfDates = Arrays.asList(Salary.menagementRewards.getRewards(), Salary.blueCollarsRewards.getRewards(), Salary.whiteCollarRewards.getRewards());
        System.out.println(listOfDates.size());
        Collections.sort(listOfDates);

        System.out.println(listOfDates);
        System.out.println("Average: " + Avrg(listOfDates) + "\nMedian: " + Median(listOfDates));

    }

    private static boolean isEven(List<Double> listOfDates) {
        return listOfDates.size() % 2 == 0;
    }

    private static double Median(List<Double> listOfDates) {
        if (isEven(listOfDates))
            return (listOfDates.get(listOfDates.size() / 2 + (listOfDates.size() / 2) - 1)) / 2;
        else
            return listOfDates.get(listOfDates.size() / 2);
    }

    private static double Avrg(List<Double> listOfDates) {
        double sum = 0;
        for (Double aDouble : listOfDates) {
            sum += aDouble;
        }
        return sum / listOfDates.size();
    }
}
