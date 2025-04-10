package com.education.ztu.Composite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LightHTMLTest {
    @Test
    void testTextNodeHTML() {
        LightTextNode text = new LightTextNode("Hello");
        assertEquals("Hello", text.outerHTML());
        assertEquals("Hello", text.innerHTML());
    }

    @Test
    void testElementNodeWithoutChildren() {
        LightElementNode img = new LightElementNode("img", LightElementNode.DisplayType.INLINE, LightElementNode.ClosingType.SINGLE);
        img.addClass("image");
        assertEquals("<img class=\"image\"/>", img.outerHTML());
    }

    @Test
    void testElementNodeWithChildren() {
        LightElementNode p = new LightElementNode("p", LightElementNode.DisplayType.BLOCK, LightElementNode.ClosingType.PAIR);
        p.addClass("paragraph");
        p.appendChild(new LightTextNode("This is a paragraph."));

        assertEquals("<p class=\"paragraph\">This is a paragraph.</p>", p.outerHTML());
    }

    @Test
    void testComplexStructure() {
        LightElementNode div = new LightElementNode("div", LightElementNode.DisplayType.BLOCK, LightElementNode.ClosingType.PAIR);
        div.addClass("main");

        LightElementNode span = new LightElementNode("span", LightElementNode.DisplayType.INLINE, LightElementNode.ClosingType.PAIR);
        span.addClass("highlight");
        span.appendChild(new LightTextNode("Hello"));

        div.appendChild(span);

        assertEquals("<div class=\"main\"><span class=\"highlight\">Hello</span></div>", div.outerHTML());
    }

    @Test
    void testChildrenCount() {
        LightElementNode ul = new LightElementNode("ul", LightElementNode.DisplayType.BLOCK, LightElementNode.ClosingType.PAIR);
        ul.appendChild(new LightTextNode("Item 1"));
        ul.appendChild(new LightTextNode("Item 2"));

        assertEquals(2, ul.getChildrenCount());
    }

    @Test
    void testSingleTagCannotHaveChildren() {
        LightElementNode br = new LightElementNode("br", LightElementNode.DisplayType.INLINE, LightElementNode.ClosingType.SINGLE);
        assertThrows(UnsupportedOperationException.class, () -> {
            br.appendChild(new LightTextNode("Should fail"));
        });
    }
}