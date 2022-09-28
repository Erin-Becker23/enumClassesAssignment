enum class PositionTitle{
    ADMINISTRATION{
        override fun displayIt(){
            println("Administration")
        }
                  },
    PRODUCTION{
        override fun displayIt(){
            println("Production")
        }
              },
    SALES{
        override fun displayIt(){
            println("Sales")
        }
         },
    MAINTENANCE{
        override fun displayIt(){
            println("Maintenance")
        }
               },
    TECHNICAL{
        override fun displayIt(){
            println("Technical")
        }
             },
    SECRETARIAL{
        override fun displayIt(){
            println("Secretarial")
        }
    };

    abstract fun displayIt()
}

