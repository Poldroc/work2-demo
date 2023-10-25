package com.west2.java.work2;

/**
 * 动物抽象类
 *
 * @author Poldroc
 * @date 2023/10/25
 */
public abstract class Animal {

    /**
     * 名字
     */
    protected String name;

    /**
     * 年龄
     */
    protected int age;

    /**
     * 性别
     */
    protected Gender gender;

    /**
     * 进价
     */
    protected double buyingPrice;

    /**
     * 售价
     */
    protected double sellingPrice;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public Animal(String name, int age, Gender gender, double buyingPrice, double sellingPrice) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public abstract String toString();
}
