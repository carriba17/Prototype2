package com.processing_example;

import processing.core.PApplet;
import processing.core.PImage;
// import gifAnimation.*;


public class StartScreen {
    
    PApplet parent;
    PImage skeletonStart;

    public StartScreen(PApplet parent) {
        this.parent = parent;
        skeletonStart = parent.loadImage("SkeletalStart.jpg");
    }

    public void draw() {
        parent.background(255);
        parent.textSize(50);
        parent.fill(0);
        parent.text("Welcome to Carter's Interactive Skeletal Diagram", 250, 200);
        parent.textSize(30);
        parent.text("Press S To Start The Interactive Experience", 525, 350);
        parent.image(skeletonStart, 525, 450, 600, 600);
    }
}
