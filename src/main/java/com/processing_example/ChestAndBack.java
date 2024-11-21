package com.processing_example;

import processing.core.PApplet;
import processing.core.PImage;

public class ChestAndBack extends DiagramScreens{
  //Head Button Placement for Hover
  float scapulaButtonX = 500;
  float scapulaButtonY = 275;
 
  //Chest Button Placement for Hover
  float ribButtonX = 300;
  float ribButtonY = 385;

  //Arm Button Placement for Hover
  float thoracicSpineButtonX = 400;
  float thoracicSpineButtonY = 550;

  float buttonRadius = 10;
  PApplet parent;
  PImage chestAndBack;

  Scapula scapula;
  RibCage ribCage;
  ThoracicSpine thoracicSpine;


    ChestAndBack(PApplet parent){
        super(parent);
        this.parent = parent;
        chestAndBack = parent.loadImage("chestAndBack.jpg");
    }
public void draw(){
    parent.background(255);
    parent.image(chestAndBack, 150, 100, 500, 500);
    drawScapulaButton();
    drawRibButton();
    drawSpineButton();
    displayChestAndBack();

}

public void setup(){
    scapula = new Scapula(parent);
    ribCage = new RibCage(parent);
    thoracicSpine = new ThoracicSpine(parent);
    }

//Function for drawing Scapula button
public void drawScapulaButton(){
    parent.fill(0, 128, 0); // Button color
    parent.noStroke();
    parent.ellipse(scapulaButtonX, scapulaButtonY, buttonRadius * 2, buttonRadius * 2);
}

//Function for drawing chest button
public void drawRibButton(){
    parent.fill(0, 128, 0); // Button color
    parent.noStroke();
    parent.ellipse(ribButtonX, ribButtonY, buttonRadius * 2, buttonRadius * 2);
}

//Function for drawing chest button
public void drawSpineButton(){
    parent.fill(0, 128, 0); // Button color
    parent.noStroke();
    parent.ellipse(thoracicSpineButtonX, thoracicSpineButtonY, buttonRadius * 2, buttonRadius * 2);
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


public void displayChestAndBack(){
    if (isMouseOverButton(scapulaButtonX, scapulaButtonY, buttonRadius)) {
        scapula.displayInfo();
        }  
    if (isMouseOverButton(ribButtonX, ribButtonY, buttonRadius)) {
        ribCage.displayInfo();
        }
    if (isMouseOverButton(thoracicSpineButtonX, thoracicSpineButtonY, buttonRadius)) {
         thoracicSpine.displayInfo();
        }      
}

}//End Chest And Back Class