package com.processing_example;

import processing.core.PApplet;

public class Mandible extends HeadAndNeck {
PApplet parent;

    Mandible(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(25);
        parent.fill(0);
        parent.text("The Mandible", 50, 250);

        parent.textSize(15);
        parent.text("In humans, the mandible \nis the only mobile bone \nof the skull (other than the \ntiny bones of the middle ear).", 50, 275);
        parent.text("It is attached to muscles \ninvolved in chewing and \nother mouth movements and \nfunctions by moving in opposition \nto the maxilla (upper jaw);", 50, 375);

    }

}
