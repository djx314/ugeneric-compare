import sbt._
import sbt.Keys._

object ProjectSettings {

  val commonSettings = List(
    scalaVersion := "2.13.6",
    scalacOptions ++= Seq("-feature", "-deprecation")
  )

}
