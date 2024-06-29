import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.col

object Spark_testig {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.appName("OOMExample").master("local[*]").getOrCreate()

    val mylist=List(("john",35),("meer",45),("priya",65))


    val df=spark.createDataFrame(mylist)
    val df2= df.toDF("name","age")
    df2.printSchema()

    val df3=df2.withColumn("double_age",col("age")*2)

    val df4=df3.withColumnRenamed("double_age","adult")
    df4.show()
    scala.io.StdIn.readLine()
  }
}

