fun main() {
    println(agoToText(100000))
}

fun agoToText(time: Int) = when (time < 60) {
    true -> " был(а) только что"
    else -> timeMinutes(time)
}


fun timeMinutes(seconds: Int) = when (seconds / 60) {
    1, 21, 31, 41, 51 -> "был(а) " + seconds / 60 + " минуту назад"
    2, 22, 32, 42, 52 -> "был(а) " + seconds / 60 + " минуты назад"
    3, 4, 23, 24, 33, 34, 43, 44, 53, 54 -> "был(а) " + seconds / 60 + " минуты назад"
    5, 6, 7, 8, 9, 15, 16, 17, 18, 19, 20,
    25, 26, 27, 28, 29, 30, 35, 36, 37,
    38, 39, 40, 45, 46, 47, 48, 49, 50,
    55, 56, 57, 58, 59 -> "был(а) " + seconds / 60 + " минут назад"
    else -> timeHours(seconds / 60 / 60)
}

fun timeHours(minuts: Int) = when (minuts) {
    1, 21 -> "был(а) " + minuts + " час назад"
    5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 -> "был(а) " + minuts + " часов назад"
    22, 23 -> "был(а) " + minuts + " часа назад"
    else -> timeDay(minuts)
}

fun timeDay(hours: Int) = when (hours / 24) {
    1 -> "был(а) вчера"
    2 -> "был(а) позавчера"
    else -> "был(а) давно"


}