package com.processing_example;

import processing.core.PApplet;

public class Scapula extends ChestAndBack {
PApplet parent;

    Scapula(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(25);
        parent.fill(0);
        parent.text("The Scapula", 500, 150);
    }

}
