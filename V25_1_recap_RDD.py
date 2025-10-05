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

str2=["A~B" ,"C~D"]
rdd2=sc.parallelize(str2)
print("Str2 rdd is " ,rdd2.collect())
flatmapRdd=rdd2.flatMap(lambda x:x.split("~"))
print(flatmapRdd.collect())

staterdd=sc.textFile("File:/C:/data/scdata.txt")
print(staterdd.collect())
stage1=staterdd.flatMap(lambda  x:x.split("~"))
state1=stage1.filter(lambda  x:'State' in x)

print("state 1" ,state1.collect())
fstate=state1.map(lambda  x:x.replace("State->" ,""))
print(fstate.collect())
fstate.saveAsTextFile("file:///c:/data/sc11dataa")
