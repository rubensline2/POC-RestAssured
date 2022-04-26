package configuration;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import data.*;

public class RestfulBookerE2ETests extends BaseSetup{
    private BookingData        newBooking;
    private BookingData        updatedBooking;
    private PartialBookingData partialUpdateBooking;
    private Tokencreds         tokenCreds;
    private int                bookingId;

    @BeforeTest
    public void testSetup () {
        BookingDataBuilder builder = new BookingDataBuilder ();
        TokenBuilder tokenbuild = new TokenBuilder ();
        newBooking = builder.bookingDataBuilder ();
        updatedBooking = builder.bookingDataBuilder ();
        partialUpdateBooking = builder.partialBookingBuilder ();
        tokenCreds = tokenbuild.tokenBuilder ();
    }
}
