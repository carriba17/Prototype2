package com.processing_example;

import processing.core.PApplet;

public class Mandible extends HeadAndNeck {
PApplet parent;

    Mandible(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(25);
        parent.fill(0);
        parent.text("The Mandible", 250, 350);
    }

}
