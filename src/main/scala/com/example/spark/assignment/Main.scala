package com.example.spark.assignment

import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by echen on 11/4/16.
  */
object Main extends App {

  val conf = new SparkConf().setAppName("homework").setMaster("local")
  val sc = new SparkContext(conf)
  val sqlContext = new SQLContext(sc)

  val df = sqlContext.read
    .format("com.databricks.spark.csv")
    .option("header", "true")
    .option("inferSchema", "true")
    .load("stock_prices.csv")

  println(df.count())

}
