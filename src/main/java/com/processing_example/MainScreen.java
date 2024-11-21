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
        parent.fill(65, 105, 225); // Button color
        parent.noStroke();
        parent.ellipse(headButtonX, headButtonY, buttonRadius * 2, buttonRadius * 2);
    }
    
    //Function for drawing chest button
    public void drawChestButton(){
        parent.fill(65, 105, 225); // Button color
        parent.noStroke();
        parent.ellipse(chestButtonX, chestButtonY, buttonRadius * 2, buttonRadius * 2);
    }

    //Function for drawing Arm and Hand button
    public void drawArmButton(){
        parent.fill(65, 105, 225); // Button color
        parent.noStroke();
        parent.ellipse(armButtonX, armButtonY, buttonRadius * 2, buttonRadius * 2);
    }

    //Display info for Main 3 Diagrams
    public void displayMainInfo(){

        //Draw Text for Head Button
        if(isMouseOverButton(headButtonX, headButtonY, buttonRadius)){
            parent.textSize(25);
            parent.fill(0);
            parent.text("Head and Neck", 500, 150);

            parent.textSize(15);
            parent.text("-Skull", 500, 175);
            parent.text("-Mandible", 500, 200);
            parent.text("-Cervical Spine", 500, 225);
        }

        //Draw Text for Chest Button
        if(isMouseOverButton(chestButtonX, chestButtonY, buttonRadius)){
            parent.textSize(25);
            parent.fill(0);
            parent.text("Chest and Back", 50, 250);

            parent.textSize(15);
            parent.text("-Scapula", 50, 275);
            parent.text("-Mandible", 50, 300);
            parent.text("-Cervical Spine", 50, 325);
        }

        //Draw text for Arm Button
        if(isMouseOverButton(armButtonX, armButtonY, buttonRadius)){
            parent.textSize(25);
            parent.fill(0);
            parent.text("Arm and Hand", 600, 200);

            parent.textSize(15);
            parent.text("-Clavicle", 600, 225);
            parent.text("-Shoulder Joint", 600, 250);
            parent.text("-Cervical Spine", 600, 275);
        }

    }
}
