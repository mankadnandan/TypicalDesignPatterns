import java.time.LocalDate;

/**
 * Created by Nandan Mankad on 15-01-21.
 */
public class VacationFacade {
    public void book(LocalDate startDate, LocalDate endDate) {
        Flight flight = new Flight();
        flight.bookOutwardJourney(startDate);
        flight.bookReturnJourney(endDate);

        Hotel hotel = new Hotel();
        hotel.book(startDate, endDate);

        CarRental carRental = new CarRental();
        carRental.book(startDate, endDate);
    }
}
