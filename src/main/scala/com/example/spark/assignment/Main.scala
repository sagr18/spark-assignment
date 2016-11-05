package com.example.spark.assignment

import java.sql.Timestamp

import org.apache.spark.sql.SparkSession

object Main extends App {

  // Use this to your advantage
  case class StockPrice(ticker: String, close: Double, high: Double, low: Double, volume: Long, date: Timestamp)

  // Setup
  val sparkSession = SparkSession.builder().appName("assignment").master("local").getOrCreate()

  import sparkSession.implicits._

  // You can choose to use any one of these 3 distributed data structures
  val dataframe = sparkSession.read.option("header", "true").option("inferSchema", "true").csv("stock_prices.csv")
  val dataset = dataframe.as[StockPrice]
  val rdd = dataset.rdd

  dataframe.createOrReplaceTempView("stock_prices")
  dataframe.cache()

  /*
  Put Your Solutions Here
   */

}
