package ru.java.courses.sport.games.football;

import ru.java.courses.sport.SportTitle;
import ru.java.courses.sport.games.Player;
import ru.java.courses.sport.Scorable;

/**
 * Created by Варвара on 05.07.2018.
 */
public class FootbalPlayer extends Player implements Scorable {

    public enum Type {
        DEFENDER, WINGER, GOALKEEPER
    }

    private Type type;


    public FootbalPlayer(String name, int age, Type type) {
        super(name, age);
        setType(type);
    }

    public FootbalPlayer(String name, int age, String name1, SportTitle title, int salary, Type type) {
        super(name, age, name1, title, salary);
        setType(type);
    }

    @Override
    public void makeScore() {
        addPoints(1);
    }

    @Override
    public int getScore() {
        return 0;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        if (type == null) {
            throw new IllegalArgumentException();
        }
        this.type = type;
    }
}
