package person;

import com.github.javafaker.Country;
import com.github.javafaker.DateAndTime;
import com.github.javafaker.Faker;
import com.github.javafaker.Address;
import com.github.javafaker.Job;


public class main {
    /*public <E extends Enum<E>> E option(Class <E> female male)*/

    public static void random(String[] args){
        double szam;
        szam=(int) (1000*Math.random());
        for (int i=0;i<szam;i++) {
            new randomPerson();
        }
    }
    public class Address{
        protected Address(Faker faker){
            Country country = faker.country();
            String state = faker.state();
            String city = faker.city();
            String streetaddress = faker.streetaddress();
            String zip = faker.zip();
        }

    }

    private static class randomPerson {
        Faker faker = new Faker();
         String name =faker.name().fullName();
         DateAndTime dob = faker.date();
         /*Person.Gender = faker.gender()*/
        com.github.javafaker.Address address = faker.address();
        com.github.javafaker.Internet email = faker.email();
        com.github.javafaker.Company public String profession();

    }
}
