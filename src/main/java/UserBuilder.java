import java.util.Date;

public class UserBuilder implements IUserBuilder {
    private Long id;
    private String name;
    private String password;
    private int sex;
    private String email;
    private Date birthday;
    private Date registrationDate;

    // Build
    public UserBuilder() {
        super();
    }

    @Override
    public IUserBuilder setId(long id) {
        this.id = id;

        return this;
    }

    @Override
    public IUserBuilder setName(String name) {
        this.name = name;

        return this;
    }

    @Override
    public IUserBuilder setPassword(String password) {
        this.password = password;

        return this;
    }

    @Override
    public IUserBuilder setSex(int sex) {
        this.sex = sex;

        return this;
    }

    @Override
    public IUserBuilder setEmail(String email) {
        this.email = email;

        return this;
    }

    @Override
    public IUserBuilder setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    @Override
    public IUserBuilder setRegistrationDate() {
        this.registrationDate = new Date();
        return this;
    }

    @Override
    public boolean validate() {
        boolean log = true;

        if (name.isEmpty() || password.isEmpty())
            log = false;

        return log;
    }

    @Override
    public User build() throws LoginPasswordEmptyException {
        if (!validate())
            throw new LoginPasswordEmptyException();
        return new User(id,
                name,
                password,
                sex,
                email,
                birthday,
                registrationDate);
    }
}