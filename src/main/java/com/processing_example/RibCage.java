//Carter Arribas
// Rib Cage Class
// Dedicated to running the rib cage information and button placement
// 26 Novemeber 2024




package com.processing_example;

import processing.core.PApplet;

public class RibCage extends ChestAndBack {
PApplet parent;

    RibCage(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(35);
        parent.fill(65, 105, 225);
        parent.text("The Rib Cage", 75, 250);

        parent.textSize(25);
        parent.fill(0);
        parent.text("Your rib cage surrounds \nand protects the vital organs \nin your chest cavity, your heart \nand lungs.", 75, 300);
        parent.text("It expands with your \nlungs when you breathe. As part \nof your axial skeleton, your rib \ncage helps form the trunk \nof your body. ", 75, 450);

    }

}
