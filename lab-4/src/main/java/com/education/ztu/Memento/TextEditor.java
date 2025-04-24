package com.education.ztu.Memento;

public class TextEditor {
    private TextDocument document = new TextDocument();
    private History history = new History();

    public void write(String text) {
        history.save(document.save());
        document.write(text);
    }

    public void undo() {
        if (!history.isEmpty()) {
            TextMemento previousState = history.undo();
            document.restore(previousState);
        } else {
            System.out.println("Немає що відмінити.");
        }
    }

    public void show() {
        System.out.println("Поточний текст: \"" + document.getContent() + "\"");
    }
}