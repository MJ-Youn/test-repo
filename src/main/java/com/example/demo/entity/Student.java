package com.example.demo.entity;

/**
 * (non-javadoc)
 * 
 * @author MJ Youn
 * @since 2024. 08. 20.
 */
public class Student {

    private String name;
    private Integer age;
    private String phone;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     *            the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     *            the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Student [name=");
        builder.append(name);
        builder.append(", age=");
        builder.append(age);
        builder.append(", phone=");
        builder.append(phone);
        builder.append("]");
        return builder.toString();
    }

}
