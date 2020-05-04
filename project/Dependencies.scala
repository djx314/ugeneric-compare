import sbt._
import sbt.Keys._

object Dependencies {

  val slickVersion = "3.3.2"

  val slick        = "com.typesafe.slick" %% "slick"         % slickVersion
  val slickCodegen = "com.typesafe.slick" %% "slick-codegen" % slickVersion

  val ucanaccess = List("com.healthmarketscience.jackcess" % "jackcess" % "3.0.1", "net.sf.ucanaccess" % "ucanaccess" % "5.0.0", "org.hsqldb" % "hsqldb" % "2.5.0")

  val ugenericSlick = "org.scalax" %% "ugeneric-slick" % "0.0.1-20200502SNAP3"

}
