package com.processing_example;

import processing.core.PApplet;

public class CervicalSpine extends HeadAndNeck {
PApplet parent;

    CervicalSpine(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(25);
        parent.fill(0);
        parent.text("Cervical Spine", 550, 550);
    }

}
