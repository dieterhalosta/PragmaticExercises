package org.fasttrackit.westaco_test;
import java.util.*;
import java.text.SimpleDateFormat;

public class UnloadingTrucks {

    /*
    *   Given a collection of truck unloading times, implement the canUnloadAll method which, efficiently with respect to time used,
    * checks if they can be unloaded completely without having to unload two or more trucks at the same time.
    *   For example, for the unloading times below, the method should return true because they don't overlap:
    *  * 3/4/2019 19:00 - 20:30
    *  * 3/4/2019 22:10 - 22:30
    *  * 3/4/2019 20:30 - 22:00
    * */

    public static Boolean canUnloadAll(Collection<UnloadingTime> unloadingTimes) {
        for(int n=0; n<unloadingTimes.size(); n++){
////            if (unloadingTimes.get[n].end != unloadingTimes.get[n + 1].start){
//                return true;
//            } else {
//                return false;
//            }
        }

        return false;
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");

        ArrayList<UnloadingTime> unloadingTimes = new ArrayList<UnloadingTime>();
        unloadingTimes.add(new UnloadingTime(sdf.parse("03/04/2019 19:00"), sdf.parse("03/04/2019 20:30")));
        unloadingTimes.add(new UnloadingTime(sdf.parse("03/04/2019 22:10"), sdf.parse("03/04/2019 22:30")));
        unloadingTimes.add(new UnloadingTime(sdf.parse("03/04/2019 20:30"), sdf.parse("03/04/2019 22:00")));

        System.out.println(UnloadingTrucks.canUnloadAll(unloadingTimes));
    }
}

class UnloadingTime {
    private Date start, end;

    public UnloadingTime(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return this.start;
    }

    public Date getEnd() {
        return this.end;
    }
}
