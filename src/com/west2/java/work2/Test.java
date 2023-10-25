package com.west2.java.work2;

import java.time.LocalDate;

/**
 * 动物商店测试类
 *
 * @author Poldroc
 * @date 2023/10/25
 */
public class Test {
    public static void main(String[] args) {

        // 创建一个宠物店实例
        MyAnimalShop shop = new MyAnimalShop(5000.0);

        // 创建一些动物实例
        ChineseRuralDog dog1 = new ChineseRuralDog("旺财", 2, Gender.MALE, true);
        ChineseRuralDog dog2 = new ChineseRuralDog("富贵", 3, Gender.MALE, false);
        ChineseRuralDog dog3 = new ChineseRuralDog("卡芙卡的狗", 1, Gender.MALE, true);
        ChineseRuralDog dog4 = new ChineseRuralDog("不知道叫什么的狗", 1, Gender.MALE, true);

        Cat cat1 = new Cat("会抓老鼠的猫", 3, Gender.FEMALE);
        Cat cat2 = new Cat("帕帕", 2, Gender.FEMALE);

        Rabbit rabbit1 = new Rabbit("west2", 1, Gender.FEMALE);


        // 测试买入动物
        try {
            shop.buyAnimal(dog1);
            shop.buyAnimal(dog2);
            shop.buyAnimal(dog3);
            shop.buyAnimal(cat1);
            shop.buyAnimal(cat2);
            shop.buyAnimal(rabbit1);
        } catch (InsufficientBalanceException ex) {
            System.out.println(ex.getMessage());
        }

        shop.setBalance(10.0);

        // 测试余额不足
        try {
            shop.buyAnimal(dog4);
        } catch (InsufficientBalanceException ex) {
            System.out.println(ex.getMessage());
        }


        // 测试招待客户
        Customer customer1 = new Customer("张三");
        Customer customer2 = new Customer("李四", 1, LocalDate.of(2023, 10, 24));
        Customer customer3 = new Customer("王五");
        Customer customer4 = new Customer("赵六");


        // 测试营业
        try {
            shop.greetCustomer(customer1, dog1);
            shop.greetCustomer(customer1, dog2);
            shop.greetCustomer(customer2, cat1);
            shop.greetCustomer(customer2, cat2);
            shop.greetCustomer(customer3, rabbit1);
            shop.greetCustomer(customer4, dog1);
            shop.greetCustomer(customer4, dog3);
        } catch (AnimalNotFoundException ex) {
            System.out.println(ex.getMessage());
        }


        // 测试关店
        shop.close();
        try {
            shop.greetCustomer(customer4, dog3);
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }

        // 测试营业
        shop.open();
        try {
            shop.buyAnimal(dog4);
            shop.greetCustomer(customer1, dog4);
            shop.greetCustomer(customer1, dog4);
        } catch (InsufficientBalanceException | AnimalNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        shop.close();


    }
}
