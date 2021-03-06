ProjectSettings.commonSettings

val parent = (project in file("."))
name := "ugeneric-compare"

val modulesDir = file(".") / "modules"

val zsg = (project in modulesDir / "zsg")

val slickDir = modulesDir / "slick"
val slick    = (project in slickDir)

val slickCodegen = (project in slickDir / "codegen")
val slickRaw     = (project in slickDir / "raw")
val slickCompare = (project in slickDir / "compare").dependsOn(zsg)

val circeDir        = modulesDir / "circe"
val circe           = (project in circeDir)
val circeCodegen    = (project in circeDir / "codegen")
val circeModel      = (project in circeDir / "models")
val circeRaw        = (project in circeDir / "raw").dependsOn(circeModel)
val circeDerivation = (project in circeDir / "derivation").dependsOn(circeModel)
val circeCompare    = (project in circeDir / "compare").dependsOn(circeModel, zsg)

val circeFailDir        = modulesDir / "circe-fail"
val circeFail           = (project in circeFailDir)
val circeFailCodegen    = (project in circeFailDir / "codegen")
val circeFailModel      = (project in circeFailDir / "models")
val circeFailRaw        = (project in circeFailDir / "raw").dependsOn(circeFailModel)
val circeFailDerivation = (project in circeFailDir / "derivation").dependsOn(circeFailModel)
val circeFailCompare    = (project in circeFailDir / "compare").dependsOn(circeFailModel, zsg)

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
  (circeDerivation / Compile / scalafmtSbt).value

  (circeFailCodegen / Compile / scalafmtSbt).value
  (circeFailCodegen / Compile / scalafmt).value
  (circeFail / Compile / scalafmtSbt).value
  (circeFail / Compile / scalafmt).value
  (circeFailModel / Compile / scalafmtSbt).value
  (circeFailRaw / Compile / scalafmtSbt).value
  (circeFailCompare / Compile / scalafmtSbt).value
  (circeFailDerivation / Compile / scalafmtSbt).value

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

  (circeFail / clean).value
  (circeFailCodegen / clean).value
  (circeFailModel / clean).value
  (circeFailRaw / clean).value
  (circeFailDerivation / clean).value
  (circeFailCompare / clean).value

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
  (circeDerivation / update).value
  (circeCompare / update).value

  (circeFail / update).value
  (circeFailCodegen / update).value
  (circeFailModel / update).value
  (circeFailRaw / update).value
  (circeFailDerivation / clean).value
  (circeFailCompare / update).value
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
