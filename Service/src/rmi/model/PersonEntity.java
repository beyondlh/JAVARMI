package rmi.model;

import java.io.Serializable;

/**
 * �������̳�Serializable
 */
public class PersonEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
