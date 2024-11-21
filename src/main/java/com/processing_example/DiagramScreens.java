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
    HeadAndNeck headAndNeck;
    ArrayList<DiagramScreens> screens = new ArrayList<>();

    // Declare a PImage object
    DiagramScreens(PApplet parent){
        this.parent = parent;
        // Load the image using the parent PApplet instance
        diagramImg = parent.loadImage("SkeletalDiagram.jpg");
}

    public void setup(){
        diagramImg = loadImage("SkeletalDiagram.jpg");
        headAndNeck = new HeadAndNeck(this);
        screens.add(headAndNeck);
    }


   

    public void draw() {
        parent.background(255);
        parent.image(diagramImg, 100, 100, 500, 500);
        drawHeadButton();
        drawChestButton();
        drawArmButton();
        displayMainInfo();

       
    }

    //Function for drawing Head button
    public void drawHeadButton(){
        parent.fill(0, 128, 0); // Button color
        parent.noStroke();
        parent.ellipse(headButtonX, headButtonY, buttonRadius * 2, buttonRadius * 2);
    }
    
    //Function for drawing chest button
    public void drawChestButton(){
        parent.fill(0, 128, 0); // Button color
        parent.noStroke();
        parent.ellipse(chestButtonX, chestButtonY, buttonRadius * 2, buttonRadius * 2);
    }

    //Function for drawing chest button
    public void drawArmButton(){
        parent.fill(0, 128, 0); // Button color
        parent.noStroke();
        parent.ellipse(armButtonX, armButtonY, buttonRadius * 2, buttonRadius * 2);
    }
    


    public void mousePressed() {
        // parent.print("Worked");
        if (isMouseOverButton(headButtonX, headButtonY, buttonRadius)) {
            parent.println("Head and Neck button clicked!");
            // screens..draw();
            // Add specific actions here
        }
    }//End Mouse Pressed

   

    //Display info for Main 3 Diagrams
    public void displayMainInfo(){

        //Draw Text for Head Button
        if(isMouseOverButton(headButtonX, headButtonY, buttonRadius)){
            parent.textSize(25);
            parent.fill(0);
            parent.text("Head and Neck", 450, 150);
        }

        //Draw Text for Chest Button
        if(isMouseOverButton(chestButtonX, chestButtonY, buttonRadius)){
            parent.textSize(25);
            parent.fill(0);
            parent.text("Chest and Back", 100, 250);
        }

        //Draw text for Arm Button
        if(isMouseOverButton(armButtonX, armButtonY, buttonRadius)){
            parent.textSize(25);
            parent.fill(0);
            parent.text("Arm and Hand", 525, 325);
        }

    }

     //Hover Functions to determine if the mouse is over the desired area
     boolean isMouseOverButton(float buttonX, float buttonY, float buttonRadius) {
        float distance = parent.dist(parent.mouseX, parent.mouseY, buttonX, buttonY);
        return distance <= buttonRadius;
    }
}//End Diagram Screens
