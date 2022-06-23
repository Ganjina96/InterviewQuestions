package MorningPractice;

public class HackerRank {
    public static void main(String[] args) {
        int steps = 8;
        String path = "UDDDUDUU";
        System.out.println("countingValleys(steps,path) = " + countingValleys(steps, path));
    }
    /*
    An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly  "steps" steps, for every step it was noted if it was an uphill, U, or a downhill, D step. Hikes always start and end at sea level, and each step up or down represents a 1 unit change in altitude. We define the following terms:

A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
     */

    public static int countingValleys(int steps, String path){
        int level = 0;
        int valleys = 0;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'U'){
                level++;
            }else if (path.charAt(i) == 'D'){
                if (level == 0){
                    valleys++;
                }
                level -= 1;
            }
        }
        return valleys;
    }
}
