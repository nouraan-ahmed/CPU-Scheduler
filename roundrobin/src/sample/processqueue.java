package sample;

import java.util.ArrayList;


public class processqueue{
    private ArrayList<process> pq ;


    public void addprocess(process p){
    pq.add(p);
    }

    public ArrayList<process> getPq() {
        return pq;
    }

    public void setPq(ArrayList<process> pq) {
        this.pq = pq;
    }
}