package com.processing_example;

import processing.core.PApplet;

public class RibCage extends ChestAndBack {
PApplet parent;

    RibCage(PApplet parent){
        super(parent);
        this.parent = parent;
    }

    public void displayInfo(){
        parent.textSize(25);
        parent.fill(0);
        parent.text("The Rib Cage", 25, 200);

        parent.textSize(15);
        parent.text("Your rib cage surrounds \nand protects the vital organs \nin your chest cavity, your heart \nand lungs.", 25, 225);
        parent.text("It expands with your \nlungs when you breathe. As part \nof your axial skeleton, your rib \ncage helps form the trunk \nof your body. ", 25, 325);

    }

}
