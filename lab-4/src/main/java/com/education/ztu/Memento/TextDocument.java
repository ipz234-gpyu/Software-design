package com.education.ztu.Memento;

public class TextDocument {
    private String content;

    public TextDocument() {
        content = "";
    }

    public void write(String text) {
        content += text;
    }

    public void erase() {
        content = "";
    }

    public String getContent() {
        return content;
    }

    public TextMemento save() {
        return new TextMemento(content);
    }

    public void restore(TextMemento memento) {
        this.content = memento.getContent();
    }
}