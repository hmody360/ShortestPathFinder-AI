/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aimapsproject;

/**
 *
 * @author Owner
 */

import java.util.LinkedList;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
//MNode(MapNode) Class that the nodes are created from
public class MNode {
//MNode's attributes 
    int id;
    LinkedList<MNode> children = new LinkedList<>();
    Circle point;
    double distanceFromParent;
    double distanceFromGoal;
    LinkedList<MNode> path = new LinkedList<>();
    
    //MNode Constructer (distance from parent,distance from goal and path are all changed during running the program)
    public MNode(int id, Circle point) {
        this.id = id;
        this.point = point;
        distanceFromParent = 0.0;
        distanceFromGoal = 0.0;
    }

  
    //Setters and Getters for all attributes
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LinkedList<MNode> getChildren() {
        return children;
    }

    public void setChildren(LinkedList<MNode> children) {
        this.children = children;
    }



    public Circle getPoint() {
        return point;
    }

    public void setPoint(Circle point) {
        this.point = point;
    }

    public double getDistanceFromParent() {
        return distanceFromParent;
    }

    public void setDistanceFromParent(double distanceFromParent) {
        this.distanceFromParent = distanceFromParent;
    }

    public double getDistanceFromGoal() {
        return distanceFromGoal;
    }

    public void setDistanceFromGoal(double distanceFromGoal) {
        this.distanceFromGoal = distanceFromGoal;
    }

    public LinkedList<MNode> getPath() {
        return path;
    }

    public void setPath(LinkedList<MNode> path) {
        this.path = path;
    }
    
    //Method to get distance from parent+distance from goal that will be used to reorganize the fringe
    public double getF(){
        return getDistanceFromParent()+getDistanceFromGoal();
    }
    //Overriding toString method so that it Node's names appear correctly in the comboBoxess
@Override
    public String toString() {
        return "n"+id;
    }
    

}

