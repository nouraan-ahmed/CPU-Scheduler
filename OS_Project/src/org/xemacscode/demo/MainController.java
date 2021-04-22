/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xemacscode.demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author RENAD
 */
public class MainController implements Initializable {
    
    @FXML
    private Button draw;
    @FXML
    private Button reset;
    @FXML
    private TextField arr_time;
    @FXML
    private TextField bur_time;
    @FXML
    private TextField par;
    @FXML
    private TextField num_process;
    @FXML
    private ComboBox scheduler;
    @FXML
    private TextField tim_slice;
    @FXML
    private Button add;
    @FXML
    private CheckBox pree;
    @FXML
    private CheckBox non_pree;
    @FXML
    private Button add_process;
    @FXML
    private Label lab1;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
      
    }
     
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                 

        ObservableList <String> list =FXCollections.observableArrayList("FCFS","SJF","Priroty","RR");
        scheduler.setItems(list);
        
        // TODO
    }    

    @FXML
    private void Draw(ActionEvent event) {
        if(scheduler.getSelectionModel().getSelectedItem().toString()=="FCFS"){
        
        System.out.println("Hello!");
        }
        else if(scheduler.getSelectionModel().getSelectedItem().toString()=="SJF"){
            if(pree.isSelected()==true) {
                System.out.println("SJF Preemptive");
            } 
            if(non_pree.isSelected()==true){
                System.out.println("SJF non-Preemptive");
            }
        }
        else if(scheduler.getSelectionModel().getSelectedItem().toString()=="Priroty"){
            if(pree.isSelected()==true) {
                System.out.println("Priroty Preemptive");
            } 
            if(non_pree.isSelected()==true){
                System.out.println("Priroty non-Preemptive");
            }
        }
        else if(scheduler.getSelectionModel().getSelectedItem().toString()=="RR"){
        
        System.out.println("Hello!");
        }
        
    }

    @FXML
    private void Reset(ActionEvent event) {
    }

    @FXML
    private void add(ActionEvent event) {
        
    }

    @FXML
    private void Add_Process(ActionEvent event) {
        int n = Integer.parseInt(num_process.getText());
		int pid[] = new int[n]; // it takes pid of process
		int at[] = new int[n]; // at means arrival time
		int bt[] = new int[n]; // bt means burst time
		int ct[] = new int[n]; // ct means complete time
		int ta[] = new int[n];// ta means turn around time
		int wt[] = new int[n];  // wt means waiting time
		int f[] = new int[n];  // f means it is flag it checks process is completed or not
		int k[]= new int[n];   // it is also stores brust time
	    int  i =0, st=0, tot=0;
	    float avgwt=0, avgta=0;
            
	    	pid[i]= i+1;
	    	System.out.println ("enter process " +(i+1)+ " arrival time:");
	    	at[i]= Integer.parseInt(arr_time.getText());
	    	System.out.println("enter process " +(i+1)+ " burst time:");
	    	bt[i]= Integer.parseInt(bur_time.getText());
	    	k[i]= bt[i];
	    	f[i]= 0;
	    
    }

    @FXML
    private void Select(ActionEvent event) {
        String s =scheduler.getSelectionModel().getSelectedItem().toString();
        lab1.setText(s);
    }
    
}
