package ru.java.courses.football;

/**
 * Created by Варвара on 24.07.2018.
 */
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()){
            this.name = name;
        } else {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
    }

    public Person(String name) {
        if (name != null && !name.isEmpty()){
            this.name = name;
        } else {
            throw new IllegalArgumentException("Имя команды не может быть пустым");
        }
    }
}
