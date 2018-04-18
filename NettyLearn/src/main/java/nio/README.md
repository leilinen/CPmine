
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

数据从channel中传输到buffer中，再由buffer传输到channel中。

## 缓冲区类型

ByteBuffer, CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer, DoubleBuffer

Buffer中有三个属性：

* capacity

表示buffer的容量，相当于数组的大小。

* position

当数据读取或写入buffer中时，position表示当前的位置。初始化position=0，每当对buffer进行操作后，position自动+1，最大值为 capacity - 1

* limit

在写模式下，Buffer的limit表示最多能往Buffer里写多少数据。 写模式下，limit等于Buffer的capacity。

当切换Buffer到读模式时， limit表示你最多能读到多少数据。

## 通道类型

FileChannel, DatagramChannel, SocketChannel, ServerSocketChannel

## 数据输出步骤

首先要获取通道，接下来创建缓冲区，最后将通道中的内容写入到缓冲区中。

## Selector


# 参考

[NIO入门](https://www.ibm.com/developerworks/cn/education/java/j-nio/j-nio.html)
[Java NIO 系列教程](http://ifeve.com/java-nio-all/)


