//Carter Arribas
// Scapula Class
// Dedicated to running information and button placement for the Scapula Class
// 26 Novemeber 2024




package com.processing_example;

import processing.core.PApplet;

public class Scapula extends ChestAndBack {
PApplet parent;

    Scapula(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(35);
        parent.fill(65, 105, 225);
        parent.text("The Scapula", 1250, 350);

        parent.textSize(25);
        parent.fill(0);
        parent.text("The scapula has several \nimportant functions: Connecting \nyour humerus to your clavicle: \nIt joins your arm to your trunk \n(the center of your body).", 1250, 400);
        parent.text("Forming part of your \nshoulder joint: It makes up the \nback part of the socket that your \nhumerus fits into to make your \nshoulder (the posterior \nshoulder girdle).", 1250, 600);

    }

}
