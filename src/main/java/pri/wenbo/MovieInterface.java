package pri.wenbo;

public interface MovieInterface {

    double amount(int daysRented);

    int getFrequentRenterPoints(int daysRented);

    String report(Report report);
}
