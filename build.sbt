name := "scala-igdb"

version := "0.0.1"

scalaVersion := "2.11.8"

resolvers += "Local Maven" at Path.userHome.asFile.toURI.toURL + ".m2/repository"


libraryDependencies ++= {
  Seq(
    "org.stacktrace.yo" % "java-igdb" % "0.0.1",
    "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.0"
  )
}