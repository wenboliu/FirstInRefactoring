package pri.wenbo;

public abstract class Movie implements MovieInterface {
    private String _title;

    protected Movie(String title) {
        _title = title;
    }


    public abstract int getFrequentRenterPoints(int daysRented);

    public String report(Report report) {
        return report.visitMovie(_title);
    }

}