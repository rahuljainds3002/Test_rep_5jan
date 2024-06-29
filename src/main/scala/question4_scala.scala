object question4_scala {

    def main(args: Array[String]): Unit = {

      var age = 20

      if(age>=16 ) {
        print("person eligible for Voter ID and Driving Licence")
      } else if(age>=16&&age<18){
        print("person eligible for Voter ID but not for Driving Licence")
      }
      else if(age<16) {
        print("person not eligible for Voter ID nor for Driving Licence")
      }

      else{print("age is not valid" )}

    }


}
