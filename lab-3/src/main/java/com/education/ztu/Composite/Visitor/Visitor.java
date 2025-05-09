package com.education.ztu.Composite.Visitor;

import com.education.ztu.Composite.*;

public interface Visitor {
    void visit(LightElementNode elementNode);
    void visit(LightTextNode textNode);
}