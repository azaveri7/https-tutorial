name := "https-tutorial"

version := "0.1"

scalaVersion := "2.13.6"

val Http4sVersion = "1.0.0-M21"
val CirceVersion = "0.14.0-M5"
val ScalaTestVersion = "3.2.11"
libraryDependencies ++= Seq(
  "org.http4s"      %% "http4s-blaze-server" % Http4sVersion,
  "org.http4s"      %% "http4s-circe"        % Http4sVersion,
  "org.http4s"      %% "http4s-dsl"          % Http4sVersion,
  "io.circe"        %% "circe-generic"       % CirceVersion,
  "org.scalatest"   %% "scalatest"           % ScalaTestVersion % "test"
)
