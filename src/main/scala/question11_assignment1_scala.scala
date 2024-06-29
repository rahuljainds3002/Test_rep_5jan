object question11_assignment1_scala {
  def main(args: Array[String]): Unit = {
  var a  = 18
  var b = a%2
  var c = 0
  for(i<-2 until a){
    var d = a%i
    if(d==0){var c = 1
      println("number is divisible by this number")

    }

  }
  if(b==0&&c==1){println("number is even and is not a prime number")}
  else if(b!=0&&c==0){println("number is odd and is  a prime number")}
    else{println("number is not odd and is not  a prime number")}

}

}
