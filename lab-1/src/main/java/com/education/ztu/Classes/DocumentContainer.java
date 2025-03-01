package com.education.ztu.Classes;

import com.education.ztu.Interfaces.Document;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DocumentContainer {
    private final List<Document> documents = new ArrayList<>();

    public void addDocument(Document document) {
        if (documents.stream().anyMatch(doc -> doc.getClass().equals(document.getClass()))) {
            throw new IllegalStateException("Document of this type already exists!");
        }
        documents.add(document);
    }

    public void removeDocument(Document document) {
        boolean removed = documents.removeIf(doc -> doc.getClass().equals(document.getClass()));
        if (!removed) {
            throw new IllegalStateException("Document not found!");
        }
    }

    public void swapDocuments(int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= documents.size() || index2 >= documents.size()) {
            throw new IndexOutOfBoundsException("Invalid index for swap!");
        }
        Collections.swap(documents, index1, index2);
    }

    public void displayDocuments() {
        documents.forEach(doc ->
                System.out.println(!doc.isHidden() ? doc.getInfo() : "Information hidden")
        );
    }

    public void displayDocumentByType(Class<? extends Document> type) {
        findDocumentByType(type).ifPresent(doc ->
                {
                    if(!doc.isHidden())
                        System.out.println(doc.getInfo());
                });
    }

    public void generateQRDocumentByType(Class<? extends Document> type) {
        findDocumentByType(type).ifPresent(doc -> System.out.println(doc.generateQR()));
    }

    public void toggleDocumentVisibility(Class<? extends Document> type, boolean show) {
        findDocumentByType(type).ifPresent(doc -> {
            if (show) {
                doc.showInfo();
            } else {
                doc.hideInfo();
            }
        });
    }

    private Optional<Document> findDocumentByType(Class<? extends Document> type) {
        return documents.stream().filter(type::isInstance).findFirst();
    }
}