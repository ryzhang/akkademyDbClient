name := "akka-quickstart-scala"

version := "1.0"

scalaVersion := "2.12.6"

lazy val akkaVersion = "2.5.16"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "com.akkademy-db" %% "akkademy-db" % "0.0.1-SNAPSHOT",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)