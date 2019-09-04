package prep.hackerrank.interviewprep.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author sharifahmed
 * @since 9/4/19
 */
public class SortingComparator {

    public static void main(String[] args) {
        List<Player> list = new ArrayList<>();
        list.add(new Player("david", 100));
        list.add(new Player("amy", 100));
        list.add(new Player("heraldo", 50));
        list.add(new Player("aakansha", 75));
        list.add(new Player("aleksa", 150));

        Collections.sort(list, new Checker());

        System.out.println(list);
    }

    private static class Player {
        private String name;
        private int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        @Override
        public String toString() {
            return this.name + " " + this.score;
        }
    }

    private static class Checker implements Comparator<Player> {
        public int compare(Player a, Player b) {
            if (a.getScore() == b.getScore()) {
                return a.getName().compareTo(b.getName());
            } else {
                return Integer.compare(b.getScore(), a.getScore());
            }
        }
    }
}
