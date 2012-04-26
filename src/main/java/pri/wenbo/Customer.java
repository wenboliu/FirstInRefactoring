package pri.wenbo;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        int frequentRenterPoints = getFrequentRenterPoints(_rentals);
        double totalAmount = getTotalAmount(_rentals);
        return createResult(frequentRenterPoints, totalAmount, new Report());
    }

    private String createResult(int frequentRenterPoints, double totalAmount, Report report) {
        String result = "Rental Record for " + getName() + "\n";
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.report();
        }

        result += "Amount owed is " + String.valueOf(totalAmount) +
                "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)
                +
                " frequent renter points";
        return result;
    }

    private double getTotalAmount(Vector _rentals) {
        Enumeration rentals = _rentals.elements();
        double totalAmount = 0;
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            double thisAmount = each.amountFor();
            totalAmount += thisAmount;
        }
        return totalAmount;
    }

    private int getFrequentRenterPoints(Vector _rentals) {
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            frequentRenterPoints += each.getPrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

}

