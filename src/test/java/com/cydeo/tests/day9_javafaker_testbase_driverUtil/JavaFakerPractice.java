package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    // JAVAFAKER IS A TOOL WHICH FACILITATES TO GET RANDOM VALUES (int, string ...) , it is like Lorem Ipsum


    @Test
    public  void  test1(){
        // creating Faker object to reach methods
        Faker faker= new Faker();
        //Faker faker= new Faker(new Locale("fr"));    --->  for changing language

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        // numerify() method will generate random numbers in the format we want to get
        System.out.println("faker.numerify() = " + faker.numerify("##-##-####"));

        System.out.println("faker.numerify(\"312-###-####\") =" +
                " " + faker.numerify("312-###-####"));  // will only change after initial three number

        // letterify() method will return random letters where we pass "?"
        System.out.println("faker.letterify(\"???-????\") = " + faker.letterify("???-????"));

        // bothify("??##") method
        System.out.println("faker.bothify(\"##??- ##?-#?#?#?\") = " + faker.bothify("##??- ##?-#?#?#?"));

        //faker.finance().creditCard() method
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());

        System.out.println("faker.chuckNorris().fact().replaceAll(\"Chuck Norris\", \"Muhtar\") =" +
                " " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));


    }


}
