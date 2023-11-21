ThisBuild / version := "0.2.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "primeagean-algorithms-course",
    idePackagePrefix := Some("io.github.mitchelllisle")
  )

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.15" % Test,
)
