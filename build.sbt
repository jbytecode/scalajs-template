val scala3Version = "3.7.2"


lazy val root = project
  .in(file("."))
  .settings(
    name := "dom",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.scalameta" %%% "munit" % "1.0.0" % Test,
      "org.scala-js" %%% "scalajs-dom" % "2.8.1")
  )


enablePlugins(ScalaJSPlugin)

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

// Single Threaded Tests
Test / parallelExecution := false
