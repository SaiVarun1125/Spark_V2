import org.apache.spark.sql.SparkSession
object AvgWordLength{
  val spark = SparkSession.builder
    .appName("Average Word Count")
    .master("local[*]")
    .getOrCreate()

  spark.sparkContext.setLogLevel("ERROR")

  val inputFilePath ="input Path"

  val inputRDD =spark.sparkContext.textFile(inputFilePath)

  val wordsRDD = inputRDD.flatMap(line => line.split("\\s+"))
  val wordLengthsRDD = wordsRDD.map(word => word.length)
  val avgWordLength = totalLength.toDouble
  println(s"Average Word Length: $averageWordLength")

  spark.stop()

}
}

