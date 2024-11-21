//Carter Arribas
//CRCPIII
//Professor Brown 
//Main class dedicated to running and operating the other classes of the Diagram
//This Diagran is dedicated to inspiring users to learn about the skeletal System

//Importing processing
package com.processing_example;
import java.util.ArrayList;
import processing.core.*;


public class Main extends PApplet {
    StartScreen startScreen;
    DiagramScreens diagramScreens;

    PImage diagramImg;
    boolean started = false;
    

    public static void main(String[] args) {
        PApplet.main("com.processing_example.Main");
    }

    @Override
    public void settings() {
        size(800, 600); // Set your window size
    }

    @Override
    public void setup() {
        startScreen = new StartScreen(this);
        diagramScreens = new DiagramScreens(this); // Pass this PApplet instance
        // diagramImg = loadImage("SkeletalDiagram.jpg"); 
    }

    @Override
    public void draw() {
        if(started == false){
            startScreen.draw();
        } // Delegate drawing to StartScreen
        else{
            diagramScreens.draw();
            // background(70);
            // textSize(35);
        }
    }

    public void keyPressed(){
        if(key == 's'){
            started = true;
            println(key);
        }
        }
}//End Main Class
