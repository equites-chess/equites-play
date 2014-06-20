import com.typesafe.sbt.SbtNativePackager.NativePackagerKeys._

name := "equites-web"

organization := "eu.timepit"

version := "0.0.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

resolvers += "bintray/fthomas" at "http://dl.bintray.com/fthomas/maven/"

libraryDependencies += "eu.timepit" %% "equites-core" % "0.0.0"

scalariformSettings

// package settings

maintainer := "Frank S. Thomas <frank@timepit.eu>"

packageDescription := name.value

serverLoading in Debian := com.typesafe.sbt.packager.archetypes.ServerLoader.SystemV
