package machine



   
    var water1 = 400
    var milk1 = 540
    var coffee = 120
    var cupsD = 9
    var cost = 550

    fun main() {

        do {
            print("Write action (buy, fill, take, remaining, exit): ")
            val action= readLine()!!

            if (action == "buy") {
                buy()
            } else if (action == "fill") {
                fill()
            } else if (action == "take") {
                take()
            } else if (action == "remaining") {
                remaining()
            } else if (action == "exit") {
                break
            } }
        while(action != "exit")
    }

    fun buy (){

        print("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")

        when (readLine()!!) {
            "1" -> {
                espresso()
            }
            "2" -> {
                latte()
            }
            "3" -> {
                cappuccino()
            }
            "back" -> {
                return
            }
        }

    }

    fun espresso() {
        //check if the coffee resources in the machine enough to make 1 cup

        if (water1 >= 250 && coffee >= 16) {
            println("I have enough resources, making you a coffee!")
            cost += 4
            cupsD-=1
            water1-=250
            coffee-=16

        } else if (water1< 250){
            println("Sorry, not enough water!")
        }
        else {
            println("Sorry, not enough coffee beans!")
        }
    }

    fun latte(){
        if (water1 >= 350 && milk1>= 75 && coffee >= 20) {
            println("I have enough resources, making you a coffee!\n")
            cost += 7
            cupsD-=1
            coffee-=20
            milk1-=75
            water1-=350

        }
        else if (water1< 350){
            println("Sorry, not enough water!\n")
        }
        else if(milk1<75) {
            println("Sorry, not enough milk!\n")
        }
        else if(coffee<20) {
            println("Sorry, not enough coffee!")
        }
    }

    fun cappuccino(){
        if (water1 >= 200 && milk1>=100 && coffee >= 12) {
            println("I have enough resources, making you a coffee!")
            cost += 6
            cupsD-=1
            water1-=200
            coffee-=12
            milk1-=100
        }
        else if (water1< 200){
            println("Sorry, not enough water!")
        }
        else if(milk1<100) {
            println("Sorry, not enough milk!")
        }
        else if(coffee<12) {
            println("Sorry, not enough coffee!")
        }
    }


    fun fill() {

        print("\nWrite how many ml of water do you want to add: ")
        val water = readLine()!!.toInt()
        print("Write how many ml of milk do you want to add: ")
        val milk = readLine()!!.toInt()
        print("Write how many grams of coffee beans do you want to add: ")
        val beans = readLine()!!.toInt()
        print("Write how many disposable cups of coffee do you want to add: ")
        val cups = readLine()!!.toInt()

        water1+= water
        milk1+=milk
        coffee+= beans
        cupsD+= cups

        println("\nThe coffee machine has:\n" +
                "$water1 ml of water\n" +
                "$milk1 ml of milk\n" +
                "$coffee g of coffee beans\n" +
                "$cupsD disposable cups\n" +
                "\$${cost} of money")
    }

    fun remaining() {

        println("\nThe coffee machine has:\n" +
                "$water1 ml of water\n" +
                "$milk1 ml of milk\n" +
                "$coffee g of coffee beans\n" +
                "$cupsD disposable cups\n" +
                "\$$cost of money\n")
    }

    fun take() {
        println("I gave you \$$cost\n\n")

    }
    }








