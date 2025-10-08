import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountServiceTest {


    AccountService accountService = new AccountService();

    @DisplayName("Register account should match expected result from csv")
    @ParameterizedTest(name = "[{index}] user={0}, pass={1}, email={2} => expected={3}")
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 1)
    void testRegisterAccount(String username, String password, String email, boolean expected) {
        boolean actual = accountService.registerAccount(username, password, email);
        assertEquals(expected, actual);
    }


    @DisplayName("isValidEmail test")
    @ParameterizedTest
    @CsvSource({
            "john@example.com,true",
            "a@b.co,true",
            "first.last+tag@domain.io,true",
            "no-at-symbol,false",
            "user@,false",
            "user@domain,false",
            "@domain.com,false"
    })
    void testIsValidEmail(String email, boolean expected) {
        assertEquals(expected, accountService.isValidEmail(email));
    }


}
