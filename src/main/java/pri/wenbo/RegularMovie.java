package pri.wenbo;

class RegularMovie extends Movie {

    RegularMovie(String title) {
        super(title);
    }

    public double amount(int daysRented) {
        return daysRented > 2 ? (daysRented - 2) * 1.5 : 2;
    }

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
