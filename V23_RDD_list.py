from pyspark.sql import *

spark=SparkSession.builder.appName("jaba").getOrCreate()
sc=spark.sparkContext
sc.setLogLevel("ERROR")

list1=[1,2,3,4,5]
#add 2 to list
rdd1=sc.parallelize(list1)
print("list1 is " ,list1,"type of listi is",type(list1))
print("rdd of list is ", rdd1.collect(), "type of rdd is " ,type(rdd1))

rddPlus2=rdd1.map(lambda x:x+2)
print("plus2 rdd is " ,rddPlus2.collect())

elist=rdd1.filter(lambda  x:x%2==0)
print("elist is",elist.collect())