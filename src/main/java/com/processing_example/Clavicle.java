package com.processing_example;

import processing.core.PApplet;

public class Clavicle extends ArmAndHand {
PApplet parent;

    Clavicle(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(25);
        parent.fill(0);
        parent.text("The Clavicle", 250, 450);
    }

}
