package com.processing_example;

import processing.core.PApplet;

public class RibCage extends ChestAndBack {
PApplet parent;

    RibCage(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(25);
        parent.fill(0);
        parent.text("The Rib Cage", 50, 350);
    }

}
