//Carter Arribas
//Diagram screen Class
//This Class is responsible for handling all the events inside the Screen
//All my main Screens run through this class and it handles most of the main events of the program


package com.processing_example;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;


public class DiagramScreens extends Main {

    //Head Button Placement for Hover
    float headButtonX = 800;//(width * 0.477f)
    float headButtonY = 350;//(height* 0.35f)
   
    //Chest Button Placement for Hover
    float chestButtonX = 800;
    float chestButtonY = 750;

    //Arm Button Placement for Hover
    float armButtonX = 1025;
    float armButtonY = 750;

    float buttonRadius = 10;

    //All my more Comlex Variables
    PImage diagramImg;
    PImage logoImg;
    PApplet parent;
    DiagramScreens headAndNeck;
    DiagramScreens chestAndBack;
    DiagramScreens armAndHand;
    DiagramScreens mainScreen;
    DiagramScreens currentScreen;
    ArrayList<DiagramScreens> screens = new ArrayList<>();

    // Declare a PImage object
    DiagramScreens(PApplet parent){
        this.parent = parent;
        
    }

    public void setup(){
        logoImg= parent.loadImage("S&S.jpg");
        headAndNeck = new HeadAndNeck(parent);
        chestAndBack = new ChestAndBack(parent);
        armAndHand = new ArmAndHand(parent);
        mainScreen = new MainScreen(parent);
        screens.add(headAndNeck);//Array List 0
        screens.add(mainScreen);//Array List 1
        screens.add(chestAndBack);//Array List 2
        screens.add(armAndHand);//Array List 3

       
        currentScreen = mainScreen;
    }


   

    public void draw() {
            currentScreen.draw();
            drawBackButton();
            drawLogo();

             // Delegate drawing to the current screen
            //   if (currentScreen != null) {
            //     currentScreen.draw();
            // } else {
            //     currentScreen.draw();
            //     parent.background(255);
            //     parent.println("Error: No screen loaded");
            // }
    }


    //Different Mouse Pressed functions to control which screen the user is on
    public void mousePressed() {
        if (isMouseOverButton(headButtonX, headButtonY, buttonRadius)) {
            // parent.println("Head and Neck button clicked!");
            currentScreen = headAndNeck;
            headAndNeck.setup();
            
            // parent.println(currentScreen);
        }
        if (isMouseOverButton(chestButtonX, chestButtonY, buttonRadius)) {
            parent.println("Chest and Back button clicked!");
            currentScreen = chestAndBack;
            chestAndBack.setup();
        }
        if (isMouseOverButton(armButtonX, armButtonY, buttonRadius)) {
            parent.println("Arm and Hand button clicked!");
            currentScreen = armAndHand;
            armAndHand.setup();

        }
        backButtonClick();
    }//End Mouse Pressed


    //Check if the mouse is over the button
    public boolean isMouseOverBackButton() {
        return parent.mouseX >= 50 && parent.mouseX <= 140 &&
               parent.mouseY >= 125 && parent.mouseY <= 165;
    }

     //Hover Functions to determine if the mouse is over the desired area
     boolean isMouseOverButton(float buttonX, float buttonY, float buttonRadius) {
        float distance = parent.dist(parent.mouseX, parent.mouseY, buttonX, buttonY);
        return distance <= buttonRadius;
    }

    public void drawBackButton(){
        parent.fill(65, 105, 225); // Blue color
        parent.noStroke();
        parent.rect(50, 125, 80, 30); // Position: Top-left corner (x: 10, y: 10)
    
        // Draw the "Back" text
        parent.fill(255); // White color for text
        parent.textSize(16);
        parent.text("Back", 60, 150);
    }

    

    public void backButtonClick() {
        if (isMouseOverBackButton()) {
            parent.println("Back button clicked!");
            currentScreen = mainScreen; // Switch back to the main screen
        }
    }

    public void drawLogo(){
        // parent.image(logoImg, 350, 50,50,50);
        parent.textSize(45);
        parent.fill(0);
        parent.text("Sun & Son Interactive Diagram", 500, 75);
    }

}//End Diagram Screens
