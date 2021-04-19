package sample;

import java.util.ArrayList;

public class CreateArray {

    public static Double[] createarrivaltimearray(ArrayList<process> processes) {

        ArrayList<Double> arrival=new ArrayList<>();
        int n=processes.size();
        Double[] arrivalarr = new Double[n];
        for (int i = 0; i < n; i++) {
            process p = processes.get(i);
            arrival.add(p.getArrivalTime());
        }
        arrival.toArray(arrivalarr);
        return arrivalarr;
    }
    public static Double[] createbursttimearray(ArrayList<process> processes) {

        ArrayList<Double> burst=new ArrayList<>();
        int n=processes.size();
        Double[] burstarr=new Double[n];
        for (int i = 0; i < n; i++) {
            process p = processes.get(i);
            burst.add(p.getBurstTime());
        }
        burst.toArray(burstarr);
        return burstarr;
    }
    public static Double[] createtimeslicearray(ArrayList<process> processes) {

        ArrayList<Double> timeslice=new ArrayList<>();
        int n=processes.size();
        Double[] timeslicearr=new Double[n];
        for (int i = 0; i < n; i++) {
            process p = processes.get(i);
            timeslice.add(p.getTimeSlice());
        }
        timeslice.toArray(timeslicearr);
        return timeslicearr;
    }
    public static Double[] createpriorityarray(ArrayList<process> processes) {

        ArrayList<Integer> priority=new ArrayList<>();
        int n=processes.size();
        Double[] priorityarr=new Double[n];
        for (int i = 0; i < n; i++) {
            process p = processes.get(i);
            priority.add(p.getPriority());
        }
        priority.toArray(priorityarr);
        return priorityarr;
    }
}
