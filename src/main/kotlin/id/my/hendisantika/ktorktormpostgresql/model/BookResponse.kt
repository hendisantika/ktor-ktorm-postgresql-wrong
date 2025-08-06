package id.my.hendisantika.ktorktormpostgresql.model

/**
 * Created by IntelliJ IDEA.
 * Project : ktor-ktorm-postgresql
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 06/08/25
 * Time: 10.19
 * To change this template use File | Settings | File Templates.
 */
@Serializable
data class BookResponse(
    val id: Long,
    val name: String
)
