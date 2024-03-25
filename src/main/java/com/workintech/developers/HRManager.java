package com.workintech.developers;

import java.util.Arrays;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, int salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[3];
        this.midDevelopers = new MidDeveloper[3];
        this.seniorDevelopers = new SeniorDeveloper[3];
    }
    public void addEmployee(JuniorDeveloper developer){
        boolean employeeAdded = false;
        for(int i = 0; i < juniorDevelopers.length; i++){
            if(juniorDevelopers[i] == null){
                juniorDevelopers[i] = developer;
                employeeAdded = true;
                break;
            }
        }
        if(!employeeAdded){
            System.out.println("Employee capacity is full!");
        }
    }
    public void addEmployee(MidDeveloper developer){
        boolean employeeAdded = false;
        for(int i = 0; i < midDevelopers.length; i++){
            if(midDevelopers[i] == null){
                midDevelopers[i] = developer;
                employeeAdded = true;
                break;
            }
        }
        if(!employeeAdded){
            System.out.println("Employee capacity is full!");
        }
    }
    public void addEmployee(SeniorDeveloper developer){
        boolean employeeAdded = false;
        for(int i = 0; i < seniorDevelopers.length; i++){
            if(seniorDevelopers[i] == null){
                seniorDevelopers[i] = developer;
                employeeAdded = true;
                break;
            }
        }
        if(!employeeAdded){
            System.out.println("Employee capacity is full!");
        }
    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }

    @Override
    public void work(){
        System.out.println("HRManager starts to working");
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                '}';
    }
}
