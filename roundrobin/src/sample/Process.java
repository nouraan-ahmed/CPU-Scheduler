package sample;

import java.util.*;

public class Process implements Comparable{
    private int processNum;
    private double arrivalTime;
    private double burstTime;
    private double timeSlice;
    private int priority;
e
    public Process(int processNum, double arrivalTime, double burstTime, double timeSlice, int priority) {
        this.processNum = processNum;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.timeSlice = timeSlice;
        this.priority = priority;
    }

    public int getProcessNum() {
        return processNum;
    }
    public void setProcessNum(int processNum) {
        this.processNum = processNum;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getBurstTime() {
        return burstTime;
    }
    public void setBurstTime(double burstTime) {
        this.burstTime = burstTime;
    }

    public double getTimeSlice() {
        return timeSlice;
    }
    public void setTimeSlice(double timeSlice) {
        this.timeSlice = timeSlice;
    }

    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }


    @Override
    public int compareTo(Object p) {
        int comparePriority = ((Process)p).getPriority();
        return this.priority - comparePriority;
    }
}

