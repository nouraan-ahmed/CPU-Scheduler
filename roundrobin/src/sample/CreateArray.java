package sample;

import java.util.ArrayList;

public class CreateArray {

    public static Double[] createArrivalTimeArray(ArrayList<Process> Processes) {

        ArrayList<Double> arrival=new ArrayList<>();
        int n=Processes.size();
        Double[] arrivalarr = new Double[n];
        for (int i = 0; i < n; i++) {
            Process p = Processes.get(i);
            arrival.add(p.getArrivalTime());
        }
        arrival.toArray(arrivalarr);
        return arrivalarr;
    }
    public static Double[] createBurstTimeArray(ArrayList<Process> Processes) {

        ArrayList<Double> burst=new ArrayList<>();
        int n=Processes.size();
        Double[] burstarr=new Double[n];
        for (int i = 0; i < n; i++) {
            Process p = Processes.get(i);
            burst.add(p.getBurstTime());
        }
        burst.toArray(burstarr);
        return burstarr;
    }
    public static Double[] createTimeSliceArray(ArrayList<Process> Processes) {

        ArrayList<Double> timeslice=new ArrayList<>();
        int n=Processes.size();
        Double[] timeslicearr=new Double[n];
        for (int i = 0; i < n; i++) {
            Process p = Processes.get(i);
            timeslice.add(p.getTimeSlice());
        }
        timeslice.toArray(timeslicearr);
        return timeslicearr;
    }
    public static Double[] createPriorityArray(ArrayList<Process> Processes) {

        ArrayList<Integer> priority=new ArrayList<>();
        int n=Processes.size();
        Double[] priorityarr=new Double[n];
        for (int i = 0; i < n; i++) {
            Process p = Processes.get(i);
            priority.add(p.getPriority());
        }
        priority.toArray(priorityarr);
        return priorityarr;
    }
    public static Double[] createWaitingTimeArray(ArrayList<Process> Processes) {
        Double[] wt = new Double[Processes.size()];
        wt[0] = 0.0; //waiting for first process is zero
        for(int i = 1; i < Processes.size(); i++){
            wt[i] = Processes.get(i - 1).getBurstTime() + wt[i - 1];
        }
        return wt;
    }
    public static Double[] createTurnaroundTimeArray(ArrayList<Process> Processes) {
        Double[] tat = new Double[Processes.size()];
        Double[] wt = new Double[Processes.size()];
        wt = createWaitingTimeArray(Processes);
        for(int i = 0;i<Processes.size();i++){
            tat[i] = Processes.get(i).getBurstTime() + wt[i];
        }
        return wt;
    }
    public static void findAvgTime(ArrayList<Process> Processes) {
        double total_wt = 0.0, total_tat = 0.0;
        Double[] tat = new Double[Processes.size()];
        Double[] wt = new Double[Processes.size()];
        wt = createWaitingTimeArray(Processes);
        tat = createTurnaroundTimeArray(Processes);
        for(int i = 0;i<Processes.size();i++){
            total_wt = total_wt + wt[i];
            total_tat = total_tat + tat[i];
        }
        System.out.println("Average waiting time: " + total_wt/Processes.size());
        System.out.println("Average turnaround time: " + total_tat/Processes.size());

    }
}
