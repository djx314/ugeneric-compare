ProjectSettings.commonSettings

val parent = (project in file("."))
name := "ugeneric-compare"

val modulesDir = "modules"
val slickDir   = file(".") / modulesDir / "slick"
val slick      = (project in slickDir)

val slickCodegen = (project in slickDir / "codegen")
val slickRaw     = (project in slickDir / "raw")
val slickCompare = (project in slickDir / "compare")

val sfmt = taskKey[Unit]("fmt")

sfmt := {
  (slick / Compile / scalafmtSbt).value
  (slick / Compile / scalafmt).value
  (slickCodegen / Compile / scalafmtSbt).value
  (slickCodegen / Compile / scalafmt).value
  (slickRaw / Compile / scalafmtSbt).value
  (slickRaw / Compile / scalafmt).value
  (slickCompare / Compile / scalafmtSbt).value
  (slickCompare / Compile / scalafmt).value
  (parent / Compile / scalafmtSbt).value
  (parent / Compile / scalafmt).value
}



val aclean = taskKey[Unit]("clean")

aclean := {
  (slick / clean).value
  (slickCodegen / clean).value
  (slickRaw / clean).value
  (slickCompare / clean).value
  (parent / clean).value
}

val slickUpdate = taskKey[Unit]("slickUpdate")

slickUpdate := {
  (slick / update).value
  (slickCodegen / update).value
  (slickRaw / update).value
  (slickCompare / update).value
}

addCommandAlias("slickCodegen", ";slickCodegen/runMain HListCodegen; slickCodegen/runMain CompareCodegen")
addCommandAlias("slickRaw", ";slickRaw/compile")
addCommandAlias("slickCompare", ";slickCompare/compile")
