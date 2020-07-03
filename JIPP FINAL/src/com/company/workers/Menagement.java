package com.company.workers;

import com.company.enums.Payday;
import com.company.enums.Salary;
import com.company.interfaces.ItsPayday;

public class Menagement extends Workers {

    @Override
    public void payday(Payday payday) {
        System.out.printf("Blue collars payday is normally " + Payday.blueCollarsPayday.getPayday() + "th of the month");
    }

    @Override
    public void reward(Salary reward) {
        System.out.printf("\nreward of this employee is equal to: " + Salary.blueCollarsRewards.getRewards());
    }

    public Menagement(String name, int age, String jobPosition) {
        super(name, age, jobPosition);

    }

    @Override
    public void JobPosition( ) {
        System.out.println(getName() + "'s job position is: " + this.jobPosition);
    }

}
