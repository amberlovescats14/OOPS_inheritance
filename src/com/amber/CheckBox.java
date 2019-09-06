package com.amber;

public final class CheckBox extends UIControl {
    // you CANNOT extend a FINAL class -- not used often

    //U HAVE TO either implement override or declare abstract IF the parent is abstract
    @Override
    public void render() {
        System.out.println("Render CheckBox");
    }

    // methods can also be FINAL
    public final boolean isFinal() {
        return true;
    }
}

//STRINGS are IMMUTABLE in java