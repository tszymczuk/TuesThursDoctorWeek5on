package com.company;

import java.util.Random;

public class GovernmentProgram {
    private String programName;

    public GovernmentProgram(){
        String[] programList = {"Medicare", "Medicade", "VA", "ObamaCare", "CongressCare"};
        var picker = new Random();
        var number = picker.nextInt(programList.length);
        programName = programList[number];
    }

    public void payBill(double cost){
        if (programName.equals("CongressCare"))
            System.out.println("Congress Care is paying a bill of $" + cost + " and giving a kickback ... um tip of $" + cost+2);
        else if (programName.equals("Medicare"))
            System.out.println("Medicare is paying $" + cost + ". Welcome senior citizen.");
        else
            System.out.println(programName + " is paying $" + cost + ".");
    }
}
