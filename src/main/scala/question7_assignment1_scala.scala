object question7_assignment1_scala {
  def main(args: Array[String]): Unit = {

    var a  = -15
    var b = a%2
    if(b==0&&a<0 ){
      print("number is even and negative")
    }
    else if(b==0&&a>=0){
      print("number is odd but not negative")
    }
    else if(b!=0&&a<0) {
      print("number odd and  negative")
    }
  }

}
