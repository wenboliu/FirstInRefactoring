package pri.wenbo;

class Rental {
    private MovieInterface _movieInterface;
    private int _daysRented;

    public Rental(MovieInterface movieInterface, int daysRented) {
        _movieInterface = movieInterface;
        _daysRented = daysRented;
    }

    public MovieInterface getMovie() {
        return _movieInterface;
    }

    double amountFor() {
        return _movieInterface.amount(_daysRented);
    }

    int getPrequentRenterPoints() {
        return _movieInterface.getFrequentRenterPoints(_daysRented);
    }

    String report(Report report) {
        return report.visitRental(amountFor(), _movieInterface);
    }

}