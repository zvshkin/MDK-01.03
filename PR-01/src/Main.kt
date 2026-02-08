fun main() {
    println("\nЗадание 1: Разность")
    while (true) {
        try {
            print("Введите число А: ")
            val a = readln().toDouble()
            print("Введите число B: ")
            val b = readln().toDouble()

            println("Результат: ${vichislitRaznost(a, b)}")
            break
        } catch (e: Exception) {
            println("Ошибка ввода! Используйте цифры.")
        }
    }

    println("\nЗадание 2: Налог")
    while (true) {
        try {
            print("Введите зарплату: ")
            val zarplata = readln().toDouble()
            if (zarplata < 0) {
                println("Ошибка: зарплата не может быть отрицательной.")
            } else {
                println("Налог (13%): ${poschitatNalog(zarplata)}")
                break
            }
        } catch (e: Exception) {
            println("Ошибка ввода!")
        }
    }

    println("\nЗадание 3: Возраст")
    while (true) {
        try {
            print("Введите год рождения: ")
            val god = readln().toInt()
            if (god > 2026 || god < 1900) {
                println("Ошибка: некорректный год.")
            } else {
                println("Возраст того, кто вдвое старше: ${poschitatVozrastX2(god)}")
                break
            }
        } catch (e: Exception) {
            println("Ошибка ввода!")
        }
    }

    println("\nЗадание 4: Этаж")
    while (true) {
        try {
            print("Всего этажей: ")
            val etazhey = readln().toInt()
            print("Квартир на этаже: ")
            val naEtazhe = readln().toInt()
            print("Номер квартиры: ")
            val nomerKv = readln().toInt()

            if (etazhey <= 0 || naEtazhe <= 0 || nomerKv <= 0) {
                println("Ошибка: введите числа больше нуля.")
            } else {
                println("Квартира на этаже: ${naytiEtazh(etazhey, naEtazhe, nomerKv)}")
                break
            }
        } catch (e: Exception) {
            println("Ошибка ввода!")
        }
    }
}

fun vichislitRaznost(a: Double, b: Double): Double {
    return a - b
}

fun poschitatNalog(summa: Double): Double {
    return summa * 0.13
}

fun poschitatVozrastX2(godRozhdeniya: Int): Int {
    val moyVozrast = 2026 - godRozhdeniya
    return moyVozrast * 2
}

fun naytiEtazh(vsegoEt: Int, kvNaEt: Int, nomer: Int): Int {
    val obshiyEtazh = (nomer - 1) / kvNaEt + 1
    var etazhVPodezde = obshiyEtazh % vsegoEt
    if (etazhVPodezde == 0) etazhVPodezde = vsegoEt
    return etazhVPodezde
}