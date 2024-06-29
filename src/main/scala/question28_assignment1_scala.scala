object question28_assignment1_scala {
  def main(args: Array[String]): Unit = {
  var amount  = 120

  if(amount <100){println("person is not eligible for discount or free shipping")}
  else if(amount >=100 && amount <150){println("person is not eligible for discount but for free shipping")}
  else if(amount >=150 ){println("person is eligible for discount and for free shipping as well")}

  else{println("amount is not correct")}

}

}
