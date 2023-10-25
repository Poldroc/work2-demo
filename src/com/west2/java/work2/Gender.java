package com.west2.java.work2;

/**
 * 定义动物性别枚举
 * 当为MALE时，输出“雄性”
 * 当为FEMALE时，输出“雌性”
 * @author Poldroc
 * @date 2023/10/25
 */
enum Gender {

    /**
     * 雄性
     */
    MALE("雄性"),

    /**
     * 雌性
     */
    FEMALE("雌性");

    /**
     * 性别名称
     */
    private final String description;

    /**
     * 构造方法
     * @param description
     */
    Gender(String description) {
        this.description = description;
    }

    /**
     * 重写toString方法
     * @return 性别名称
     */
    @Override
    public String toString() {
        return description;
    }
}
