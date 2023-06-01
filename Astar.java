/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aimapsproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author Owner
 */

//A* Class creation
public class Astar {
    //Fringe as priority queue and it will organize the nodes based on thier F values(SLD from parent+SLD to goal)
    public final PriorityQueue<MNode> Q = new PriorityQueue<MNode>(100, new Comparator<MNode>() {
    @Override
    public int compare(MNode n1, MNode n2) {
      double value = n1.getF() - n2.getF();
      if(value > 0) return 1;
      if(value < 0) return -1;
      return 0;
    }
  });
    //Visited list that will contain all Nodes's ID's
    ArrayList<Integer> visited = new ArrayList();
    
    
    
    //Method to calculate Straight Line Distance between two nodes
    public double getSLD(MNode n1,MNode n2){
        double result;
        result = Math.sqrt(Math.pow(n2.point.getCenterY()-n1.point.getCenterY(),2)+Math.pow(n2.point.getCenterX()-n1.point.getCenterX(),2));
        return result;
    }
    
    

}
