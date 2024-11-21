package com.processing_example;

import processing.core.PApplet;

public class Skull extends HeadAndNeck {
PApplet parent;

    Skull(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(25);
        parent.fill(0);
        parent.text("The Skull", 500, 150);
    }

}
