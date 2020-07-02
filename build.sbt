name := "geetingstarted"

version := "0.1"

//scalaVersion := "2.13.3"
//libraryDependencies += "org.apache.spark" % "spark-core" % "2.1.1"

scalaVersion := "2.11.8"

val sparkVersion = "1.6.1"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-streaming-twitter" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)
