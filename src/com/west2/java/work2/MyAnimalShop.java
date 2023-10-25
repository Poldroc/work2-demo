package com.west2.java.work2;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 动物商店类
 *
 * @author Poldroc
 * @date 2023/10/25
 */
public class MyAnimalShop implements AnimalShop {

    /**
     * 余额
     */
    private double balance;

    /**
     * 利润
     */
    private double profit;

    /**
     * 动物列表
     */
    private List<Animal> animalList;

    /**
     * 顾客列表
     */
    private List<Customer> customerList;

    /**
     * 是否营业
     */
    private boolean isOpen;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public MyAnimalShop(double balance) {
        this.balance = balance;
        this.profit = 0;
        this.animalList = new ArrayList<>();
        this.customerList = new ArrayList<>();
        this.isOpen = true;
    }

    /**
     * 买入新动物
     *
     * @param animal 动物
     * @throws InsufficientBalanceException 余额不足异常
     */
    @Override
    public void buyAnimal(Animal animal) throws InsufficientBalanceException {
        if (this.balance < animal.getBuyingPrice()) {
            throw new InsufficientBalanceException(
                    "余额不足, 无法购买动物; 当前余额: " + this.balance + ", 动物价格: " + animal.getBuyingPrice()
            );
        }
        // 余额足够, 扣除余额
        this.balance -= animal.getBuyingPrice();
        // 添加动物
        this.animalList.add(animal);
        System.out.println("【商店购买了】 " + animal);
        System.out.println("【当前余额】  " + this.balance);
    }

    /**
     * 招待客户
     *
     * @param customer 客户
     * @throws AnimalNotFoundException 动物未找到异常
     * @throws IllegalStateException   动物商店未开业异常
     */
    @Override
    public void greetCustomer(Customer customer, Animal animal) throws AnimalNotFoundException, IllegalStateException {
        handleClosedShop();
        checkAnimalListNotEmpty();
        checkAnimalInList(animal);
        updateCustomerAndProfit(customer, animal);
    }

    /**
     * 歇业
     */
    @Override
    public void close() {
        this.isOpen = false;
        // 打印利润
        System.out.println("【商店已歇业】 利润为: " + this.profit);
        profit = 0;
    }

    /**
     * 开业
     */
    @Override
    public void open() {
        this.isOpen = true;
        System.out.println(" ============ 商店已开业 ============ ");
        System.out.println("【当前余额:】 " + this.balance);
        System.out.println("【当前动物列表:】 " + this.animalList);
        System.out.println("【当前顾客列表:】 " + this.customerList);

    }

    /**
     * 处理商店已歇业的情况
     */
    private void handleClosedShop() throws IllegalStateException {
        if (!this.isOpen) {
            System.out.println("商店已歇业, 无法招待客户");
            throw new IllegalStateException("商店已歇业");
        }
    }

    /**
     * 检查动物列表是否为空
     *
     * @throws AnimalNotFoundException 动物未找到异常
     */
    private void checkAnimalListNotEmpty() throws AnimalNotFoundException {
        if (animalList.isEmpty()) {
            throw new AnimalNotFoundException("动物列表为空, 无法招待客户");
        }
    }

    /**
     * 检查动物是否在列表中
     *
     * @param animal 要检查的动物
     * @throws AnimalNotFoundException 动物未找到异常
     */
    private void checkAnimalInList(Animal animal) throws AnimalNotFoundException {
        if (!animalList.contains(animal)) {
            throw new AnimalNotFoundException("动物列表中没有名为【 " + animal.getName() + " 】的动物, 无法招待客户");
        }
        // 如果未打疫苗, 则打疫苗
        if (animal instanceof ChineseRuralDog) {
            ChineseRuralDog dog = (ChineseRuralDog) animal;
            if (!dog.isVaccineInjected()) {
                dog.setVaccineInjected(true);
                System.out.println("为" + dog.getName() + "打了疫苗");
            }
        }
    }

    /**
     * 更新顾客信息和利润
     *
     * @param customer 顾客
     * @param animal   动物
     */
    private void updateCustomerAndProfit(Customer customer, Animal animal) {
        if (!customerList.contains(customer)) {
            customerList.add(customer);
        }
        this.profit += animal.getSellingPrice() - animal.getBuyingPrice();
        this.balance += animal.getSellingPrice();
        this.animalList.remove(animal);
        // 更新顾客信息
        customer.setVisitCount(customer.getVisitCount() + 1);
        customer.setLastVisitDate(LocalDate.now());

        System.out.println("【招待客户】  [客户]: " + customer + " ====> [购买了]: " + animal);
    }
}
