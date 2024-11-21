package com.processing_example;

import processing.core.PApplet;

public class Humerous extends ArmAndHand {
PApplet parent;

    Humerous(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(25);
        parent.fill(0);
        parent.text("The Humerous", 500, 250);


        parent.textSize(15);
        parent.text("The humerus is the bone \nin your upper arm that's located \nbetween your elbow and your \nshoulder. ", 500, 275);
        parent.text("Its main function is to \nprovide support for your shoulder \nand a wide variety of movements \nfor your arm. Fractures are the most \ncommon injury to the humerus, and \noften occur because of a \ndirect blow to the bone.", 500, 375);
    }

}
