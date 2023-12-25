package week_16_assignment.java;

public class AgeRestrictionAnalysis {
    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 65;

    public boolean isEligible(int age){

        return MIN_AGE <= age && age <= MAX_AGE;
    }


}
