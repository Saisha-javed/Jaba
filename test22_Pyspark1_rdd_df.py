from pyspark.sql import  *
spark=SparkSession.builder.appName("jaba").getOrCreate()
sc=spark.sparkContext
sc.setLogLevel("ERROR")


rdd1=sc.textFile("File:/C:/data/scdata.txt")
print("printing rdd")
print(rdd1.collect())

df=spark.read.csv("File:/C:/data/scdata.txt")
print("read data frame")
df.show()