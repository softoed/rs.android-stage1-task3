package subtask4

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        val square = number * number
        var res = square
        val resArrayList = arrayListOf<Int>()

        for (i in number - 1 downTo 1) {
            if (res - (i * i) >= 0) {
                res -= i * i
                resArrayList.add(i)
            }
        }
        resArrayList.sort()
        if (res == 0) return resArrayList.toTypedArray()

        return null
    }
}
