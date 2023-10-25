package com.west2.java.work2;

/**
 * 中国田园犬类
 *
 * @author Poldroc
 * @date 2023/10/25
 */
public class ChineseRuralDog extends Animal {

    /**
     * 是否注射疫苗
     */
    private boolean isVaccineInjected;

    private static final double DEFAULT_BUYING_PRICE = 40;

    private static final double DEFAULT_SELLING_PRICE = 100;


    public boolean isVaccineInjected() {
        return isVaccineInjected;
    }

    public void setVaccineInjected(boolean vaccineInjected) {
        isVaccineInjected = vaccineInjected;
    }

    public ChineseRuralDog(String name, int age, Gender gender, boolean isVaccineInjected) {
        super(name, age, gender, DEFAULT_BUYING_PRICE, DEFAULT_SELLING_PRICE);
        this.isVaccineInjected = isVaccineInjected;
    }

    @Override
    public String toString() {
        return "ChineseRuralDog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", isVaccineInjected=" + isVaccineInjected +
                ", buyingPrice=" + buyingPrice +
                ", sellingPrice=" + sellingPrice +
                '}';
    }
}
