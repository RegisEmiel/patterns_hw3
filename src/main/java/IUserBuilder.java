import java.util.Date;

public interface IUserBuilder {
    IUserBuilder setId(long id);
    IUserBuilder setName(String name);
    IUserBuilder setPassword(String password);
    IUserBuilder setSex(int sex);
    IUserBuilder setEmail(String email);
    IUserBuilder setBirthday(Date birthday);
    IUserBuilder setRegistrationDate();

    User build() throws LoginPasswordEmptyException;

    boolean validate();
}