package com.company;

import com.company.MedianAndAverage.MedianAndAverage;
import com.company.enums.*;
import com.company.interfaces.ItsPayday;
import com.company.workers.*;
import com.company.*;

import javax.print.attribute.standard.Media;

public class Main {

    public static void main(String[] args) {

        MedianAndAverage medianAndAverage = new MedianAndAverage();

        Workers software_developer = new WhiteCollars("Jake Connor", 24, "developer");
        Workers buyer = new WhiteCollars("Emily Brown", 28, "Buyer");
        Workers conservator = new BlueCollars("Charlie Evans", 38, "conservator");
        Workers productionWorker = new BlueCollars("Harry O'Neil", 18, "production worker");
        Workers chiefAccountant = new Menagement("Barbara Jones", 40, "Chief Accountant");


        jobPosition(buyer);
        software_developer.payday(Payday.whiteCollarPayday);
        chiefAccountant.reward(Salary.menagementRewards);


        medianAndAverage.CrList();

    }

    private static void jobPosition(Workers... workers) {
        for (var worker : workers) {
            worker.JobPosition();

        }
    }


}
