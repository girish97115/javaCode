package javacode;

import java.util.ArrayList;

abstract class Item {
    String name;
    ArrayList<String> colors = new ArrayList<String>();
    String speak(String color) {
        return "I'm " + name + "! I'm sometimes " + color;
    }
}

class apple extends Item {

    apple() {
        name = "Apple";
        colors.add("red");
        colors.add("green");
    }
}

class banana extends Item {

    banana() {
        name = "Banana";
        colors.add("yellow");
        colors.add("green");
    }
}

class salt extends Item {

    salt() {
        name = "Salt";
        colors.add("white");
    }
}

class ink extends Item {

    ink() {
        name = "Ink";
        colors.add("red");
        colors.add("black");
    }
}

class blood extends Item {

    blood() {
        name = "Blood";
        colors.add("red");
    }
}

class sky extends Item {

    sky() {
        name = "Sky";
        colors.add("blue");
        colors.add("black");
    }

}

class frog extends Item {

    frog() {
        name = "Frog";
        colors.add("blue");
        colors.add("yellow");
    }

    String speak(String color) {
        return "I'm " + name + "! I am " + color + " today";
    }

}
