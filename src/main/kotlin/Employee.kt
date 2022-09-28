class Employee constructor(var name: String,
                           var position: PositionTitle,
                           var salary: Boolean,
                           var payRate: Double,
                           var shift: Int) {

    fun display(){
        println("------------------" +
                "\n$name" +
                "\n$position" +
                "\nIs Salary: $salary" +
                "\nShift: $shift" +
                "\nRate of pay is: $$payRate per hour")
    }

    fun calculate(hoursIn: Double){
        var pay: Double = 0.0
        if (!salary && hoursIn > 40){
           var overTime = hoursIn-40
            when(shift){
                2 -> pay = ((payRate*40)+((payRate*overTime)*1.5)+((.05*(payRate*40))+((payRate*overTime)*1.5)))
                3 -> pay = ((payRate*40)+((payRate*overTime)*1.5)+((.10*(payRate*40))+((payRate*overTime)*1.5)))
                else -> pay = ((payRate*hoursIn) + ((payRate*overTime)*1.5))
            }
        }
        else{
            when(shift){
                2 -> pay = (payRate*hoursIn)+(.05*(payRate*hoursIn))
                3 -> pay = (payRate*hoursIn)+(.1*(payRate*hoursIn))
                else -> pay = payRate*hoursIn
            }
        }

        println("$name earned $pay this week")

    }

}