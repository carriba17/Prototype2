package com.processing_example;

import processing.core.PApplet;

public class Skull extends HeadAndNeck {
PApplet parent;

    Skull(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(45);
        parent.fill(65, 105, 225);
        parent.text("The Skull", 1025, 250);

        parent.fill(0);
        parent.textSize(35);
        parent.text("The skull is anterior to \nthe spinal column and is \nthe bony structure that \nencases the brain.", 1025, 300);
        parent.text("Its purpose is to protect \nthe brain and allow \nattachments for the facial \nmuscles. The two regions of the \nskull are the cranial and facial \nregion.", 1025, 500);

    }

}
