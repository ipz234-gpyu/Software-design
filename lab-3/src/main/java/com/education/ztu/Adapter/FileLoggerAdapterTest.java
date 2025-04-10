package com.education.ztu.Adapter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileLoggerAdapterTest {
    private final String logFile = "test_log.txt";
    private FileLoggerAdapter fileLogger;

    @BeforeEach
    void setUp() throws IOException {
        fileLogger = new FileLoggerAdapter(logFile);
    }

    @AfterEach
    void tearDown() {
        fileLogger.close();
        try {
            Files.deleteIfExists(Path.of(logFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testLogMessagesAreWrittenToFile() throws IOException {
        fileLogger.Log("Test log message");
        fileLogger.Warn("Test warning message");
        fileLogger.Error("Test error message");

        fileLogger.close(); // Ensure flushing before reading

        List<String> lines = Files.readAllLines(Path.of(logFile));

        assertTrue(lines.contains("LOG: Test log message"));
        assertTrue(lines.contains("WARNING: Test warning message"));
        assertTrue(lines.contains("ERROR: Test error message"));
    }
}
