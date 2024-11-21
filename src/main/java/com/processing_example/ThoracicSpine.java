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
        parent.text("The Thoracic Spine", 550, 150);

        parent.textSize(15);
        parent.text("Together, your thoracic \nspine and ribcage protect your \nheart and lungs.", 550, 175);
        parent.text("The joints in your \nthoracic spine are tight enough to\n protect these vital organs but loose \nenough to allow for the movements of \nbreathing — inhaling and exhaling.", 550, 275);

    }

}
