package com.west2.java.work2;

/**
 * 猫类
 *
 * @author Poldroc
 * @date 2023/10/25
 */
class Cat extends Animal {

    private static final double DEFAULT_BUYING_PRICE = 100;

    private static final double DEFAULT_SELLING_PRICE = 200;

    public Cat(String name, int age, Gender gender) {
        super(name, age, gender, DEFAULT_BUYING_PRICE, DEFAULT_SELLING_PRICE);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", buyingPrice=" + buyingPrice +
                ", sellingPrice=" + sellingPrice +
                '}';
    }
}