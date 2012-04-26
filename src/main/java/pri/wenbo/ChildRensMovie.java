package pri.wenbo;

class ChildRensMovie extends Movie {

    ChildRensMovie(String title) {
        super(title);
    }

    public double amount(int daysRented) {
        return daysRented > 3 ? (daysRented - 3) * 1.5 : 1.5;
    }

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
