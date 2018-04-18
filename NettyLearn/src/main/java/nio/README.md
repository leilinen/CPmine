
# nio 学习代码

nio是一种比传统io速度更快的io。

传统的io是以**流**的形式将数据进行传输，在nio中，数据**面向块**进行传输，每一个操作都在产生或者消费数据块。

nio具有以下几种属性：

* 通道和缓冲区 (Channels and Buffers)

nio 中所有的操作都是在channels和buffers中进行的。数据从channels中读取到buffers中，并将buffers中的数据写入到channels中。

* 非阻塞IO (No-blocking IO)

当线程将channel中的数据读取到buffer中时，线程可以进行其他事情。

* 选择器 (Selectors)

选择器用于监听多个通道的事件，单个线程可以监听多个数据通道。

# nio 原理

<img src="https://github.com/leilinen/CPmine/tree/master/NettyLearn/src/main/java/nio/file/nio.JPG" alt="nio data transport">



# 参考

[NIO入门](https://www.ibm.com/developerworks/cn/education/java/j-nio/j-nio.html)
[Java NIO 系列教程](http://ifeve.com/java-nio-all/)


