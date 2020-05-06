package ugeneric.compare.circe

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.io.Source
import scala.language.postfixOps

object ModelCodeGen {
  val start = 5
  val count = 30
  val each  = 8

  def main(i: Array[String]): Unit = {
    {
      val path = Paths.get(".").resolve("modules").resolve("circe").resolve("models").resolve("src").resolve("main").resolve("scala").resolve("Model.scala")
      Files.createDirectories(path.getParent)
      val writer = new PrintWriter(path.toFile, "utf-8")
      val content =
        Source.fromString(views.txt.CaseClassGen(minCount = start, maxCount = count, eachCount = each).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val linerContent = content.mkString(System.lineSeparator)
      writer.println(linerContent)
      writer.close()
    }

    {
      val path = Paths.get(".").resolve("modules").resolve("circe").resolve("raw").resolve("src").resolve("main").resolve("scala").resolve("SemiAuto.scala")
      Files.createDirectories(path.getParent)
      val writer = new PrintWriter(path.toFile, "utf-8")
      val content =
        Source.fromString(views.txt.SemiAutoGen(minCount = start, maxCount = count, eachCount = each).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val linerContent = content.mkString(System.lineSeparator)
      writer.println(linerContent)
      writer.close()
    }

    {
      val path = Paths.get(".").resolve("modules").resolve("circe").resolve("derivation").resolve("src").resolve("main").resolve("scala").resolve("Derivation.scala")
      Files.createDirectories(path.getParent)
      val writer = new PrintWriter(path.toFile, "utf-8")
      val content =
        Source.fromString(views.txt.DerivationGen(minCount = start, maxCount = count, eachCount = each).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val linerContent = content.mkString(System.lineSeparator)
      writer.println(linerContent)
      writer.close()
    }

    {
      val path = Paths.get(".").resolve("modules").resolve("circe").resolve("compare").resolve("src").resolve("main").resolve("scala").resolve("UCirce.scala")
      Files.createDirectories(path.getParent)
      val writer = new PrintWriter(path.toFile, "utf-8")
      val content =
        Source.fromString(views.txt.UGenericGen(minCount = start, maxCount = count, eachCount = each).body).getLines.toList.map(_.trim).filter(s => !s.isEmpty)
      val linerContent = content.mkString(System.lineSeparator)
      writer.println(linerContent)
      writer.close()
    }
  }

}
