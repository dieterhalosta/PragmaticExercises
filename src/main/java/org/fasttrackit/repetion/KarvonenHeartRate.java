package org.fasttrackit.repetion;

import org.fasttrackit.utils.ScannerUtils;

public class KarvonenHeartRate {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        int age = ScannerUtils.nextIntAndMoveToNextLine();
        System.out.println("Enter your resting pulse:");
        int restingHR = ScannerUtils.nextIntAndMoveToNextLine();

        for(int i = 0; i<=0; i++){
            System.out.println("Intensity | Rate     \n----------|---------");
            for (int j = 55; j <= 95; j++){
                double intensity = (double) j /100;
                double TargetHeartRate =((((220 - age) - restingHR)*intensity+restingHR));
                int thr = (int) Math.round(TargetHeartRate);
                System.out.println(j + "%       | " + thr + " bpm" );
            }


        }



    }
}
