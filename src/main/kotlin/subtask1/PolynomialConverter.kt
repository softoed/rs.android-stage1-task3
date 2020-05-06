package subtask1

class PolynomialConverter {

    // TODO: Complete the following function
    fun convertToStringFrom(numbers: Array<Int>): String? {
        if (numbers.count() == 0) return null
        var res : String? = ""
        for (i in 0 until numbers.count())
        {
            var item = numbers[i]
            if (item == 0) continue
            val sItem : String
            var dop = ""
            if (i != 0) {
                if (item < 0) {
                    dop = " - "
                    item += -2 * item
                }
                else dop = " + "
            }
            sItem = if (item == 1 || item == -1) dop
            else dop + item.toString()
            res += when (i) {
                numbers.count() - 1 -> sItem
                numbers.count() - 2 -> sItem + 'x'
                else -> {
                    sItem + "x^" + (numbers.count() - i - 1).toString()
                }
            }
        }

        return res
    }
}
