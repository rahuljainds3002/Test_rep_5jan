object as1 {
  def main(args: Array[String]): Unit = {

   var a  = 15
    var b = a%2
    if(b==0&&a>0 ){
      print("number is even and positive")
    }
    else if(b==0&&a<=0){
      print("number is even but not positive")
    }
    else if(b!=0&&a>0){
      print("number is not even but  positive")
    }
  }
}