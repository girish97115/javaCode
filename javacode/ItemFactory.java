package javacode;

//Factory class that generates objects
public class ItemFactory {
    public Item generateItem(String entity) {

        entity = entity.toLowerCase();
        switch (entity) {
            case "apple":
                return new apple();

            case "frog":
                return new frog();

            case "banana":
                return new banana();

            case "salt":
                return new salt();

            case "ink":
                return new ink();

            case "blood":
                return new blood();

            case "sky":
                return new sky();

            default:
                return null;

        }
    }

}
