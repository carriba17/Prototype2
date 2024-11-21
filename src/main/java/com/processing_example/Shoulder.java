package com.processing_example;

import processing.core.PApplet;

public class Shoulder extends ArmAndHand {
PApplet parent;

Shoulder(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(25);
        parent.fill(0);
        parent.text("The Shoulder Joint", 525, 200);

        parent.textSize(15);
        parent.text("The shoulder joint, \nalso known as the glenohumeral \njoint, is a ball and socket joint \nwith the most extensive range of \nmotion in the human body. ", 525, 225);
        parent.text("The shoulder muscles \nhave a wide range of functions, \nincluding abduction, adduction, \nflexion, extension, internal \nand external rotation.", 525, 350);
    
    }

}
