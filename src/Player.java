
class Player {
    String name;
    Integer healthPoints = 100;
    String title;
     Boolean online;

    String identify() {
        return "[" + this.healthPoints + "] " + this.title + " "+ this.name; }
    }


