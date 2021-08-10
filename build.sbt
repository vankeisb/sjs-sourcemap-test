scalaVersion := "2.13.6"

enablePlugins(ScalaJSPlugin)

name := "sjstest"

scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-lang.modules" %%% "scala-parser-combinators" % "2.0.0"
