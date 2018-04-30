import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.darktalents",
      scalaVersion := "2.12.6",
      version      := "1.0"
    )),
    name := "argparse",
    libraryDependencies += scalaTest % Test
  )