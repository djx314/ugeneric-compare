import sbt._
import sbt.Keys._

object Dependencies {

  val slickVersion = "3.3.3"

  val slick        = "com.typesafe.slick" %% "slick"         % slickVersion
  val slickCodegen = "com.typesafe.slick" %% "slick-codegen" % slickVersion

  val ucanaccess = List("com.healthmarketscience.jackcess" % "jackcess" % "4.0.1", "net.sf.ucanaccess" % "ucanaccess" % "5.0.1", "org.hsqldb" % "hsqldb" % "2.6.0")

  val ugenericSlick = "org.scalax" %% "ugeneric-slick" % "0.0.2-SNAP2021080901"

  val circe = ("io.circe" %% "circe-derivation" % "0.13.0-M5") :: List(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic",
    "io.circe" %% "circe-parser"
  ).map(_ % "0.14.1")

}
