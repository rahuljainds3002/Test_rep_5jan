object question4_scala_assignment1 {

  def main(args: Array[String]): Unit = {
    var a = 32
    var b = a%4
    var c  = a%6
    //print(c)
    if(b!=0&&c==0 ){
      print("number is not divisible by 4 and  divisible by 6")
    }
    else if(b!=0&&c!=0){
      print("number is not divisible by 4 and not  divisible by 6")
    }
    else if(b==0&&c==0) {
      print("number is divisible by 4 and divisible by 6")
    }
    else if(b==0&&c!=0) {
      print("number is divisible by 4 and not  divisible by 6")
    }
    else{print("number is not a valid integer" )}




  }


}
