package Builder;

import common.PatternDemo;

public class BuilderPatternDemo implements PatternDemo {


    @Override
    public void run() {
        Person boy = new Person.Builder("sineth", 24)
                .setSex("male")
                .setEmail("thamudithaRulz@rulz.com")
                .build();

        Person person = new Person.Builder("john", 25)
                .setEmail("john@gmail.com")
                .build();

        System.out.println(boy);
        System.out.println(person);
    }
}
