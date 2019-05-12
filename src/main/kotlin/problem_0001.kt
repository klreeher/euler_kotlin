    package euler



    fun main(args: Array<String>) {
        /*
            If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
            Find the sum of all the multiples of 3 or 5 below 1000.
         */
        val limit = 1000
        var result: Int = 0
        
        fun Int.multipleOf(n: Int):Boolean{
            return (this % (n).toLong() == 0.toLong())
        } 
        
        var output = (1..limit-1).asSequence().filter{n -> n.multipleOf(3)|| n.multipleOf(5)}.toList()
        print("$output\n")
        result+=output.sum()

    print("the total sum of multiples of 3 *or* 5 under $limit is $result. \n")
    
    }
    
    

        