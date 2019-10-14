from pyspark.sql import SparkSession

spark = SparkSession.builder.master("local").appName("Spark-Assignment").getOrCreate()
df = spark.read.format("csv").option("header", "true").option("mode", "DROPMALFORMED").load("/home/sagar_saxena/Desktop/spark-assignment/stock_prices.csv")
df.createOrReplaceTempView("df")
# result = spark.sql("select date as date, avg((close-open)*volume) as average_return from df group by date")
# result.coalesce(1).write.format("com.databricks.spark.csv").save("/home/sagar_saxena/Desktop/spark-assignment/src/main/scala/com/example/spark/assignment/average_results.csv", header="true")
result2 = spark.sql("select ticker, avg(close*volume) as value from df group by ticker order by value desc limit 1")
print(result2.show())