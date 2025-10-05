from pyspark.sql import  *
spark=SparkSession.builder.appName("jaba").getOrCreate()
sc=spark.sparkContext
sc.setLogLevel("ERROR")

strList=[ "jaba" ,"jaali" ,"jabachecha"]
rdd=sc.parallelize(strList)
print("raw list is " ,strList,type(strList))
print("rdd of string is " ,rdd.collect(),type(rdd))

concat_apt=rdd.map(lambda  x:x+"_apt")
print("concat string is ")
print(concat_apt.collect())
print("replace str")
replaceRdd=rdd.map(lambda  x:x.replace("jaba","Gaba"))
print(replaceRdd.collect())