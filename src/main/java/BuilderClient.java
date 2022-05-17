import java.util.Calendar;
import java.util.GregorianCalendar;

public class BuilderClient {
    public static void main(String[] args) {
        UserBuilder ub = new UserBuilder();

        User user = null;
        try {
            user = ub
                    .setId(1l)
                    .setName("Petya")
                    .setPassword("12345678")
                    .setSex(1)
                    .setEmail("petya@gmail.com")
                    .setBirthday(new GregorianCalendar(1980, Calendar.JANUARY , 1).getTime())
                    .setRegistrationDate()
                    .build();
        } catch (LoginPasswordEmptyException e) {
            e.printStackTrace();
        }

        System.out.println(user);
    }
}
