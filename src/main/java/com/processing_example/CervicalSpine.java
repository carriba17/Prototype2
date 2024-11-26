package com.processing_example;

import processing.core.PApplet;

public class CervicalSpine extends HeadAndNeck {
PApplet parent;

    CervicalSpine(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(45);
        parent.fill(65, 105, 225);
        parent.text("Cervical Spine", 1025, 250);

        parent.textSize(35);
        parent.fill(0);
        parent.text("Your cervical spine \nconsists of the first seven \nvertebrae in your spine.", 1025, 300);
        parent.text("It provides support \nfor the weight of your head, \nsurrounds and protects your \nspinal cord, and allows for a wide \nrange of head motions.", 1025, 500);

    }

}
