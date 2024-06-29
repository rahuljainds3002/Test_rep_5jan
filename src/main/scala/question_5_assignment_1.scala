object question_5_assignment_1 {
  def main(args: Array[String]): Unit = {

    var age = 32

    if(age >=18 ){
      print("person is eligible to vote and eligible to drive as well")
    }
    else if(age >=16&&age <18){
      print("person is eligible to drive but not eligible to vote")
    }
    else if(age <16) {
      print("person is not eligible to drive neither  eligible to vote")
    }
    else{print("age is not a valid integer" )}

  }
}
