package com.processing_example;

import processing.core.PApplet;
import processing.core.PImage;

public class MainScreen extends DiagramScreens {

    float headButtonX = 800;
    float headButtonY = 350;
    float buttonRadius = 10;

    float chestButtonX = 800;
    float chestButtonY = 750;

    float armButtonX = 1025;
    float armButtonY = 750;

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
        parent.image(diagramImg, 400, 300, 800, 800);
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
            parent.textSize(45);
            parent.fill(65, 105, 225);
            parent.text("Head and Neck", 1025, 250);

            parent.textSize(35);
            parent.fill(0);
            parent.text("-Skull", 1025, 300);
            parent.text("-Mandible", 1025, 350);
            parent.text("-Cervical Spine", 1025, 400);
        }

        //Draw Text for Chest Button
        if(isMouseOverButton(chestButtonX, chestButtonY, buttonRadius)){
            parent.textSize(45);
            parent.fill(65, 105, 225);
            parent.text("Chest and Back", 200, 350);

            parent.textSize(35);
            parent.fill(0);
            parent.text("-Scapula", 200, 400);
            parent.text("-Mandible", 200, 450);
            parent.text("-Cervical Spine", 200, 500);
        }

        //Draw text for Arm Button
        if(isMouseOverButton(armButtonX, armButtonY, buttonRadius)){
            parent.textSize(45);
            parent.fill(65, 105, 225);
            parent.text("Arm and Hand", 1200, 600);

            parent.textSize(35);
            parent.fill(0);
            parent.text("-Clavicle", 1200, 650);
            parent.text("-Shoulder Joint", 1200, 700);
            parent.text("-Cervical Spine", 1200, 750);
        }

    }
}
