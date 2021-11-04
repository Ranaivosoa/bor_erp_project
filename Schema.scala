package structure

/**
 * NB. In this simple version, the implementation allows only to parse CSV file.
 * @param name
 * @param format
 * @param fields
 */
case class Schema (
                    val name: String,
                    val format: String,
                    val delimiter : Option[String],
                    val quoteChar : Option[String],
                    val escapeChar : Option[String],
                    val fields: List[Field]
                  ) extends Serializable
