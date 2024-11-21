package com.processing_example;

import processing.core.PApplet;
import processing.core.PImage;

public class MainScreen extends DiagramScreens {

    float headButtonX = 400;
    float headButtonY = 150;
    float buttonRadius = 10;

    float chestButtonX = 400;
    float chestButtonY = 350;

    float armButtonX = 550;
    float armButtonY = 350;

    PImage diagramImg;
    PApplet parent;


    MainScreen(PApplet parent) {
        super(parent);
        this.parent = parent; // Ensure parent is assigned
        diagramImg = parent.loadImage("SkeletalDiagram.jpg");
    }

    @Override
    public void draw() {
        parent.background(255);
        parent.image(diagramImg, 150, 100, 500, 500);
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
}
