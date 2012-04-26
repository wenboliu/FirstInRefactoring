package pri.wenbo;

class NewReleaseMovie extends Movie {

    NewReleaseMovie(String title) {
        super(title);
    }

    public double amount(int daysRented) {
        return daysRented * 3;
    }

    public int getFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
