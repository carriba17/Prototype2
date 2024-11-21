package com.processing_example;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;


public class DiagramScreens extends Main {
    float headButtonX = 350;
    float headButtonY = 150;
    float buttonRadius = 10;

    float chestButtonX = 350;
    float chestButtonY = 350;

    float armButtonX = 500;
    float armButtonY = 350;


    
    PImage diagramImg;
    PApplet parent;
    DiagramScreens headAndNeck;
    DiagramScreens mainScreen;
    DiagramScreens currentScreen;
    ArrayList<DiagramScreens> screens = new ArrayList<>();

    // Declare a PImage object
    DiagramScreens(PApplet parent){
        this.parent = parent;
        
    }

    public void setup(){
        headAndNeck = new HeadAndNeck(parent);
        mainScreen = new MainScreen(parent);
        screens.add(headAndNeck);
        screens.add(mainScreen);

       
        currentScreen = mainScreen;
    }


   

    public void draw() {
              // Delegate drawing to the current screen
            //   if (currentScreen != null) {
            //     currentScreen.draw();
            // } else {
            //     currentScreen.draw();
            //     parent.background(255);
            //     parent.println("Error: No screen loaded");
            // }
            currentScreen.draw();
    }



    public void mousePressed() {
        if (isMouseOverButton(headButtonX, headButtonY, buttonRadius)) {
            parent.println("Head and Neck button clicked!");
            currentScreen = headAndNeck;
            parent.println(currentScreen);
            // Add specific actions here
        }
    }//End Mouse Pressed

   

    

     //Hover Functions to determine if the mouse is over the desired area
     boolean isMouseOverButton(float buttonX, float buttonY, float buttonRadius) {
        float distance = parent.dist(parent.mouseX, parent.mouseY, buttonX, buttonY);
        return distance <= buttonRadius;
    }
}//End Diagram Screens
