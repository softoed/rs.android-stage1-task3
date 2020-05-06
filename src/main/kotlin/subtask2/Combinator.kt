package subtask2

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        if (array.count() == 0)
            return null
        val posters = array[0].toLong()
        val items = array[1].toLong()

        fun fact(num: Long): Long {
            var res : Long = 1
            for (i in 1..num) {
                res *= i
            }

            return res
        }

        val factForItems = fact(items)

        for (i in 1..items) {
            if ((factForItems/(fact(i) * fact(items - i))) == posters) return i.toInt()
        }
        return null
    }
}
