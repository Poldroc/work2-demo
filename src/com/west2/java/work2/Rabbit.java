package com.west2.java.work2;

/**
 * 兔子类
 *
 * @author Poldroc
 * @date 2023/10/25
 */
public class Rabbit extends Animal {
    private static final double DEFAULT_BUYING_PRICE = 1500;

    private static final double DEFAULT_SELLING_PRICE = 3000;

    public Rabbit(String name, int age, Gender gender) {
        super(name, age, gender, DEFAULT_BUYING_PRICE, DEFAULT_SELLING_PRICE);
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", buyingPrice=" + buyingPrice +
                ", sellingPrice=" + sellingPrice +
                '}';
    }
}
