package com.processing_example;

import processing.core.PApplet;

public class Scapula extends ChestAndBack {
PApplet parent;

    Scapula(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(25);
        parent.fill(0);
        parent.text("The Scapula", 550, 150);

        parent.textSize(15);
        parent.text("The scapula has several \nimportant functions: Connecting \nyour humerus to your clavicle: \nIt joins your arm to your trunk \n(the center of your body).", 550, 175);
        parent.text("Forming part of your \nshoulder joint: It makes up the \nback part of the socket that your \nhumerus fits into to make your \nshoulder (the posterior \nshoulder girdle).", 550, 300);

    }

}
