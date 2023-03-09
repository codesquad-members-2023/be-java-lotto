package kr.codesquad.domain;

import java.util.List;

public class Line {

    private final RandomGenerator randomGenerator = new RandomGenerator();
    private final List<Boolean> points;

    public Line(List<String> people) {
        List<Boolean> randomBooleans = randomGenerator.generateRandomBooleans(people.size() - 1);
        while (isOverlapping(randomBooleans)) {
            randomBooleans = randomGenerator.generateRandomBooleans(people.size() - 1);
        }

        points = randomBooleans;
    }

    public boolean isOverlapping(List<Boolean> randomBooleans) {
        for (int i = 1; i < randomBooleans.size(); i++) {
            if (randomBooleans.get(i) && randomBooleans.get(i - 1)) return true;
        }
        return false;
    }

    public String draw() {
        StringBuilder sb = new StringBuilder();

        sb.append("  |");
        for (Boolean point : points) {
            sb.append(point ? "-----|" : "     |");
        }
        return sb.toString();
    }

    public int calculateNextLocation(int currentLocation) {
        if ((currentLocation > 0) && (points.get(currentLocation - 1))) {
            return currentLocation - 1;
        }

        if ((currentLocation < points.size()) && (points.get(currentLocation))) {
            return currentLocation + 1;
        }

        return currentLocation;
    }
}
