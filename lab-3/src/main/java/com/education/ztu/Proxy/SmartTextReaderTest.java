package com.education.ztu.Proxy;

import org.junit.jupiter.api.*;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class SmartTextReaderTest {
    private static final String testFilePath = "testfile.txt";

    @BeforeAll
    static void setup() throws IOException {
        try (PrintWriter writer = new PrintWriter(testFilePath)) {
            writer.println("Hello");
            writer.println("World!");
        }
    }

    @AfterAll
    static void cleanup() {
        new File(testFilePath).delete();
    }

    @Test
    void testSmartTextReaderReadsFile() {
        SmartTextReader reader = new SmartTextReader();
        char[][] content = reader.readTextFile(testFilePath);

        assertEquals(2, content.length);
        assertArrayEquals("Hello".toCharArray(), content[0]);
        assertArrayEquals("World!".toCharArray(), content[1]);
    }

    @Test
    void testSmartTextCheckerLogsCorrectly() {
        SmartTextChecker checker = new SmartTextChecker(new SmartTextReader());
        char[][] content = checker.readTextFile(testFilePath);

        assertEquals(2, content.length);
    }

    @Test
    void testSmartTextReaderLockerDeniesAccess() {
        SmartTextReaderLocker locker = new SmartTextReaderLocker(new SmartTextReader(), ".*secret.*");
        char[][] content = locker.readTextFile("my_secret_file.txt");

        assertEquals(0, content.length);
    }

    @Test
    void testSmartTextReaderLockerAllowsAccess() {
        SmartTextReaderLocker locker = new SmartTextReaderLocker(new SmartTextReader(), ".*secret.*");
        char[][] content = locker.readTextFile(testFilePath);

        assertEquals(2, content.length);
    }
}