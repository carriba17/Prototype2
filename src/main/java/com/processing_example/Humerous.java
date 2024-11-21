package com.processing_example;

import processing.core.PApplet;

public class Humerous extends ArmAndHand {
PApplet parent;

    Humerous(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(25);
        parent.fill(0);
        parent.text("The Humerous", 50, 350);
    }

}
