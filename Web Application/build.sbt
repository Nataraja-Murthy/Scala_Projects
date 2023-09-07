ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

libraryDependencies += "com.typesafe.play" %% "play-slick" % "2.8.8"

lazy val root = (project in file("."))
  .settings(
    name := "Web Application"
  )
