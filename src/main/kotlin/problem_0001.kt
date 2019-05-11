package euler

class MultipleOf(val limit: Int, val arguments: List<Int>) {

    fun isMod(arg1: Int, arg2: Int): Boolean {
        // is arg1 a multiple of arg2?

        if (arg1.rem(arg2) == 0) {
            return true
        }
        return false
    }

    fun getMultiplesOf(limit: Int, arguments: List<Int>): Map<Int, List<Int>> {
        // return list of multiples for arguments < limit int

        var i = 0
        var multipleList: Map<Int, List<Int>> = mapOf()

        while (i < limit) {
            arguments.forEach {
                if (isMod(i, it)) {
                    multipleList.plus(Pair(it, i))
                }
            }
            i++
        }

        return (multipleList)
    }
}


fun main(args: Array<String>) {
/*
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    Find the sum of all the multiples of 3 or 5 below 1000.
 */
    print(args.size)

    val limit = 10
    val input = arrayListOf(3, 5)
    val output = MultipleOf(limit, input).getMultiplesOf(limit, input)

    output.forEach {
        print(it.toString())
    }
}