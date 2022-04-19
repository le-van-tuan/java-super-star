package vn.sps.reflection;

import vn.sps.shared.GenericJson;

@LogMe(withTime = true)
public class Person extends GenericJson implements PersonActivity {

    private String name;

    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void walk() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void jump() {

    }
}
