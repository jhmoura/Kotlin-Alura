fun main(){
    println ("Bem Vindo ao Bytebank")
    val titular = "Julio"
    val numeroConta = 1000
    var saldo = 0.0
    // saldo = 100 + 2.0
    // saldo+= 200
    saldo -= 10000
    println("Titular: $titular")
    println("Número da conta: $numeroConta")
    println("Saldo da conta: $saldo")

    //Usando If
    // if (saldo > 0.0){
    //     println("Conta Positiva")
    // }else if (saldo == 0.0){
    //     println("Conta neutra")
    // }else{
    //     println("Conta negativa")
    // }

    //Usando When
    when{
        saldo > 0.0 -> println("Conta Positivo")
        saldo == 0.0 -> println("Conta neutra")
        else -> println("Conta neutra")
    }
}