fun main(args: Array<String>) {
    val computerDellBuilder = ComputerDellBuilder()
    val computerDirector = ComputerDirector()
    computerDirector.construct(computerDellBuilder)
    val gamingComputer = computerDellBuilder.getResult()
    gamingComputer.displayInfo()
}
data class ComputerDell(
    var cpu: String = "",
    var ram: String = "",
    var storage: String = ""
) {
    fun displayInfo() {
        println("ComputerDell:" +
                "\nCPU: $cpu" +
                "\nRAM: $ram" +
                "\nStorage: $storage\n")
    }
}
interface Builder {
    fun buildCPU()
    fun buildRAM()
    fun buildStorage()
    fun getResult(): ComputerDell
}

class ComputerDellBuilder : Builder {
    private val computer = ComputerDell()

    override fun buildCPU() {
        computer.cpu = "Dell CPU"
    }

    override fun buildRAM() {
        computer.ram = "16GB DDR4"
    }

    override fun buildStorage() {
        computer.storage = "1TB SSD"
    }

    override fun getResult(): ComputerDell {
        return computer
    }
}
class ComputerDirector {
    fun construct(builder: Builder) {
        builder.buildCPU()
        builder.buildRAM()
        builder.buildStorage()
    }
}
