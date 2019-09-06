package com.amber;

//SUPER
// A TEXT BOX IS A UIControl
public class TextBox extends UIControl{
    private String text = "";

//    public TextBox() {
//        super(true);
//        System.out.println("TextBox");
//    }


    @Override
    public void render() {
        System.out.println("Render TEXT BOX");
    }

    @Override
    public String toString(){
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void clear() {
        text = "";
    }
}
