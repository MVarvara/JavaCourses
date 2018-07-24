package ru.java.courses.sport.games;

import ru.java.courses.sport.Coach;
import ru.java.courses.sport.Scorable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Варвара on 05.07.2018.
 */
public class Team <T extends Player & Scorable> implements Scorable {
    public static final int MAX_PLAYERS_COUNT = 20;
    private List<T> players = new ArrayList<>();
    private Coach coach;

    public Team(List<T> players, Coach coach) {
        this.players = players;
        this.coach = coach;
    }
    
    public void addPlayer(T athlete){
        if (athlete == null) {
            throw new IllegalArgumentException("Athlete can not be null");
        }
        if (players.size()<MAX_PLAYERS_COUNT){
            players.add(athlete);
        }
    }

    public List<T> getPlayers() {
        return players;
    }

    public void setPlayers(List<T> players) {
        this.players = players;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    @Override
    public void makeScore() {
        //exception
    }

    @Override
    public int getScore() {
        int allScore = 0;
        for (Scorable player : players) {
            allScore+=player.getScore();
        }
        return allScore;
    }
}
