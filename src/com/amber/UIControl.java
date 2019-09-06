package com.amber;

public class UIControl {
    //PROTECTED && DEFAULT - bad practice
    // it means it is only accessible within this package -- not agile


    private boolean isEnabled = true;

    //constructor
    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UIControl");
    }

    public void enabled() {
        isEnabled = true;
    }



    public void disable() {
        isEnabled = false;
    }

    //GET
    public boolean isEnabled() {
        return isEnabled;
    }
}
