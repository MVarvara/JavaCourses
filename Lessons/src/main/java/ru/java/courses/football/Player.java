package ru.java.courses.football;

/**
 * Created by Варвара on 24.07.2018.
 */
public class Player extends Person implements ScoringPlayer {
    private PlayerRole role;
    private boolean isActive = true;
    private int goals;

    public Player(String name) {
        super(name);
    }

    @Override
    public void score() {
        if (isActive){
            goals++;
        } else {
            throw new IllegalArgumentException("Запасные игроки не могут забивать голы");
        }

    }

    public PlayerRole getRole() {
        return role;
    }

    public void setRole(PlayerRole role) {
        if (role!= null){
            this.role = role;
        } else {
            throw new IllegalArgumentException("Роль не может быть null");
        }
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public Player(String name, PlayerRole role) {
        super(name);
        if (role!= null){
            this.role = role;
        } else {
            throw new IllegalArgumentException("Роль не может быть равна null");
        }

    }
}
