package com.processing_example;

import processing.core.PApplet;

public class ThoracicSpine extends ChestAndBack {
PApplet parent;

    ThoracicSpine(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(25);
        parent.fill(0);
        parent.text("The Thoracic Spine", 250, 550);
    }

}
