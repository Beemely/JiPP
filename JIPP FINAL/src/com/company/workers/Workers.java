package com.company.workers;

import com.company.enums.Payday;
import com.company.enums.Salary;
import com.company.interfaces.ItsPayday;

public abstract class Workers implements ItsPayday{

    public String name;
    public int age;
    public String jobPosition;



    public Workers(String name, int age, String jobPosition) {
        this.name = name;
        this.age = age;
        this.jobPosition = jobPosition;

    }

    public abstract void JobPosition();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJobPosition(){
        return  jobPosition;
    }
}