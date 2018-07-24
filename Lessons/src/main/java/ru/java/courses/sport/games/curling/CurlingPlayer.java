package ru.java.courses.sport.games.curling;

import ru.java.courses.sport.SportTitle;
import ru.java.courses.sport.games.Player;
import ru.java.courses.sport.Scorable;

/**
 * Created by Варвара on 05.07.2018.
 */
public class CurlingPlayer extends Player implements Scorable {

    public CurlingPlayer(String name, int age) {
        super(name, age);
    }

    public CurlingPlayer(String name, int age, String name1, SportTitle title, int salary) {
        super(name, age, name1, title, salary);
    }

    @Override
    public void makeScore(){
        addPoints(10);
    }

    @Override
    public int getScore() {
        return 0;
    }
}
