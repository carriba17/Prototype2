package com.processing_example;

import processing.core.PApplet;
import processing.core.PImage;

public class ArmAndHand extends DiagramScreens{

    //
    float humerousButtonX = 500;
    float humerousButtonY = 275;
   
    //Chest Button Placement for Hover
    float clavicleButtonX = 300;
    float clavicleButtonY = 385;
  
    //Arm Button Placement for Hover
    float shoulderButtonX = 400;
    float shoulderButtonY = 550;
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
    parent.image(armAndHand, 300, 100, 250, 500);
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

public void drawHumerousButton(){
    parent.fill(0, 128, 0); // Button color
    parent.noStroke();
    parent.ellipse(humerousButtonX, humerousButtonY, buttonRadius * 2, buttonRadius * 2);
}

//Function for drawing chest button
public void drawClavicleButton(){
    parent.fill(0, 128, 0); // Button color
    parent.noStroke();
    parent.ellipse(clavicleButtonX, clavicleButtonY, buttonRadius * 2, buttonRadius * 2);
}

//Function for drawing chest button
public void drawShoulderButton(){
    parent.fill(0, 128, 0); // Button color
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