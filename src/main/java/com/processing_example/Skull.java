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
        parent.text("The Skull", 550, 150);

        parent.textSize(15);
        parent.text("The skull is anterior to \nthe spinal column and is \nthe bony structure that \nencases the brain.", 550, 175);
        parent.text("Its purpose is to protect \nthe brain and allow \nattachments for the facial \nmuscles. The two regions of the \nskull are the cranial and facial \nregion.", 550, 275);

    }

}
