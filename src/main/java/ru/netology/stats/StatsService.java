package ru.netology.stats;

public class StatsService {

    public long totalSumMonth(long SumMonths[]) {
        long Sum = 0;
        for (long SumMonth : SumMonths) {
            if (SumMonth >= 0) {
                Sum += SumMonth;
            }
        }
        return Sum;
    }

    public long averageSumMonth(long SumMonths[]) {
        long Month = 0;
        for (long SumMonth : SumMonths) {
            Month ++;
        }
        return totalSumMonth(SumMonths) / SumMonths.length;
    }

    public long maxAmountMonth(long SumMonths[]) {
        long CurrentMonth = SumMonths[0];
        long Month = 0;
        long MaxMonth = 0;
        for (long SumMonth : SumMonths) {
            Month ++;
            if (CurrentMonth <= SumMonth) {
                CurrentMonth = SumMonth;
                MaxMonth = Month;
            }
        }
        return MaxMonth;
    }

    public long minAmountMonth(long SumMonths[]) {
        long CurrentMonth = SumMonths[0];
        long Month = 0;
        long MinMonth = 0;
        for (long SumMonth : SumMonths) {
            Month ++;
            if (CurrentMonth >= SumMonth) {
                CurrentMonth = SumMonth;
                MinMonth = Month;
            }
        }
        return MinMonth;
    }

    public long calculateAmountMaxMonth(long SumMonths[]) {
        long CurrentMonth = averageSumMonth(SumMonths);
        long MaxSumMonth = 0;
        for (long SumMonth : SumMonths) {
            if (CurrentMonth < SumMonth) {
                MaxSumMonth ++;
            }
        }
        return MaxSumMonth;
    }

    public long calculateAmountMinMonth(long SumMonths[]) {
        long CurrentMonth = averageSumMonth(SumMonths);
        long MinSumMonth = 0;
        for (long SumMonth : SumMonths) {
            if (CurrentMonth > SumMonth) {
                MinSumMonth ++;
            }
        }
        return MinSumMonth;
    }

}