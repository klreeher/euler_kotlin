package euler

class MultipleOf(val limit: Int, val arguments: List<Int>) {

    fun isMod(arg1: Int, arg2: Int): Map<Int, Int> {
        // is arg1 a multiple of arg2?

        if (arg1.rem(arg2) == 0) {
            print("\n$arg1 is a multiple of $arg2!")
            val modOf: Map<Int, Int> = mapOf(Pair(arg2, arg1))
            return modOf
        }
        return emptyMap<Int, Int>()
    }

    //TODO: this shouldn't use ridiculously nested maps -- declare some classes
    fun getMultiplesOf(limit: Int, arguments: List<Int>): Int {
        // return list of multiples for arguments < limit int

        var i = 1
        var sum: Int = 0

        while (i < limit) {
            arguments.forEach {
                var members: List<Int> = emptyList()
                val result = isMod(i, it)
                if (result.isNotEmpty()) {
                    sum += i
                }

            }
            i++
        }
        return sum
    }
}

fun main(args: Array<String>) {
    /*
        If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
        Find the sum of all the multiples of 3 or 5 below 1000.
     */
    val limit = 1000
    val input = arrayListOf(3, 5)
    val output = MultipleOf(limit, input).getMultiplesOf(limit, input)

    print("\nTOTAL SUM OF MULTIPLES OF $input UNDER $limit: $output")
}