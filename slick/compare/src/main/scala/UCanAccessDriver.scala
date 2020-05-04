package utils.slick

import slick.jdbc.HsqldbProfile

trait UCanAccessDriver extends HsqldbProfile {

  override def quoteIdentifier(id: String): String = s"`${id}`"

}

object UCanAccessDriver extends UCanAccessDriver
