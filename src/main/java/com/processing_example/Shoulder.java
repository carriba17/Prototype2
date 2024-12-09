//Carter Arribas
// Shoulder Class
// Dedicated to running information and handling of the Shoulder class
// 26 Novemeber 2024




package com.processing_example;

import processing.core.PApplet;

public class Shoulder extends ArmAndHand {
PApplet parent;

Shoulder(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(45);
        parent.fill(65, 105, 225);
        parent.text("The Shoulder Joint", 950, 300);

        parent.textSize(35);
        parent.fill(0);
        parent.text("The shoulder joint, \nalso known as the glenohumeral \njoint, is a ball and socket joint \nwith the most extensive range of \nmotion in the human body. ", 950, 350);
        parent.text("The shoulder muscles \nhave a wide range of functions, \nincluding abduction, adduction, \nflexion, extension, internal \nand external rotation.", 950, 600);
    
    }

}
