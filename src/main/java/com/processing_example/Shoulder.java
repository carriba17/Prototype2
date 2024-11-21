package com.processing_example;

import processing.core.PApplet;

public class Shoulder extends ArmAndHand {
PApplet parent;

Shoulder(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(25);
        parent.fill(0);
        parent.text("The Shoulder", 550, 250);
    }

}
