package nextstep

object next_step {

    def main(args: Array[String]): Unit ={
        val big = new java.math.BigInteger("12345")
        val greetStrings = new Array[String](3)
        greetStrings(0) = "hello"
        greetStrings(1) = ", "
        greetStrings(2) = "world!\n"

        for (i <- 0 to 2){
            print(greetStrings(i))
        }

// List
        val numNames = Array("zero", "one", "two")

        val numNames2 = Array.apply("zero", "one", "two")

       // val oneTwoThree = List(1, 2, 3)

        val oneTwo = List(1, 2)
        val threeFour = List(3, 4)
        // ::: for list concatenation
        val oneTwoThreeFour = oneTwo ::: threeFour
        println(oneTwo + "and " + threeFour + "were not mutated.")
        println("Thus, " + oneTwoThreeFour)

        //  :: cons prepends a new element to the beginning of an existing list, and returns the resulting list
        //  val twoThree = List(2, 3)
        //  val oneTwoThree = 1::twoThree
        //  println(oneTwoThree)

        val oneTwoThree = 1::2::3::Nil // Nil means a empty list
        println(oneTwoThree)

// Tuples

        val pair = (99, "Luftballons")
        println(pair._1)
        println(pair._2)
        // println(pair(1)) // error
        // println(pair(2)) // error

// Set

        // immutable model is default

        var jetSet = Set("Boeing", "Airbus")
        jetSet = jetSet +  "Lear"
        println(jetSet.contains("Cessna"))

        // mutable set
        import scala.collection.mutable.Set

        val movieSet = Set("Hitch", "Poltergeist")
        movieSet += "Shrek"
        println(movieSet)

        import scala.collection.mutable.Map
        val treasureMap = Map[Int, String]()
        treasureMap += (1 -> "Go to island")
        treasureMap += (2 -> "Find big X on ground")
        treasureMap += (3 -> "Dig.")
        println(treasureMap(2))

// Read lines from a file
        import scala.io.Source
        if(args.length > 0){
            for( line <- Source.fromFile(args(0)).getLines()){
                println(line.length + " " + line)
            }
        }else{
            Console.err.println("Please enter filename")
        }

        val lines = Source.fromFile(args(0)).getLines().toList

        def widthOfLength(s: String) = s.length.toString.length
        var maxWidth = 0
        for(line <- lines){
            maxWidth = maxWidth.max(widthOfLength(line))
        }
    }
}
