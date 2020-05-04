import sbt._
import sbt.Keys._

object ProjectSettings {

  val commonSettings = List(
    scalaVersion := "2.13.2",
    scalacOptions ++= Seq("-feature", "-deprecation")
  )

}
