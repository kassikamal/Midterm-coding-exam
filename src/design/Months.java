package design;

public enum Months {
    January, February, March, April, May, June, July, August, September, October, November, December
    January(1),
    February(2),
    March(3),
    April(4),
    May(5),
    June(6),
    July(7),
    August(8),
    September(9),
    October(10),
    November(11),
    Decemeber(12);
    private final int value;
    private Month(int value)
    {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    }
}
