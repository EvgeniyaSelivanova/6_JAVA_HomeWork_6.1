package ru.netology.stats;

public class StatsService {

    public long totalsummonth(long SumMonths[]) {
        long Sum = 0;
        for (long SumMonth : SumMonths) {
            if (SumMonth >= 0) {
                Sum += SumMonth;
            }
        }
        return Sum;
    }

    public long averagesummonth(long SumMonths[]) {
        long Month = 0;
        for (long SumMonth : SumMonths) {
            Month = Month + 1;
        }
        return totalsummonth(SumMonths) / Month;
    }

    public long maxamountmonth(long SumMonths[]) {
        long CurrentMonth = SumMonths[0];
        long Month = 0;
        long MaxMonth = 0;
        for (long SumMonth : SumMonths) {
            Month = Month + 1;
            if (CurrentMonth <= SumMonth) {
                CurrentMonth = SumMonth;
                MaxMonth = Month;
            }
        }
        return MaxMonth;
    }

    public long minamountmonth(long SumMonths[]) {
        long CurrentMonth = SumMonths[0];
        long Month = 0;
        long MinMonth = 0;
        for (long SumMonth : SumMonths) {
            Month = Month + 1;
            if (CurrentMonth >= SumMonth) {
                CurrentMonth = SumMonth;
                MinMonth = Month;
            }
        }
        return MinMonth;
    }

    public long calculateamountmaxmonth(long SumMonths[]) {
        long CurrentMonth = averagesummonth(SumMonths);
        long MaxSumMonth = 0;
        for (long SumMonth : SumMonths) {
            if (CurrentMonth < SumMonth) {
                MaxSumMonth = MaxSumMonth + 1;
            }
        }
        return MaxSumMonth;
    }

    public long calculateamountminmonth(long SumMonths[]) {
        long CurrentMonth = averagesummonth(SumMonths);
        long MinSumMonth = 0;
        for (long SumMonth : SumMonths) {
            if (CurrentMonth > SumMonth) {
                MinSumMonth = MinSumMonth + 1;
            }
        }
        return MinSumMonth;
    }

}