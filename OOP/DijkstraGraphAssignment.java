
import java.util.*;

class WeightedRoad {
    public String city1;
    public String city2;
    public int distance;

    public WeightedRoad(String city1, String city2, int distance) {
        this.city1 = city1;
        this.city2 = city2;
        this.distance = distance;
    }
}

class WeightedRoadMap {
    Map<String, Set<WeightedRoad>> roadMap = new HashMap<>();

    public void readLine(String line) {
        String[] csv = line.split(",");
        String city1 = csv[0];
        String city2 = csv[1];
        int distance = Integer.parseInt(csv[2]);
        addRoad(city1, city2, distance);
    }

    private void addCity(String city) {
        roadMap.putIfAbsent(city, new HashSet<>());
    }

    private void addRoad(String city1, String city2, int distance) {
        addCity(city1);
        addCity(city2);
        roadMap.get(city1).add(new WeightedRoad(city1, city2, distance));
        roadMap.get(city2).add(new WeightedRoad(city2, city1, distance)); // For undirected
    }

    public Set<String> getAllCities() {
        return roadMap.keySet();
    }

    public Set<WeightedRoad> getAllOutgoingRoads(String city) {
        return roadMap.getOrDefault(city, new HashSet<>());
    }
}

public class DijkstraGraphAssignment {
    static WeightedRoadMap roadMap = new WeightedRoadMap();

    public static void readMap(Scanner scanner) {
        while (true) {
            String mapLine = scanner.nextLine();
            if (mapLine.equals("")) break;
            roadMap.readLine(mapLine);
        }
        System.out.println("Read map");
    }

    public static void findShortestRoute(String source, String destination) {
        Map<String, Integer> distances = new HashMap<>();
        Map<String, String> previous = new HashMap<>();
        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        for (String city : roadMap.getAllCities()) {
            distances.put(city, Integer.MAX_VALUE);
        }
        distances.put(source, 0);
        pq.add(source);

        while (!pq.isEmpty()) {
            String current = pq.poll();
            for (WeightedRoad road : roadMap.getAllOutgoingRoads(current)) {
                int newDist = distances.get(current) + road.distance;
                if (newDist < distances.get(road.city2)) {
                    distances.put(road.city2, newDist);
                    previous.put(road.city2, current);
                    pq.add(road.city2);
                }
            }
        }

        if (!distances.containsKey(destination) || distances.get(destination) == Integer.MAX_VALUE) {
            System.out.println("Not Reachable");
        } else {
            LinkedList<String> path = new LinkedList<>();
            String step = destination;
            while (step != null) {
                path.addFirst(step);
                step = previous.get(step);
            }
            System.out.println(String.join("->", path));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        readMap(scanner);
        findShortestRoute("City1", "City3"); // Change source & destination here
    }
}
