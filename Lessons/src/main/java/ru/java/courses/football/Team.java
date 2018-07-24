package ru.java.courses.football;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Варвара on 24.07.2018.
 */
public class Team {
    private static final int MAX_PLAYERS_COUNT = 20;
    private List<Player> Players = new ArrayList<>();
    private Coach coach;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()){
            this.name = name;
        } else {
            throw new IllegalArgumentException("Имя команды не может быть пустым");
        }
    }

    public Team(String name) {
        if (name != null && !name.isEmpty()){
            this.name = name;
        } else {
            throw new IllegalArgumentException("Имя команды не может быть пустым");
        }
    }

    public static int getMaxPlayersCount() {
        return MAX_PLAYERS_COUNT;
    }

    public List<Player> getPlayers() {
        return Players;
    }

    public void setPlayers(List<Player> players) {
        Players = players;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public void addPlayers(Player ... player){
        for (Player player1 : player) {
            if (Players.size()<MAX_PLAYERS_COUNT){
                Players.add(player1);
            } else {
                throw new IllegalArgumentException("В команде не может быть больше " + MAX_PLAYERS_COUNT + "игроков");
            }
        }
    }

    public void removePlayer(int i){
        if (Players.size()<i){
            throw new IllegalArgumentException("В команде менее " + i + "игроков");
        } else {
            Players.remove(i);
        }
    }

    public int getPlayersCount(){
        return Players.size();
    }

    public int getScore(){
        int score = 0;
        for (Player player : Players) {
            score+=player.getGoals();
        }
        return score;
    }
}
