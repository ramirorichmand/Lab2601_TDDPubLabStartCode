import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ServerTest {

    Server server;

    @BeforeEach
    public void setUp(){
        server = new Server();
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void testGuestOver18() {
        Guest underAgeGuest = new Guest(17, 10, 75, false, '£');
        Guest legalAgeGuest = new Guest(18, 10, 75, false, '£');

        assertThat(server.canServeGuest(underAgeGuest)).isFalse();
        assertThat(server.canServeGuest(legalAgeGuest)).isTrue();
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void testGuestHasEnoughMoney() {
        Guest notEnoughMoneyGuest = new Guest(18, 4, 75, false, '£');
        Guest enoughMoneyGuest = new Guest(18, 10, 75, false, '£');

        assertThat(server.canServeGuest(notEnoughMoneyGuest)).isFalse();
        assertThat(server.canServeGuest(enoughMoneyGuest)).isTrue();
    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

        @Test
        public void testGuestSoberEnough() {
            Guest notSoberEnoughGuest = new Guest(18, 10, 49, false, '£');
            Guest soberEnoughGuest = new Guest(18, 10, 75, false, '£');

            assertThat(server.canServeGuest(notSoberEnoughGuest)).isFalse();
            assertThat(server.canServeGuest(soberEnoughGuest)).isTrue();
        }
    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    public void testGuestNotBanned() {
        Guest bannedGuest = new Guest(18, 10, 49, false, '£');
        Guest notBannedGuest = new Guest(18, 10, 75, false, '£');

        assertThat(server.canServeGuest(bannedGuest)).isFalse();
        assertThat(server.canServeGuest(notBannedGuest)).isTrue();
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)
    @Test
    public void testGuestPaysInLocalCurrency() {
        Guest notLocalCurrencyGuest = new Guest(18, 10, 75, false, '$');
        Guest localCurrencyGuest = new Guest(18, 10, 75, false, '£');

        assertThat(server.canServeGuest(notLocalCurrencyGuest)).isFalse();
        assertThat(server.canServeGuest(localCurrencyGuest)).isTrue();
    }

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}