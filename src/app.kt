fun main(){
    println("Esto es una app")

var ratonA=Raton()
 println(ratonA.tipo)

var ratonB=Raton("pcout")
    println(ratonB.tipo)

ratonA.tipo="bluetooth"
    println(ratonA.tipo)

    var miComputadora= Computer(Cpu(5,4), Mouse(),Monitor())
    println(miComputadora.cpu)
    println("${miComputadora.cpu} tiene un raton ${miComputadora.raton.tipo}")
    println(miComputadora.toString())

var ratonSorpresa=Mouse("Ay")
println(ratonSorpresa.tipo)

}