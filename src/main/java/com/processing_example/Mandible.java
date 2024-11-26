package com.processing_example;

import processing.core.PApplet;

public class Mandible extends HeadAndNeck {
PApplet parent;

    Mandible(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(45);
        parent.fill(65, 105, 225);
        parent.text("The Mandible", 125, 250);

        parent.textSize(35);
        parent.fill(0);
        parent.text("In humans, the mandible \nis the only mobile bone \nof the skull (other than the \ntiny bones of the middle ear).", 125, 300);
        parent.text("It is attached to muscles \ninvolved in chewing and \nother mouth movements and \nfunctions by moving in \nopposition to the maxilla \n(upper jaw);", 125, 500);

    }

}
