package ugeneric.compare.circe.fail
import io.circe.{Decoder, Encoder}
import ugeneric.circe.UCirce
trait UCirceFail {

  implicit val encoder: Encoder[ModelForFail] = UCirce.encodeCaseClass(implicit e => _.encodeCaseClass)
  implicit val decoder: Decoder[ModelForFail] = UCirce.decodeCaseClass(implicit e => _.decodeCaseClass)

}
