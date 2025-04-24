package com.education.ztu.Memento;

import java.util.Stack;

public class History {
    private Stack<TextMemento> history = new Stack<>();

    public void save(TextMemento memento) {
        history.push(memento);
    }

    public TextMemento undo() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}