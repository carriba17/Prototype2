package com.processing_example;

import processing.core.PApplet;
import processing.core.PImage;

public class HeadAndNeck extends DiagramScreens{

    PApplet parent;
    PImage headAndNeck;


    HeadAndNeck(PApplet parent){
        super(parent);
        headAndNeck = parent.loadImage("HeadAndNeck.jpg");
    }
public void draw(){
    parent.background(255);
    parent.image(headAndNeck, 100, 100, 500, 500);
}

public void setup(){

}
}
