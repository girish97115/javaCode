package javacode;

import java.util.HashMap;

public class gameOperations {

    private HashMap<String, Item> subscribed;

    gameOperations() {
        subscribed = new HashMap<String, Item>();
    }

    ItemFactory factory = new ItemFactory();

    // subscribe
    private boolean subscribe(String entity) {
        Item ent = factory.generateItem(entity);
        if (ent == null) {
            return false;
        }
        subscribed.put(entity.toLowerCase(), ent);
        return true;
    }

    // to unsubscribe
    private boolean unsubscribe(String entity) {

        if (subscribed.containsKey(entity.toLowerCase())) {
            subscribed.remove(entity.toLowerCase());
            return true;
        }
        return false;

    }

    // fetch the items with given color
    private void colorMatch(String color) {
        subscribed.forEach((k, v) -> {

            if (v.colors.contains(color)) {
                System.out.println(v.speak(color.toLowerCase()));

            }
        });

    }

    // print all subscribed items
    private void printAllSubscribed() {
        System.out.print("[ ");
        subscribed.forEach((k, v) -> {

            System.out.print(k + " ");

        });
        System.out.println("]");
    }

    // checking what kind of command it is
    private String toCommand(String command) {
        if (command.startsWith("+")) {
            return "Subscribe";
        } else if (command.startsWith("-")) {
            return "unSubscribe";
        } else {
            return command;
        }
    }

    // Performing operation according to the Command
    void getCommmands(String command) {

        switch (toCommand(command)) {
            case "list":
                printAllSubscribed();
                break;

            case "Subscribe":

                if (subscribe(command.substring(1))) {
                    System.out.println("Subscribed " + command.substring(1));
                } else {
                    System.out.println("Some Error occured");
                }
                break;

            case "unSubscribe":
                if (unsubscribe(command.substring(1))) {
                    System.out.println("unSubscribed " + command.substring(1));
                } else {
                    System.out.println("Some Error occured");
                }
                break;

            case "exit":
                System.out.println("Exiting....");
                System.exit(0);
            default:
                colorMatch(command);
                break;

        }

    }

}
