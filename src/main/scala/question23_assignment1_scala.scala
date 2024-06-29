object question23_assignment1_scala {
  def main(args: Array[String]): Unit = {
    var amount  = 190
    var loyalty_card = "No"
    if(amount >=200||loyalty_card=="true"){println("person is a eligible for discount")}
    else if(amount <200&&loyalty_card=="true"){println("person is eligible for discount")}

    else{println("customer is not eligible for discount")}

  }

}
