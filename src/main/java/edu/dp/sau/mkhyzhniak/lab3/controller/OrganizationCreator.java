package edu.dp.sau.mkhyzhniak.lab3.controller;

import edu.dp.sau.mkhyzhniak.lab3.model.Human;

import java.util.Set;
import java.util.HashSet;
import java.util.function.Supplier;

public class OrganizationCreator<T> {
    protected final RandomCreator randomCreator = new RandomCreator();

    // Метод для створення голови підрозділу
    protected Human createHead() {
        Human head = new Human();
        head.setFirstName(randomCreator.generateFirstName());
        head.setLastName(randomCreator.generateLastName());
        head.setPatronymic(randomCreator.generateFirstName());
        head.setSex(randomCreator.generateSex());
        return head;
    }

    protected <T> Set<T> createContents(int count, Supplier<T> creator) {
        Set<T> contents = new HashSet<>();
        for (int i = 0; i < count; i++) {
            contents.add(creator.get());
        }
        return contents;
    }
}
