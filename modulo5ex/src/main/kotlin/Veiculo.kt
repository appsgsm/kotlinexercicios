class Veiculo {
    var velocity: Long
    var acceleration: Long
    var model: String

    init{
        this.velocity = 0
        this.acceleration = 10
        this.model = ""
    }

    fun acelerar(velocity: Long): Long {
        this.velocity = velocity + acceleration
        return this.velocity
    }
    fun desacelerar(velocity: Long): Long {
        this.velocity = velocity - acceleration
        if (this.velocity < 0)
           this.velocity = 0
        return this.velocity
    }

    fun print(){
        println("velocidade: $velocity")
    }
}