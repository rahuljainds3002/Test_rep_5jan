object question8_assignment1_scala {
  def main(args: Array[String]): Unit = {

    var age = 32

    if(age >=60 ){
      print("person is for senior citizen discount")
    }
    else if(age >=25&&age <60){
      print("person is not eligible for discount")
    }
    else if(age <25) {
      print("person is elgible for student discount")
    }
    else{print("age is not a valid integer" )}

  }

}
