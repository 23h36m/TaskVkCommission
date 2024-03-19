package ru.netology
import java.util.Scanner

fun main() {
    val minCommission = 35
    val commissionPercentage = 0.0075

    val scanner = Scanner(System.`in`)
    println("Введите сумму перевода ")
    val amount = scanner.nextInt()

    val commission = if (amount*commissionPercentage > minCommission)
       amount*commissionPercentage else minCommission
    println("Сумма комиссии = $commission рублей")
}
