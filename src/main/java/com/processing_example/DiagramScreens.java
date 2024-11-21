package com.processing_example;
import processing.core.PApplet;
import processing.core.PImage;


public class DiagramScreens extends Main {
    PImage diagramImg;
    PApplet parent;

    public void setup(){
        diagramImg = loadImage("SkeletalDiagram.jpg");
    }

    // Declare a PImage object

    DiagramScreens(PApplet parent){
            this.parent = parent;
            // Load the image using the parent PApplet instance
            diagramImg = parent.loadImage("SkeletalDiagram.jpg");
    }



    // @Override
    public void draw() {
        parent.background(255);
        parent.image(diagramImg, 100, 100, 500, 500);
        // Display the image at position (100, 100)
        // Optionally resize the image:
        // image(img, 100, 100, 200, 150); // Resize to width 200 and height 150
    }
}
