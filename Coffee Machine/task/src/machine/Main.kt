package machine



    fun main() {
        val water1= 400
        val milk1= 540
        val coffee= 120
        val cupsD= 9
        val cost= 550

        println("The coffee machine has:\n" +
                "400 ml of water\n" +
                "540 ml of milk\n" +
                "120 g of coffee beans\n" +
                "9 disposable cups\n" +
                "\$550 of money\n")

        print("Write action (buy, fill, take): ")
        val action = readln()

        if(action == "buy") {
            print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
            val buyCoffee = readln()

            if(buyCoffee == "1"){
                println("\nThe coffee machine has:\n" +
                        "${water1 - 250} ml of water\n" +
                        "${milk1} ml of milk\n" +
                        "${coffee - 16} g of coffee beans\n" +
                        "${cupsD - 1} disposable cups\n" +
                        "\$${cost + 4} of money")
            }
            else if (buyCoffee == "2"){
                println("The coffee machine has:\n" +
                        "${water1 - 350} ml of water\n" +
                        "${milk1 - 75} ml of milk\n" +
                        "${coffee - 20} g of coffee beans\n" +
                        "${cupsD - 1} disposable cups\n" +
                        "\$${cost + 7} of money")
            }else if (buyCoffee == "3"){
                print("The coffee machine has:\n" +
                        "${water1 - 200} ml of water\n" +
                        "${milk1 - 100} ml of milk\n" +
                        "${coffee - 12} g of coffee beans\n" +
                        "${cupsD - 1} disposable cups\n" +
                        "\$${cost + 6} of money")
            }
        } else if (action == "fill"){
            println("Write how many ml of water do you want to add: ")
            val water = readln().toInt()
            println("Write how many ml of milk do you want to add: ")
            val milk = readln().toInt()
            println("Write how many grams of coffee beans do you want to add: ")
            val beans = readln().toInt()
            println("Write how many disposable cups of coffee do you want to add: ")
            val cups = readln().toInt()


            print("The coffee machine has:\n" +
                    "${water1 + water} ml of water\n" +
                    "${milk1 + milk} ml of milk\n" +
                    "${coffee + beans} g of coffee beans\n" +
                    "${cupsD + cups} disposable cups\n"+
                    "\$${cost} of money")
        } else if (action == "take"){
            println("I gave you \$$cost")
            print("The coffee machine has:\n" +
                    "400 ml of water\n" +
                    "540 ml of milk\n" +
                    "120 g of coffee beans\n" +
                    "9 disposable cups\n" +
                    "\$0 of money")
        }}




      /*  Stage #3

        val w = water / 200
        val m = milk / 50
        val b = beans / 15





        if (w<=m && w<=b) {
            if (w/cups==cups) {println("Yes, I can make that amount of coffee")}
            else if  ((w/cups)>cups) {println("Yes, I can make that amount of coffee (and even ${w/cups-1} more than that)")}
            else if ((w/cups)<cups) {println("No, I can make only ${w} cups of coffee")}

        }
        else if (m<=b && m<=w) {
            if (m/cups==cups) {println("Yes, I can make that amount of coffee")}
            else if  ((m/cups)>cups) {println("Yes, I can make that amount of coffee (and even ${m/cups-1} more than that)")}
            else if ((m/cups)<cups) {println("No, I can make only ${m} cups of coffee")}
        }
        else if (b<=m && b<=w) {
            if (b/cups==cups) {println("Yes, I can make that amount of coffee")}
            else if  ((b/cups)>cups) {println("Yes, I can make that amount of coffee (and even ${b/cups-1} more than that)")}
            else if ((b/cups)<cups) {println("No, I can make only ${b} cups of coffee")}
        }}*/









