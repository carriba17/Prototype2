package com.processing_example;

import processing.core.PApplet;

public class Clavicle extends ArmAndHand {
PApplet parent;

    Clavicle(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(45);
        parent.fill(65, 105, 225);
        parent.text("The Clavicle", 75, 300);

        parent.textSize(35);
        parent.fill(0);
        parent.text("Your clavicles are \nlong bones that support your \nupper body and play an \nimportant role in how you \nmove.", 75, 350);
        parent.text("They hold your shoulder \nin place, allowing you to \ntransfer weight from your upper \nbody to your head, neck, back \nand chest (your axial skeleton).", 75, 600);
    
    }

}
