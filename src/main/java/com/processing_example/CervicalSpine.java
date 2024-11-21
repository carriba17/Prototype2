package com.processing_example;

import processing.core.PApplet;

public class CervicalSpine extends HeadAndNeck {
PApplet parent;

    CervicalSpine(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(25);
        parent.fill(0);
        parent.text("Cervical Spine", 550, 225);

        parent.textSize(15);
        parent.text("Your cervical spine \nconsists of the first seven \nvertebrae in your spine.", 550, 250);
        parent.text("It provides support \nfor the weight of your head, \nsurrounds and protects your \nspinal cord, and allows for a wide \nrange of head motions.", 550, 325);

    }

}
