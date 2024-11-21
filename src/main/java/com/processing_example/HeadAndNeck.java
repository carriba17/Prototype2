package com.processing_example;

import processing.core.PApplet;
import processing.core.PImage;

public class HeadAndNeck extends DiagramScreens{

    //Head Button Placement for Hover
    float skullButtonX = 400;
    float skullButtonY = 150;
   
    //Chest Button Placement for Hover
    float mandibleButtonX = 310;
    float mandibleButtonY = 385;

    //Arm Button Placement for Hover
    float spineButtonX = 450;
    float spineButtonY = 500;

    float buttonRadius = 10;
    PApplet parent;
    PImage headAndNeck;

    Skull skull;
    Mandible mandible;
    CervicalSpine cervicalSpine;


    HeadAndNeck(PApplet parent){
        super(parent);
        this.parent = parent;
        headAndNeck = parent.loadImage("HeadAndNeck.jpg");

        
    }
public void draw(){
    parent.background(255);
    parent.image(headAndNeck, 80, 100, 700, 500);
    drawSkullButton();
    drawMandibleButton();
    drawSpineButton();
    displayHeadAndNeckInfo();

}

public void setup(){
    skull = new Skull(parent);
    mandible = new Mandible(parent);
    cervicalSpine = new CervicalSpine(parent);
}
//Function for drawing Head button
public void drawSkullButton(){
    parent.fill(65, 105, 225); // Button color
    parent.noStroke();
    parent.ellipse(skullButtonX, skullButtonY, buttonRadius * 2, buttonRadius * 2);
}

//Function for drawing chest button
public void drawMandibleButton(){
    parent.fill(65, 105, 225); // Button color
    parent.noStroke();
    parent.ellipse(mandibleButtonX, mandibleButtonY, buttonRadius * 2, buttonRadius * 2);
}

//Function for drawing chest button
public void drawSpineButton(){
    parent.fill(65, 105, 225); // Button color
    parent.noStroke();
    parent.ellipse(spineButtonX, spineButtonY, buttonRadius * 2, buttonRadius * 2);
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

    public void displayHeadAndNeckInfo(){
        if (isMouseOverButton(skullButtonX, skullButtonY, buttonRadius)) {
            skull.displayInfo();
            }  
        if (isMouseOverButton(mandibleButtonX, mandibleButtonY, buttonRadius)) {
             mandible.displayInfo();
            }
        if (isMouseOverButton(spineButtonX, spineButtonY, buttonRadius)) {
             cervicalSpine.displayInfo();
            }      
    }
}//End Head and Neck Class
