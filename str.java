You are given two arrays of strings that represent two inclusive events that happened on the same day, event1 and event2, where:

event1 = [startTime1, endTime1] and
event2 = [startTime2, endTime2].
Event times are valid 24 hours format in the form of HH:MM.

A conflict happens when two events have some non-empty intersection (i.e., some moment is common to both events).

Return true if there is a conflict between two events. Otherwise, return false.




class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
     int startT1 = Integer.parseInt(event1[0].substring(0, 2)) * 60 + Integer.parseInt(event1[0].substring(3));
        int endT1 = Integer.parseInt(event1[1].substring(0, 2)) * 60 + Integer.parseInt(event1[1].substring(3));

  
    int startT2 = Integer.parseInt(event2[0].substring(0, 2)) * 60 + Integer.parseInt(event2[0].substring(3));
    int endT2 = Integer.parseInt(event2[1].substring(0, 2)) * 60 + Integer.parseInt(event2[1].substring(3));

    
    if ((startT1 <= startT2 && startT2 <= endT1) || (startT1 <= endT2 && endT2 <= endT1)) {
        return true;
    } else if ((startT2 <= startT1 && startT1 <= endT2) || (startT2 <= endT1 && endT1 <= endT2)) {
        return true;
    } else {
        return false;
    }
}   
    }
