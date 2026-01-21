package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {

    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    // ---------------------------------------------------------
    // KIỂM THỬ THEO BẢNG QUYẾT ĐỊNH (Sử dụng Parameterized)
    // ---------------------------------------------------------
    
    @ParameterizedTest(name = "Điểm {0} => Kết quả mong đợi: {1} học sinh giỏi")
    @CsvSource({
        "9.0,   1",  // Rule: Điểm hợp lệ & >= 8 (Giỏi)
        "8.0,   1",  // Rule: Biên dưới của Giỏi
        "7.99,  0",  // Rule: Điểm hợp lệ & < 8 (Không giỏi)
        "0.0,   0",  // Rule: Biên dưới của hợp lệ
        "-0.01, 0",  // Rule: Ngoài khoảng dưới (Bỏ qua)
        "10.0,  1",  // Rule: Biên trên hợp lệ & Giỏi
        "10.01, 0"   // Rule: Ngoài khoảng trên (Bỏ qua)
    })
    void testCountExcellentStudents_DecisionTable(double score, int expectedCount) {
        assertEquals(expectedCount, analyzer.countExcellentStudents(Arrays.asList(score)));
    }

    // ---------------------------------------------------------
    // KIỂM THỬ TRƯỜNG HỢP DANH SÁCH (Mixed Cases)
    // ---------------------------------------------------------

    @Test
    public void testCountExcellentStudents_MixedList() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        // Giải thích: 9.0 (Giỏi), 8.5 (Giỏi), 7.0 (Hợp lệ nhưng ko giỏi), 11 & -1 (Loại)
        assertEquals(2, analyzer.countExcellentStudents(scores));
    }

    @Test
    public void testCalculateValidAverage_MixedValues() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        // Điểm hợp lệ: 9.0, 8.5, 7.0 => Trung bình = (24.5 / 3) = 8.1666...
        assertEquals(8.166, analyzer.calculateValidAverage(scores), 0.001);
    }

    @Test
    public void testEmptyList() {
        assertAll("Kiểm tra danh sách rỗng",
            () -> assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList())),
            () -> assertEquals(0, analyzer.calculateValidAverage(Collections.emptyList()), 0.001)
        );
    }

    @Test
    public void testAllInvalidScores() {
        List<Double> scores = Arrays.asList(-5.0, 15.0, 20.0);
        assertAll("Kiểm tra toàn bộ điểm không hợp lệ",
            () -> assertEquals(0, analyzer.countExcellentStudents(scores)),
            () -> assertEquals(0, analyzer.calculateValidAverage(scores), 0.001)
        );
    }
}
