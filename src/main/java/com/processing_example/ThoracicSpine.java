//Carter Arribas
// Thoracic Spine Class
// Dedicated to running information and handling of the Thoracic Spine class
// 26 Novemeber 2024


package com.processing_example;

import processing.core.PApplet;

public class ThoracicSpine extends ChestAndBack {
PApplet parent;

    ThoracicSpine(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(35);
        parent.fill(65, 105, 225);
        parent.text("The Thoracic Spine", 50, 450);

        parent.textSize(25);
        parent.fill(0);
        parent.text("Together, your thoracic \nspine and ribcage protect your \nheart and lungs.", 50, 500);
        parent.text("The joints in your thoracic\n spine are tight enough \nto protect these vital organs but\nloose enough to allow for the \nmovements of breathing —\ninhaling and exhaling.", 50, 650);

    }

}
