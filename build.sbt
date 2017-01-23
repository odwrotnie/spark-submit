name := "Spark Submit"

version := "1.0"

scalaVersion := "2.11.8"

fork := true

import sbtsparksubmit.SparkSubmitPlugin.autoImport._
lazy val ssSettings = SparkSubmitSetting("sparkPi", Seq("--class", "SparkPi"))
lazy val root = (project in file("."))
  .settings(ssSettings: _*)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.1.0"
)
