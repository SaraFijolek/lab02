import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static String getRandomName() {
        List<String> names = List.of("Yoda", "Obi-Wan Kenobi", "Luke Skywaker", "Princess Lela ", "Han Solo");
        Random random = new Random();
        int randomIndex = random.nextInt(names.size());
        return names.get(randomIndex);
    }

    public static List<Player> generateRandomPlayers(int numberOfPlayers) {
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            Player player = new Player();
            player.name = getRandomName();
            player.title = getRandomTitle();
            player.online = getOnline();
            players.add(player);
        }
        return players;
    }
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

    public static void main(String[] args) {
        int numberOfPlayers = 31;
        List<Player> players = generateRandomPlayers(numberOfPlayers);
        for (Player player : players) {
           if (player.online){
               System.out.println(player.identify());
           }
        }
    }
}