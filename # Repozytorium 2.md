# Repozytorium 2 - kroki podjęte do zrobienia zadania 
1 Poszerzamy tworzony obiekt klasy  player z imieniem o tytuł i status

class Player {
    String name;
    Integer healthPoints = 100;
    String title;
     Boolean online;

    String identify() {
        return "[" + this.healthPoints + "] " + this.title + " "+ this.name; }
    }

    2 Tworzymy metodę *public static String getRandomTitle():*,  która zwraca losowy tytuł z listy tytułów (adm, cpt, gen, man, lt). Losuje indeks w zakresie od 0 do rozmiaru listy i zwraca tytuł znajdujący się pod tym indeksem i metodę *public static Boolean getOnline():*; Jest to metoda, która zwraca losową wartość logiczną (true lub false) za pomocą klasy Random. Oznacza to, że zwraca losowy stan "online".*


public static String getRandomTitle(){
        List<String> titls = List.of("adm","cpt","gen","man","lt");
        Random random = new Random();
    int randomIndex = random.nextInt(titls.size());
    return titls.get(randomIndex);
}
public static Boolean getOnline() {
    Random random = new Random();
    return random.nextBoolean();
} 
 3 następnym  kroku dopisuje do metody generateRandomPlayer uzyskany losowo status i tytuł i do metody  main , metoda main za pomocą instrukcji warunkowej pokazuje listę graczy którzy są aktywni.

 public static List<Player> generateRandomPlayers(int numberOfPlayers) {
        List<Player> players = new ArrayList<>();
            Player player = new Player();
            player.name = getRandomName();
            player.title = getRandomTitle();
            player.online = getOnline();
            players.add(player);
        }
        return players;

 public static void main(String[] args) {
        List<Player> players = generateRandomPlayers(numberOfPlayers);
        for (Player player : players) {
           if (player.online){
               System.out.println(player.identify());
           }
        }
    }

4 Aby Program generował listę 30 graczy należy dodać do metody main zmienną typu int numberofPlayers

 public static void main(String[] args) {
        int numberOfPlayers = 31;
        List<Player> players = generateRandomPlayers(numberOfPlayers);
        for (Player player : players) {
           if (player.online){
               System.out.println(player.identify());
           }
        }
    }
 5 Potem do metody generateRandomPlayers dodajemy pętle for  która wykonuje się numberOfPlayers razy, aby wygenerować odpowiednią liczbę graczy.
 

public static List<Player> generateRandomPlayers(int numberOfPlayers) {
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            Player player = new Player();
            player.name = getRandomName();
            player.title = getRandomTitle();
            player.online = getOnline();
            players.add(player);
        }
  }  return players;