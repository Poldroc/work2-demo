# work2-demo
> 个人能力有限，有发现错误的欢迎提出pr/issue

## 任务

**【强制】注意编程规范**
   [阿里巴巴开发规范](../etc/blog/阿里巴巴Java开发手册.pdf)
  
> 用代码来写一个自己的宠物店，题目有点长耐心看~
> 完成下面的类
>
> **开一家宠物店，宠物店要有动物还要有顾客**

**1. 一个Animal动物类 (抽象类 abstract )**

* 变量:
  * 动物名(String)
  * 年龄(int)
  * 性别
  * 价格(double)
  * ....
* 方法
  * 一个全参构造方法
  * 一个抽象的toString() 方法
  * ........

**2. 中华田园犬类** (extends Animal)<img src="https://gitee.com/sky-dog/note/raw/master/img/202210252201019.jpg" alt="img" style="zoom:3%;" />

* 变量: isVaccineInjected() (boolean 是否注射狂犬病疫苗)
* 价格100元

**3. 猫猫类 (extends Animal)**<img src="https://gitee.com/sky-dog/note/raw/master/img/202210252202619.png" alt="image-20221025220229577" style="zoom:15%;" />

* 价格200元

**4. 你喜欢的其他动物.....**<img src="https://gitee.com/sky-dog/note/raw/master/img/202210252202563.png" alt="image-20221025220257537" style="zoom:50%;" />

* 自由选择 合理就行

**5. 顾客类Customer**

* 成员变量: 
  * 顾客名字(String)
  * 到店次数(int)
  * 最新到店时间(LocalDate类)
* 方法
  * 重写(@Override) toString() 方法, 要求按一定格式输出客户的所有信息

**6. 宠物店接口AnimalShop(interface)**

你的宠物店需要有一些基础功能:

* 买入新动物(需要的参数自己决定)
* 招待客户(Customer)
* 歇业()

**7. MyAnimalShop自己的宠物店 (implements AnimalShop)**

* 变量:

  * 店的余额double
  * 一个存放动物的列表 (使用ArrayList、LinkedList或其他你喜欢的List实现)
  * 一个顾客列表留作纪念
  * 是否正在营业
  * ....

* 实现接口中的方法

  * 买入动物 -> 买入一只动物，记得在动物列表中添加，

    如余额不足则抛出异常InsufficientBalanceException

  * 招待客户 -> 接受客户参数，在顾客列表中加入新顾客，

    出售动物，如果店内没有动物，抛出AnimalNotFoundException。

    通过toString输出动物信息，并把钱入账，将动物移除列表

  * 歇业 -> (LocalDate判断) 输出当天光顾的客户的列表信息，计算并输出一天的利润

**8. 自定义异常类**

* 异常类 (AnimalNotFountException) 没找到动物异常，店内没有动物可买时抛出
* 异常类 (InsufficientBalanceException) 余额不足异常时抛出
* 两个异常类均继承自RunTimeException, 异常中需要携带错误信息，方便捕获后处理和查看

**9. 一个Test类, 用于测试你写的类功能是否正常**

* 创建一个宠物店实例，给定余额，初始化动物列表，一个空的顾客列表
* 测试买入动物，招待顾客，歇业
* 建议多拿点例子测试，发现bug可以马上改，多考虑代码严谨性

