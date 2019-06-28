### spring的基本学习
- 基于maven，旨在深入了解spring的原理
---
#### Autowired注解
- 注解List，Set，Map：在注解一个List，Set类型的接口集，会注入他们的实现类，当注解Map时键就是该实现类的对象名（默认的对象是类名第一个字母变成小写，当时xml配置bean时就是id）
    - 举例：
    ```
    # PeopleDao是接口
    @Autowired
    List<PeopleDao> peopleDaoList;
    Set<PeopleDao> peopleDaoSet;
    # Map的键一定是String类型，并且其值就是对象名
    Map<String, PeopleDao> peopleDaoMap;
    ```
    - 当注入的数组(List)希望有序：使用@Order(num) num小在前面
- @Autowired注解是使用的类型注解(如果有多个，都会注入进来)，可以配合@Quilifier来实现指定具体的bean(按照name来注入)
