package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();

        //calculations
        double total = (cost * (1+(percent/100.0)));  
        double tip = ((total - cost)*100) / 100.0;
        double tpp = ((tip / people)*100)/100.0;
        double cppbt = ((cost / people)*100)/100.0;
        double cpp = ((total / people)*100)/100.0;

        //rounding
        total = Math.round(total*100)/100.0; 
        tip = Math.round(tip*100)/100.0;            //learned how to use math.round from Casey
        tpp = Math.round(tpp*100)/100.0;
        cppbt = Math.round(cppbt*100)/100.0;
        cpp = Math.round(cpp*100)/100.0;
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");
        result.append("Total tip: " + "$" + tip + "\n");
        result.append("Total Bill with tip: " + "$" + total + "\n");
        result.append("Per person cost before tip: " + "$" + cppbt + "\n");
        result.append("Tip per person: " + "$" + tpp + "\n");
        result.append("Total cost per person: " + "$" + cpp + "\n");
        result.append("-------------------------------\n");

        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12; 
        int percent = 15;
        double cost = 566.97;              

        System.out.println(calculateTip(people,percent,cost));
    }
}
        
