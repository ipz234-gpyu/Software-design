package com.education.ztu.Memento;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TextEditorTest {
    // 1. Простий запис тексту
    @Test
    public void testWriteText() {
        TextEditor editor = new TextEditor();
        editor.write("Hello");
        assertEquals("Hello", getContent(editor));
    }

    // 2. Undo після одного write
    @Test
    public void testUndoOnce() {
        TextEditor editor = new TextEditor();
        editor.write("Text");
        editor.undo();
        assertEquals("", getContent(editor));
    }

    // 3. Багаторазовий undo
    @Test
    public void testMultipleUndo() {
        TextEditor editor = new TextEditor();
        editor.write("A");
        editor.write("B");
        editor.write("C");

        editor.undo();
        assertEquals("AB", getContent(editor));
        editor.undo();
        assertEquals("A", getContent(editor));
        editor.undo();
        assertEquals("", getContent(editor));
    }

    // 4. Undo без жодного write
    @Test
    public void testUndoWithoutWrite() {
        TextEditor editor = new TextEditor();
        editor.undo();
        assertEquals("", getContent(editor));
    }

    // 5. Перезапис після undo
    @Test
    public void testWriteAfterUndo() {
        TextEditor editor = new TextEditor();
        editor.write("First");
        editor.write(" Second");
        editor.undo();
        assertEquals("First", getContent(editor));

        editor.write(" New");
        assertEquals("First New", getContent(editor));
    }

    // 6. Послідовність write + undo + write + undo
    @Test
    public void testInterleavedWriteUndo() {
        TextEditor editor = new TextEditor();
        editor.write("A");
        editor.write("B");
        editor.undo();
        editor.write("C");
        editor.undo();
        assertEquals("A", getContent(editor));
    }

    // 7. Довгий текст
    @Test
    public void testLongText() {
        TextEditor editor = new TextEditor();
        String longText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        editor.write(longText);
        assertEquals(longText, getContent(editor));
    }

    // 8. Багаторазовий write без undo
    @Test
    public void testMultipleWritesNoUndo() {
        TextEditor editor = new TextEditor();
        editor.write("Java");
        editor.write(" ");
        editor.write("Rocks");
        assertEquals("Java Rocks", getContent(editor));
    }

    // 9. Undo до порожнього стану і ще раз
    @Test
    public void testUndoBeyondEmpty() {
        TextEditor editor = new TextEditor();
        editor.write("X");
        editor.undo();
        editor.undo();
        assertEquals("", getContent(editor));
    }

    // 10. Комбінація з повним циклом
    @Test
    public void testFullCycle() {
        TextEditor editor = new TextEditor();
        editor.write("Start");
        editor.write(" Middle");
        editor.write(" End");
        editor.undo();
        editor.undo();
        editor.write(" Again");
        assertEquals("Start Again", getContent(editor));
    }

    private String getContent(TextEditor editor) {
        try {
            var documentField = TextEditor.class.getDeclaredField("document");
            documentField.setAccessible(true);
            TextDocument doc = (TextDocument) documentField.get(editor);
            return doc.getContent();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}