package sample;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class sample {
    public static void main(String[] args){
        processqueue pq=new processqueue();
        pq.setPq(new ArrayList<>());
        //adding processes
        process p1=new process(0 ,4 ,3,1);
        process p2=new process(1 ,2 ,33,31);
        process p3=new process(1 ,7 ,3,1);
        pq.addprocess(p1);
        pq.addprocess(p2);
        pq.addprocess(p3);
        //System.out.println(pq.getPq());
        //System.out.println(CreateArray.createarrivaltimearray(pq.getPq()));
        int n=3;
        int timeslice=pq.getPq().size();
        Double arrivaltime[] = CreateArray.createarrivaltimearray(pq.getPq());
        Double bursttime[] = CreateArray.createbursttimearray(pq.getPq());
        //array should be initialized
        Double ta[]=new Double[n];
        Double wt[]=new Double[n];
        //create round robin algorithm
        roundrobin rr=new roundrobin();
        rr.findAvgTurnAroundTime(n,ta,bursttime,arrivaltime,timeslice);
//        for(int i=0;i<n;i++){
//            System.out.println(ta[i]);
//        }
        rr.findAvgWaitingTime(n,wt,ta,bursttime);



//        System.out.println(rr.getAvgTurnAroundTime());
//        System.out.println(CreateArray.createarrivaltimearray(pq.getPq()));
//        System.out.println(CreateArray.createbursttimearray(pq.getPq()));
//        System.out.println(CreateArray.createtimeslicearray(pq.getPq()));
//        System.out.println(CreateArray.createpriorityarray(pq.getPq()));

    }
}
