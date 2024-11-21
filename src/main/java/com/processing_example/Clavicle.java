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
        parent.text("The Clavicle", 50, 200);

        parent.textSize(15);
        parent.text("Your clavicles are \nlong bones that support your \nupper body and play an important \nrole in how you move.", 50, 225);
        parent.text("They hold your shoulder \nin place, allowing you to \ntransfer weight from your upper \nbody to your head, neck, back \nand chest (your axial skeleton).", 50, 325);
    
    }

}
