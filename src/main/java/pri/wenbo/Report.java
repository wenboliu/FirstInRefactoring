package pri.wenbo;

public class Report {
    String visitMovie(String title) {
        return "\t" + title;
    }

    String visitRental(double thisAmount, MovieInterface movieInterface) {

        return movieInterface.report(this) + "\t" +
                String.valueOf(thisAmount) + "\n";
    }
}
