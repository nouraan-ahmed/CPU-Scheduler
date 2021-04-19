package sample;

//burst time is the time taken by the process in the processor

import java.util.ArrayList;

public class roundrobin {

    private double avgTurnAroundTime;
    private double avgWaitingTime;

    public double getAvgTurnAroundTime() {
        return avgTurnAroundTime;
    }

    public void setAvgTurnAroundTime(double avgTurnAroundTime) {
        this.avgTurnAroundTime = avgTurnAroundTime;
    }

    public double getAvgWaitingTime() {
        return avgWaitingTime;
    }

    public void setAvgWaitingTime(double avgWaitingTime) {
        this.avgWaitingTime = avgWaitingTime;
    }



    public void findAvgTurnAroundTime(int n, Double turnaroundtime[], Double bursttime[], Double arrivaltime[], int timeslice){
        Double burstTime_new[]=new Double[n];
        int t=0; //time
        double sum=0; //addition of turnaround time
        boolean Done=false;
        //create a copy of bursttime array that will be edited during execution
        for(int i=0;i<n;i++){
            burstTime_new[i]=bursttime[i];
        }
        while(!Done) {
            for (int j = 0; j < n; j++) {
                if (burstTime_new[j] > timeslice) {
                    t += timeslice;
                    burstTime_new[j] -= timeslice;
                }
                else if(burstTime_new[j]==0.0){
                    continue;
                }
                else {
                    t += burstTime_new[j];
                    turnaroundtime[j] = t - arrivaltime[j];
                    burstTime_new[j] = 0.0;
                }
            }
            for(int r=0;r<n;r++){
                Done=true;
                if(burstTime_new[r]!=0){
                    Done=false;
                    break;
                }
            }

        }
        for(int i=0;i<n;i++){
            sum+=turnaroundtime[i];
        }

        this.avgTurnAroundTime=sum/n;
    }
    public void findAvgWaitingTime(int n,Double waitingtime[], Double turnaroundtime[], Double bursttime[]){
        Double sum=0.0;
        for(int w=0;w<n;w++){
            waitingtime[w]=turnaroundtime[w]-bursttime[w];
            sum+=waitingtime[w];
        }
        this.avgWaitingTime=sum/n;

    }


}
