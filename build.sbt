ProjectSettings.commonSettings

val parent = (project in file("."))
name := "ugeneric-compare"

val modulesDir = file(".") / "modules"
val slickDir   = modulesDir / "slick"
val slick      = (project in slickDir)
val asuna      = (project in modulesDir / "asuna")

val slickCodegen = (project in slickDir / "codegen")
val slickRaw     = (project in slickDir / "raw")
val slickCompare = (project in slickDir / "compare").dependsOn(asuna)

val circeDir        = modulesDir / "circe"
val circe           = (project in circeDir)
val circeCodegen    = (project in circeDir / "codegen")
val circeModel      = (project in circeDir / "models")
val circeRaw        = (project in circeDir / "raw").dependsOn(circeModel)
val circeDerivation = (project in circeDir / "derivation").dependsOn(circeModel)
val circeCompare    = (project in circeDir / "compare").dependsOn(circeModel, asuna)

val circeFailDir        = modulesDir / "circe-fail"
val circeFail           = (project in circeFailDir)
val circeFailCodegen    = (project in circeFailDir / "codegen")
val circeFailModel      = (project in circeFailDir / "models")
val circeFailRaw        = (project in circeFailDir / "raw").dependsOn(circeFailModel)
val circeFailDerivation = (project in circeFailDir / "derivation").dependsOn(circeFailModel)
val circeFailCompare    = (project in circeFailDir / "compare").dependsOn(circeFailModel, asuna)

val sfmt = taskKey[Unit]("fmt")

sfmt := {
  (slick / Compile / scalafmtSbt).value
  (slick / Compile / scalafmt).value
  (slickCodegen / Compile / scalafmtSbt).value
  (slickCodegen / Compile / scalafmt).value
  (slickRaw / Compile / scalafmtSbt).value
  (slickCompare / Compile / scalafmtSbt).value

  (circeCodegen / Compile / scalafmtSbt).value
  (circeCodegen / Compile / scalafmt).value
  (circe / Compile / scalafmtSbt).value
  (circe / Compile / scalafmt).value
  (circeModel / Compile / scalafmtSbt).value
  (circeRaw / Compile / scalafmtSbt).value
  (circeCompare / Compile / scalafmtSbt).value

  (parent / Compile / scalafmtSbt).value
  (parent / Compile / scalafmt).value

}

val cleanAll = taskKey[Unit]("clean all")

cleanAll := {
  (slick / clean).value
  (slickCodegen / clean).value
  (slickRaw / clean).value
  (slickCompare / clean).value

  (circe / clean).value
  (circeCodegen / clean).value
  (circeModel / clean).value
  (circeRaw / clean).value
  (circeDerivation / clean).value
  (circeCompare / clean).value

  (parent / clean).value
}

val updateAll = taskKey[Unit]("update all")

updateAll := {
  (slick / update).value
  (slickCodegen / update).value
  (slickRaw / update).value
  (slickCompare / update).value

  (circe / update).value
  (circeCodegen / update).value
  (circeModel / update).value
  (circeRaw / update).value
  (circeDerivation / clean).value
  (circeCompare / update).value
}

addCommandAlias("slickCodegen", ";slickCodegen/runMain HListCodegen; slickCodegen/runMain CompareCodegen")
addCommandAlias("slickRaw", ";slickRaw/compile")
addCommandAlias("slickCompare", ";slickCompare/compile")

addCommandAlias("circeCodegen", ";circeCodegen/runMain ugeneric.compare.circe.ModelCodeGen")
addCommandAlias("circePre", ";circeModel/compile")
addCommandAlias("circeRaw", ";circeRaw/compile")
addCommandAlias("circeDerivation", ";circeDerivation/compile")
addCommandAlias("circeCompare", ";circeCompare/compile")

addCommandAlias("circeFailCodegen", ";circeFailCodegen/runMain ugeneric.compare.circe.fail.ModelCodeGen")
addCommandAlias("circeFailPre", ";circeFailModel/compile")
addCommandAlias("circeFailRaw", ";circeFailRaw/compile")
addCommandAlias("circeFailDerivation", ";circeFailDerivation/compile")
addCommandAlias("circeFailCompare", ";circeFailCompare/compile")