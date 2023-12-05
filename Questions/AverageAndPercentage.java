package com.ClassRoom.Questions;

public class AverageAndPercentage {
    public static void main(String[] args) {
        int[] marks={25,60,98,74,15};
        int average,percentage;
        int sum=0;
        int length=marks.length;
        for (int i=0;i<length;i++){
            sum=sum+marks[i];
        }
        average=sum/length;
        percentage=(sum/500)*100;
        System.out.println("Average:"+average);
        System.out.println("Percentage:"+percentage);
    }
}
