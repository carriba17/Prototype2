//Carter Arribas
// Arm and Hand Class
// Dedicated to running the Screen for the Diagram of the Arm and Hand
// This includes things like the Humerous subclass
// 26 Novemeber 2024



package com.processing_example;

import processing.core.PApplet;
import processing.core.PImage;

public class ArmAndHand extends DiagramScreens{

    //Humerous Button for Hover
    float humerousButtonX = 800;
    float humerousButtonY = 675;
   
    //Chest Button Placement for Hover
    float clavicleButtonX = 700;
    float clavicleButtonY = 350;
  
    //Arm Button Placement for Hover
    float shoulderButtonX = 750;
    float shoulderButtonY = 400;
    float buttonRadius = 10;
    
    PApplet parent;
    PImage armAndHand;
  
    Humerous humerous;
    Clavicle clavicle;
    Shoulder shoulder;

    ArmAndHand(PApplet parent){
        super(parent);
        this.parent = parent;
        armAndHand = parent.loadImage("armAndHandRight.jpg");
    }
public void draw(){
    parent.background(255);
    parent.image(armAndHand, 600, 150, 500, 1000);
    drawHumerousButton();
    drawClavicleButton();
    drawShoulderButton();
    displayArmAndHandInfo();
}

public void setup(){
    humerous = new Humerous(parent);
    clavicle = new Clavicle(parent);
    shoulder = new Shoulder(parent);
}

//Function responsible for Humerous button
public void drawHumerousButton(){
    parent.fill(65, 105, 225); // Button color
    parent.noStroke();
    parent.ellipse(humerousButtonX, humerousButtonY, buttonRadius * 2, buttonRadius * 2);
}

//Function for drawing clavicle button
public void drawClavicleButton(){
    parent.fill(65, 105, 225); // Button color
    parent.noStroke();
    parent.ellipse(clavicleButtonX, clavicleButtonY, buttonRadius * 2, buttonRadius * 2);
}

//Function for drawing shoulder button
public void drawShoulderButton(){
    parent.fill(65, 105, 225); // Button color
    parent.noStroke();
    parent.ellipse(shoulderButtonX, shoulderButtonY, buttonRadius * 2, buttonRadius * 2);
}
//Check if the mouse is over the fucntion
public boolean isMouseOverBackButton() {
    return parent.mouseX >= 10 && parent.mouseX <= 90 &&
        parent.mouseY >= 10 && parent.mouseY <= 40;
}

//Hover Functions to determine if the mouse is over the desired area
boolean isMouseOverButton(float buttonX, float buttonY, float buttonRadius) {
    float distance = parent.dist(parent.mouseX, parent.mouseY, buttonX, buttonY);
    return distance <= buttonRadius;
}


public void displayArmAndHandInfo(){
    if (isMouseOverButton(humerousButtonX, humerousButtonY, buttonRadius)) {
        humerous.displayInfo();
        }  
    if (isMouseOverButton(clavicleButtonX, clavicleButtonY, buttonRadius)) {
        clavicle.displayInfo();
        }
    if (isMouseOverButton(shoulderButtonX, shoulderButtonY, buttonRadius)) {
         shoulder.displayInfo();
        }      
}
}