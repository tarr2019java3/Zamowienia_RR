package pl.sda.zamowienia;

public class Customer {

    private String name;
    private String surname;
    private int age;
    private String email;

    public Customer(String name, String surname, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameProductException {
        if (!name.equals(name.toUpperCase())) {
            throw new NameProductException("Używaj tylko dużych liter");
        } else {
            this.name = name.toUpperCase();
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws NameProductException {
        if (!surname.equals(surname.toUpperCase())) {
            throw new NameProductException("Używaj tylko dużych liter");
        } else {
            this.surname = surname;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean checkEmail(String email) {
        return email.contains("@");
    }

    public int getAge() {
        return age;
    }

    public void setEmail(String email) throws EmailException {
        if (!this.checkEmail(email)) {
            throw new EmailException("Zły adres email");
        } else {
            this.email = email;
        }
    }

    public void setAge(int age) throws AgeConsumerException {
        if (age < 18) {
            throw new AgeConsumerException("Jesteś niepełnoletni");
        } else {
            this.age = age;
        }
    }
}