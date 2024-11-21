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
        parent.textSize(30);
        parent.fill(0);
        parent.text("Welcome to Carters Interactive Skeletal Diagram", 50, 150);
        parent.textSize(20);
        parent.text("Press S to start the Interactive experience", 200, 200);
        parent.image(skeletonStart, 175, 250, 400, 400);
    }
}
