fun main() {
    val student = BuilderStudent()
        .setName("Nguyen Van A")
        .setAge(24)
        .setClassLevel("12A")
        .build()

    println(student)


    val concreteBuilders1 = ConcreteBuilders1()
    val director = Director()
    director.Director(concreteBuilders1)
    val products1 = concreteBuilders1.buildResult()

}

class ConcreteBuilders1() {
    fun buildResult() {
    }
}

class Director() {
    fun Director(builder: ConcreteBuilders1) {

    }
}

data class Student(
    val name: String?,
    val age: Int?,
    val classLevel: String?
)

class BuilderStudent {
    private var name: String? = null
    private var age: Int? = null
    private var classLevel: String? = null

    fun setName(name: String?) = apply { this.name = name }
    fun setAge(age: Int?) = apply { this.age = age }
    fun setClassLevel(classLevel: String?) = apply { this.classLevel = classLevel }

    fun build(): Student {
        return Student(name, age, classLevel)
    }
}