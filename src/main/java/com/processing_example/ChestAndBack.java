package com.processing_example;

import processing.core.PApplet;
import processing.core.PImage;

public class ChestAndBack extends DiagramScreens{

    PApplet parent;
    PImage chestAndBack;


    ChestAndBack(PApplet parent){
        super(parent);
        this.parent = parent;
        chestAndBack = parent.loadImage("chestAndBack.jpg");
    }
public void draw(){
    parent.background(255);
    parent.image(chestAndBack, 150, 100, 500, 500);
}

public void setup(){

}
}