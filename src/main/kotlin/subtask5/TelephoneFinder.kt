package subtask5

import sun.security.util.Length
import kotlin.reflect.KClass

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val resArray = ArrayList<String>()
        for (i in number.indices) {
            when (number[i]) {
                '1' -> {
                    resArray.add(number.substring(0, i) + "2" + number.substring(i + 1, number.length))
                    resArray.add(number.substring(0, i) + "4" + number.substring(i + 1, number.length))
                }
                '2' -> {
                    resArray.add(number.substring(0, i) + "1" + number.substring(i + 1, number.length))
                    resArray.add(number.substring(0, i) + "3" + number.substring(i + 1, number.length))
                    resArray.add(number.substring(0, i) + "5" + number.substring(i + 1, number.length))
                }
                '3' -> {
                    resArray.add(number.substring(0, i) + "2" + number.substring(i + 1, number.length))
                    resArray.add(number.substring(0, i) + "6" + number.substring(i + 1, number.length))
                }
                '4' -> {
                    resArray.add(number.substring(0, i) + "1" + number.substring(i + 1, number.length))
                    resArray.add(number.substring(0, i) + "5" + number.substring(i + 1, number.length))
                    resArray.add(number.substring(0, i) + "7" + number.substring(i + 1, number.length))
                }
                '5' -> {
                    resArray.add(number.substring(0, i) + "2" + number.substring(i + 1, number.length))
                    resArray.add(number.substring(0, i) + "4" + number.substring(i + 1, number.length))
                    resArray.add(number.substring(0, i) + "6" + number.substring(i + 1, number.length))
                    resArray.add(number.substring(0, i) + "8" + number.substring(i + 1, number.length))
                }
                '6' -> {
                    resArray.add(number.substring(0, i) + "3" + number.substring(i + 1, number.length))
                    resArray.add(number.substring(0, i) + "5" + number.substring(i + 1, number.length))
                    resArray.add(number.substring(0, i) + "9" + number.substring(i + 1, number.length))
                }
                '7' -> {
                    resArray.add(number.substring(0, i) + "4" + number.substring(i + 1, number.length))
                    resArray.add(number.substring(0, i) + "8" + number.substring(i + 1, number.length))
                }
                '8' -> {
                    resArray.add(number.substring(0, i) + "5" + number.substring(i + 1, number.length))
                    resArray.add(number.substring(0, i) + "7" + number.substring(i + 1, number.length))
                    resArray.add(number.substring(0, i) + "9" + number.substring(i + 1, number.length))
                    resArray.add(number.substring(0, i) + "0" + number.substring(i + 1, number.length))
                }
                '9' -> {
                    resArray.add(number.substring(0, i) + "6" + number.substring(i + 1, number.length))
                    resArray.add(number.substring(0, i) + "8" + number.substring(i + 1, number.length))
                }
                '0' -> {
                    resArray.add(number.substring(0, i) + "8" + number.substring(i + 1, number.length))
                }
                else -> return null
            }
        }
        val res = resArray.toTypedArray()

        return res
    }
}
