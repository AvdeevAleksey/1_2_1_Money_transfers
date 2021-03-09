import javax.sound.midi.MetaMessage

const val minAmount: Int = 3500
fun main() {
    print("Введите сумму перевода в копейках: ")
    val amount:Int = readLine()!!.toInt()
    printMyAmountСommission(amount)
}

fun printMyAmountСommission(amount:Int) {
    val amountRub:Int = Math.floor((amount/100).toDouble()).toInt()
    val amountKop:Int = amount-amountRub*100
    val commission:Double = (amount*0.0075).toDouble()
    if (commission<=minAmount) {
        println("""Сумма перевода: $amountRub руб. $amountKop коп.
      Комиссия: ${Math.floor((minAmount/100).toDouble()).toInt()} руб.
        """.trimMargin())
    } else {
//  Комиссия жадного банкира >:)) с суммы 4666 руб 67 коп комиссия больше >:))
        println("""Сумма перевода: $amountRub руб. $amountKop коп.
      Комиссия: ${Math.floor((commission/100)).toInt()} руб. ${commission-Math.floor((commission/100)).toInt()*100} коп.
        """.trimMargin())
    }
}
