package Builder;

public class Person {
    private String name;
    private Integer age;
    private String email;
    private String sex;

    public String toString()
    {
        return "name= "+name+", age="+age+", email="+email+", sex="+sex;
    }

    private Person(Builder builder)
    {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.sex = builder.sex;
    }

    public static class Builder{
        private String name;
        private Integer age;
        private String email;
        private String sex;

        public Builder(String name, Integer age)
        {
            this.name = name;
            this.age = age;
        }

        public Person build()
        {
            return new Person(this);
        }

        public Builder setEmail(String email)
        {
            this.email = email;
            return this;
        }

        public Builder setSex(String sex)
        {
            this.sex = sex;
            return this;
        }
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getSex() {
        return sex;
    }
}
