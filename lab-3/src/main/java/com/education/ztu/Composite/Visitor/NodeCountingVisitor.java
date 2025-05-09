package com.education.ztu.Composite.Visitor;

import com.education.ztu.Composite.*;

public class NodeCountingVisitor implements Visitor {
    private int elementCount = 0;
    private int textCount = 0;

    @Override
    public void visit(LightElementNode elementNode) {
        elementCount++;
    }

    @Override
    public void visit(LightTextNode textNode) {
        textCount++;
    }

    public int getElementCount() {
        return elementCount;
    }

    public int getTextCount() {
        return textCount;
    }

    public int getTotalCount() {
        return elementCount + textCount;
    }
}