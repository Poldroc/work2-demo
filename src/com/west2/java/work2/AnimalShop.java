package com.west2.java.work2;


/**
 * 动物商店接口
 *
 * @author Poldroc
 * @date 2023/10/25
 */
interface AnimalShop {

    /**
     * 买入新动物
     *
     * @param animal 动物
     * @throws InsufficientBalanceException 余额不足异常
     */
    void buyAnimal(Animal animal) throws InsufficientBalanceException;

    /**
     * 招待客户
     *
     * @param customer 客户
     * @param animal   动物
     * @throws AnimalNotFoundException 动物未找到异常
     * @throws IllegalStateException  动物商店未开业异常
     */
    void greetCustomer(Customer customer, Animal animal) throws AnimalNotFoundException, IllegalStateException;

    /**
     * 歇业
     */
    void close();

    /**
     * 开业
     */
    void open();
}
