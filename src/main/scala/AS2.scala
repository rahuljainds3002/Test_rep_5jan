object as2 {
  def main(args: Array[String]): Unit = {

    var a = 32
    var b = a%2
    var c  = a%3
    //print(c)
    if(b!=0&&c==0 ){
      print("number is odd and divisible by 3")
    }
    else if(b!=0&&c!=0){
      print("number is  odd but not divisible by 3")
    }
    else if(b==0&&c==0) {
      print("number is not odd and  divisible by 3")
    }
    else if(b==0&&c!=0) {
      print("number is not odd and  not divisible by 3")
    }
    else{print("number is not a valid integer" )}

  }
}