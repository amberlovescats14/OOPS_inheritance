package com.amber;

public class Main {

    public static void main(String[] args) {

	    var control = new TextBox();
	    control.disable();
        System.out.println(control.isEnabled());
	    control.setText("Amber");
	    // sout automatically calls to string, so u just use the instance
        System.out.println(control);



//-----------------------
        // DOWNCASTING
//        var ui = new UIControl(true);
//        var box = new TextBox();
//        show(ui);
//------------------------
        var point1 = new Point(1, 2);
        var point2 = new Point(1,2);
        // These each have their own address;
        //. equals will be true, because they compare their parent obj

        //after override
        System.out.println(point1.equals(point2)); //true

//-----------------------------
        //Polymorphism
        UIControl[] controls = {new TextBox(), new CheckBox()}; //could have a radioo buttono
        for (var c : controls){
            // if control is a TextBox => render something
            // else if checkbox => render CheckBox
            c.render();

        }
 //--------------------------
        //ABSTRACT CLASS


    }
        // OUTSIDE THE MAIN
        public static void show(UIControl control) {
            if(control instanceof TextBox) {
                var textBox = (TextBox)control;
                textBox.setText("Amber");
            }
            System.out.println(control);
        }


}


// every class extends obj

//method overRIDING
// Upcasting: casting to a super
//DownCasting: Casting an object to one of its subtypes

//- HASH CODES
//        var box1 = new TextBox();
//        box1.hashCode();
//        // has codes compare for equality
//        var box2 = box1;
//       // box1.equals(box2); //true


// DO NOT CREATE DEEP INHERITANCE

//// QUIZ ??????
// B
// False :: two instances of the same class have different locations
// HashCode: is the address of the class in memory
// defaultConstuctor: is automatic and has no parameters
// A : constructors dont have a return type, not even VOID
// SUPER: extends state from parent class
// Private cannot be accessed anywhere but that class. Protected cannot be accesed outside of package
// If not other wise stated, the default access is Public
// OVERIDING is redeclaring a method for that specific class
// @Override: so java knows what we are doing
// yes: we can UPCAST or DOWNCAST
// instanceOf: to loop through an array of instances
// polymorphism, encapsulation, abstraction, inheritance
//abstract is for a general class that is a parent to other classes. ui => textbox, checkbox
// yes. then u cant create an instance of that abstract class
//final: when we will not be extending
// when one parent has two children but those two children only have one grandchild
// no
