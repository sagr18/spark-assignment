# Spark Assignment

Fork this project, complete the assigned objectives then submit your work back to us as a **Pull Request** 

This repo scaffolds a basic Apache Spark project for your convenience. Please feel free to edit it as you see fit
Or not use it at all, if you prefer to use a different Spark version or language such as `SparkR` or `pyspark`

Complete the assignment on a POSIX like system such as Mac OS or a Linux distribution
Hadoop based technologies generally do not function smoothly on Windows machines

**If you are not familiar with Apache Spark** you may submit the assignment using the framework/language of your choice (such as Python Pandas or R dplyr)

# Assumptions

 - No dividends adjustments are necessary, using only the closing price to determine returns
 - If a price is missing on a given date, you can compute returns from the closest available date
 - Return can be trivially computed as the % difference of two prices 

# Assignment Objectives
The file `stock_prices.csv` (included in the repository) contains the daily closing price of a few stocks on the NYSE/NASDAQ
Look at `src/main/scala/com/example/spark/assignment/Main.scala` to get started
 
 - Load up `stock_prices.csv` as a _DataFrame_, _Dataset_ or _RDD_
 - Compute the average daily return of every stock for every date. Print the results to screen 
 
_In other words, your output should have the columns:_

| date       | average_return                    |
|:-----------|:----------------------------------|
| yyyy-MM-dd | return of all stocks on that date |
 
 - Which stock was traded most frequently - as measured by closing price * volume - on average?

## Bonus Question
 - Which stock was the most volatile as measured by annualized standard deviation of daily returns?
 
# Evaluation
 - Correctness is most important
 - Elegance and style is the next most important
 - Performance is the last criteria, but can be detrimental to you if your implementation is unreasonably costly
 
# Some helpful hints
You may or may not need these hints depending on the approach you take

 - Use an IDE such as [Intellij](https://www.jetbrains.com/idea/download/) or Eclipse
 - Window Functions on _DataFrame_ https://databricks.com/blog/2015/07/15/introducing-window-functions-in-spark-sql.html
 - If you've never used Apache Maven before, just know that the entire project will be setup automatically for you if you open the `pom.xml` file on Intellij