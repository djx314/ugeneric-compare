package ugeneric.compare.circe.fail
import io.circe.{ Decoder, Encoder }
import io.circe.derivation.{ deriveDecoder, deriveEncoder }
trait DerivationCirce {
  implicit val encode: Encoder[ModelForFail] = deriveEncoder
  implicit val decoder: Decoder[ModelForFail] = deriveDecoder
}
