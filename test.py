import pyspark
import platform
import subprocess
from pyspark.sql import SparkSession

print("=== ENVIRONMENT CHECK ===")
print("PySpark version:", pyspark.__version__)
print("Python version:", platform.python_version())

# Create SparkSession to get JVM-side version
spark = SparkSession.builder.appName("env_check").getOrCreate()
print("Spark JVM version:", spark.version)

# Try to get Java version
try:
    java_version = subprocess.check_output(["java", "-version"], stderr=subprocess.STDOUT)
    print("Java version info:\n", java_version.decode())
except Exception as e:
    print("Could not fetch Java version:", e)

spark.stop()
print("=========================")

