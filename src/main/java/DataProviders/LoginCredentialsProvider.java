package DataProviders;

import org.testng.annotations.DataProvider;

public class LoginCredentialsProvider {

    @DataProvider(name = "Valid credentials")
    private Object[][] validCredentials(){
            return new Object[][] {
            {"testseavusassignment@gmail.com", "Zlaja2019"},
        };
    }

    @DataProvider(name = "Invalid credentials")
    private Object[][] invalidCredentials(){
        return new Object[][] {
                {"testseavusassignment@gmail.com", "Zlaja20"},
        };
    }
}
