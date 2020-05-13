package ugeneric.compare.circe.fail

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source
import scala.language.postfixOps

object ModelCodeGen {
  val each = 254

  def main(i: Array[String]): Unit = {

    val path = Paths.get(".").resolve("modules").resolve("circe-fail").resolve("models").resolve("src").resolve("main").resolve("scala").resolve("ModelForFail.scala")
    Files.createDirectories(path.getParent)
    val writer       = new PrintWriter(path.toFile, "utf-8")
    val content      = Source.fromString(views.txt.FailCaseClassGen(eachCount = each).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
    val linerContent = content.mkString(System.lineSeparator)
    writer.println(linerContent)
    writer.close()

  }

}
