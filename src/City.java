import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class City {
    String name;

    public class Connection {
        City name;
        int cost;

        public Connection(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }

    }

    List<Connection> connection = new ArrayList<>();


    public City(String name) {
        this.name = name;
    }

    public City(String name, Connection... connections) {
        this.name = name;

        this.connection = Arrays.stream(connections).toList();

    }
}
