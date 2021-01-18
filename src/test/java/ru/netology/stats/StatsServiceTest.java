package ru.netology.stats;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    static Stream<Arguments> ArraysForTestingTotalSumMonth() {
        return Stream.of(
                Arguments.of((new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}), 180),
                Arguments.of((new long[]{18, 10, 14, 11, 12, 38, 26, 45, 7, 20, 45, 18}), 264),
                Arguments.of((new long[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}), 120),
                Arguments.of((new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}), 0),
                Arguments.of((new long[]{1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), 1)
        );
    }

    static Stream<Arguments> ArraysForTestingAverageSum() {
        return Stream.of(
                Arguments.of((new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}), 15),
                Arguments.of((new long[]{18, 10, 14, 11, 12, 38, 26, 45, 7, 20, 45, 18}), 22),
                Arguments.of((new long[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}), 10),
                Arguments.of((new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}), 0),
                Arguments.of((new long[]{1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), 0)
        );
    }

    static Stream<Arguments> ArraysForTestingMaxSumMonth() {
        return Stream.of(
                Arguments.of((new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}), 8),
                Arguments.of((new long[]{18, 10, 14, 11, 12, 38, 26, 45, 7, 20, 45, 18}), 11),
                Arguments.of((new long[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}), 12),
                Arguments.of((new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}), 12),
                Arguments.of((new long[]{1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), 1)
        );
    }

    static Stream<Arguments> ArraysForTestingMinSumMonth() {
        return Stream.of(
                Arguments.of((new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}), 9),
                Arguments.of((new long[]{18, 10, 14, 11, 12, 38, 26, 45, 20, 7, 45, 18}), 10),
                Arguments.of((new long[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}), 12),
                Arguments.of((new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}), 12),
                Arguments.of((new long[]{1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), 3)
        );
    }

    static Stream<Arguments> ArraysForTestingCalculateSumMaxMonth() {
        return Stream.of(
                Arguments.of((new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}), 5),
                Arguments.of((new long[]{18, 10, 14, 11, 12, 38, 26, 45, 7, 20, 45, 18}), 4),
                Arguments.of((new long[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}), 0),
                Arguments.of((new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}), 0),
                Arguments.of((new long[]{1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), 1)
        );
    }

    static Stream<Arguments> ArraysForTestingCalculateSumMinMonth() {
        return Stream.of(
                Arguments.of((new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}), 5),
                Arguments.of((new long[]{18, 10, 14, 11, 12, 38, 26, 45, 7, 20, 45, 18}), 8),
                Arguments.of((new long[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}), 0),
                Arguments.of((new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}), 0),
                Arguments.of((new long[]{1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), 1)
        );
    }

    @ParameterizedTest
    @MethodSource("ArraysForTestingTotalSumMonth")
    void TotalSum(long[] Month, long expected) {
        StatsService services = new StatsService();
        long actual = services.totalsummonth(Month);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("ArraysForTestingAverageSum")
    void AverageSum(long[] Month, long expected) {
        StatsService services = new StatsService();
        long actual = services.averagesummonth(Month);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("ArraysForTestingMaxSumMonth")
    void MaxSumMonth(long[] Month, long expected) {
        StatsService services = new StatsService();
        long actual = services.maxamountmonth(Month);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("ArraysForTestingMinSumMonth")
    void MinSumMonth(long[] Month, long expected) {
        StatsService services = new StatsService();
        long actual = services.minamountmonth(Month);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("ArraysForTestingCalculateSumMaxMonth")
    void CalculateSumMaxMonth(long[] Month, long expected) {
        StatsService services = new StatsService();
        long actual = services.calculateamountmaxmonth(Month);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("ArraysForTestingCalculateSumMinMonth")
    void CalculateSumMinMonth(long[] Month, long expected) {
        StatsService services = new StatsService();
        long actual = services.calculateamountminmonth(Month);
        assertEquals(expected, actual);
    }


}