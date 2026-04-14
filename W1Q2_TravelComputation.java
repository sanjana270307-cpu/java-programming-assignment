// Program to compute total distance and time of travel

class W1Q2_TravelComputation {

    public static void main(String[] args) {

        // Traveler name
        String name = "Eric";

        // Cities
        String fromCity = "Chennai";
        String viaCity = "Vellore";
        String toCity = "Bangalore";

        // Distances in km
        double distanceFromToVia = 156.6;
        double distanceViaToFinalCity = 211.8;

        // Time in minutes
        int timeFromToVia = 4 * 60 + 4;
        int timeViaToFinalCity = 4 * 60 + 25;

        // Total calculations
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Output
        System.out.println("The Total Distance travelled by " + name +
                " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistance +
                " km and the Total Time taken is " +
                totalTime + " minutes");
    }
}