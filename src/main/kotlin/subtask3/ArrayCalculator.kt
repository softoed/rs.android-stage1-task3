package subtask3

class ArrayCalculator {

    // TODO: Complete the following function
    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        var res = 1
        val workingRes = arrayListOf<Int>()
        for (item in itemsFromArray) {
            if ((item is Int) && (item != 0)) {
                workingRes.add(item)
                
            }
        }

        if (workingRes.count() == 0) return 0

        workingRes.sort()
        
        if (numberOfItems >= workingRes.count()) {
            for (item in workingRes) res *= item
            return res
        }
        else {
            var i = numberOfItems
            while (i > 0) {
                if (i > 1) {
                    i -= 2
                    if (workingRes[0] * workingRes[1] > workingRes[workingRes.count() - 2] * workingRes[workingRes.count() - 1]) {
                        res *= workingRes[0] * workingRes[1]
                        workingRes.removeAt(0)
                        workingRes.removeAt(0)
                    }
                    else {
                        res *= workingRes[workingRes.count() - 2] * workingRes[workingRes.count() - 1]
                        workingRes.removeAt(workingRes.count() - 1)
                        workingRes.removeAt(workingRes.count() - 1)
                    }
                }
                else {
                    res *= workingRes[workingRes.count() - 1]
                    i -= 1
                }
            }
            return res
        }
    }
}
