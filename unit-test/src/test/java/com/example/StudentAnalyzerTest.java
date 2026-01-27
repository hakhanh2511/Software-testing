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
  // DECISION TABLE:
    // ┌─────────────────────────┬──────────┬─────────────────┬────────────┐
    // │ Điều kiện               │ Test Case│ Input (score)   │ Output     │
    // ├─────────────────────────┼──────────┼─────────────────┼────────────┤
    // │ Hợp lệ & Giỏi           │ 1, 2, 6  │ 9.0, 8.0, 10.0  │ 1          │
    // │ Hợp lệ & Không giỏi     │ 3, 4     │ 7.99, 0.0       │ 0          │
    // │ Không hợp lệ (< 0)      │ 5        │ -0.01           │ 0          │
    // │ Không hợp lệ (> 10)     │ 7        │ 10.01           │ 0          │
    // └─────────────────────────┴──────────┴─────────────────┴────────────┘
    
    "9.0,   1",  // TC1: Hợp lệ & Giỏi
    "8.0,   1",  // TC2: Hợp lệ & Giỏi (biên dưới)
    "7.99,  0",  // TC3: Hợp lệ & Không giỏi
    "0.0,   0",  // TC4: Hợp lệ & Không giỏi (biên dưới)
    "-0.01, 0",  // TC5: Không hợp lệ (< 0)
    "10.0,  1",  // TC6: Hợp lệ & Giỏi (biên trên)
    "10.01, 0"   // TC7: Không hợp lệ (> 10)
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
