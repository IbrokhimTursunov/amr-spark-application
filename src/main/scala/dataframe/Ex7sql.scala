package dataframe

import org.apache.spark.sql.SparkSession

object Ex7sql extends App {
  val spark = SparkSession.builder()
    .appName("DataFrames Basics")
    .config("spark.master", "local")
    .getOrCreate()

  
  val sc = spark.sparkContext


}
