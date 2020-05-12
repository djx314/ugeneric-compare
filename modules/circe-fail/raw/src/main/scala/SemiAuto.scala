package ugeneric.compare.circe.fail

import io.circe.generic.semiauto.{deriveDecoder, deriveEncoder}
import io.circe.{Decoder, Encoder}

trait SemiAutoCirce {
  implicit val encode: Encoder[ModelForFail] = deriveEncoder
  implicit val decoder: Decoder[ModelForFail] = deriveDecoder
}
