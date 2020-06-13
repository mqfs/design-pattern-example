# 单例模式  
- 懒汉式（线程安全）：`SingleObjectWithLazyLoading`类，用`synchronized`保证`getInstance()`方法线程安全，用于当`getInstance()`方法的性能对程序不是瓶颈点。

- 饿汉式：`SingleObjectWithNonLazyLoading`类，在类加载时就初始化生成实例，线程安全，但是存在其他非调用`getInstance()`方法的方式导致类加载。

- 双检锁：`SingleObjectWithDoubleCheckedLoacking`类，在`getInstance()`方法中先判空再用`synchronized`进行加锁，然后再判空，线程安全，用于当`getInstance()`方法的性能程序是瓶颈点，用于实例域延迟加载。

- 登记式：`SingleObjectWithStaticInnerClass`类，用`SingleHolder`静态内部类实现延迟加载；首先只对父类类加载，当调用`getInstance()`方法时才对静态内部类类加载，线程安全，用于静态域延迟加载。