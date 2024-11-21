package com.processing_example;

import processing.core.PApplet;
import processing.core.PImage;

public class ArmAndHand extends DiagramScreens{

    PApplet parent;
    PImage armAndHand;


    ArmAndHand(PApplet parent){
        super(parent);
        this.parent = parent;
        armAndHand = parent.loadImage("armAndHandRight.jpg");
    }
public void draw(){
    parent.background(255);
    parent.image(armAndHand, 300, 100, 250, 500);
}

public void setup(){

}
}