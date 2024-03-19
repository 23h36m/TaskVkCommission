package ru.netology
import java.util.Scanner

fun main() {
    val minCommission = 35
    val commissionPercentage = 0.0075

    val scanner = Scanner(System.`in`)
    println("Введите систему перевода (Карта или VK Pay)")
    val system = scanner.nextLine()
    println("Введите сумму перевода ")
    val amount = Integer.parseInt(scanner.nextLine())

    if (system == "Карта") {
        val commission = if (amount * commissionPercentage > minCommission)
            amount * commissionPercentage else minCommission
        println("Сумма комиссии = $commission рублей")
    } else {
        println("Сумма комиссии = 0 рублей")
    }
}
