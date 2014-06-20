name := "equites-web"

version := "0.0.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

resolvers += "bintray/fthomas" at "http://dl.bintray.com/fthomas/maven/"

libraryDependencies += "eu.timepit" %% "equites-core" % "0.0.0"

scalariformSettings
