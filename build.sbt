name := "pokeapi"

version := "0.1"

scalaVersion := "2.13.5"

libraryDependencies += "com.typesafe.play" %% "play-json" % "2.8.1"
libraryDependencies += "io.circe" %% "circe-core" % "0.15.0-M1"
libraryDependencies += "io.circe" %% "circe-parser" % "0.15.0-M1"
libraryDependencies += "io.circe" %% "circe-generic" % "0.15.0-M1"

libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.26"