package com.processing_example;

import processing.core.PApplet;

public class StartScreen {
    PApplet parent;

    public StartScreen(PApplet parent) {
        this.parent = parent;
    }

    public void draw() {
        parent.background(0);
        parent.textSize(35);
        parent.text("Welcome to Carters...", 300, 250);
        parent.textSize(25);
        parent.text("Press S to start the Interactive experience", 200, 350);
    }
}
