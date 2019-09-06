package com.amber;

public abstract class UIControl {
    //PROTECTED && DEFAULT - bad practice
    // it means it is only accessible within this package -- not agile


    private boolean isEnabled = true;

    //constructor
//    public UIControl(boolean isEnabled) {
//        this.isEnabled = isEnabled;
//        System.out.println("UIControl");
//    }

    // UI is the general Class for other ones like checkbox, textBox , ect
    //so its render method gets passed over and is over ridded by children
    public abstract void render();

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
