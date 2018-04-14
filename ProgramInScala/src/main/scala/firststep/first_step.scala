
// basic syntax of scala
object first_step {

    def main(args: Array[String]): Unit ={
        val msg = "hello, world!"

        val msg2: java.lang.String = "Hello again, world!"

        val msg3: String = "Hello yet again, world!"

        println(msg)
        println(msg2)
        println(msg3)

        println(max(3, 5))

        greet()

        var i = 0
        while(i < args.length){
            println(args(i))
            i += 1
        }

        val arg={"Concise is nice"}
        val a = arg.split(" ")

        a.foreach( arg => println( arg))

    }


    // msg = "Goodbye cruel world!"

    def max(x: Int, y: Int): Int = {
        if (x > y) x
        else y
    }

    def max2(x: Int, y: Int) = if (x > y) x else y



    def greet() = println("welcome")



}