package com.west2.java.work2;

import java.time.LocalDate;

/**
 * 顾客类
 *
 * @author Poldroc
 * @date 2023/10/25
 */
class Customer {

    /**
     * 姓名
     */
    private String name;

    /**
     * 到店次数
     */
    private int visitCount;

    /**
     * 最新到店时间
     */
    private LocalDate lastVisitDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    public LocalDate getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(LocalDate lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public Customer(String name, int visitCount, LocalDate lastVisitDate) {
        this.name = name;
        this.visitCount = visitCount;
        this.lastVisitDate = lastVisitDate;
    }

    public Customer(String name) {
        this.name = name;
        this.visitCount = 0;
        this.lastVisitDate = null;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", visitCount=" + visitCount +
                ", lastVisitDate=" + lastVisitDate +
                '}';
    }


}
