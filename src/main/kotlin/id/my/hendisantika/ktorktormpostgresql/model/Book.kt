package id.my.hendisantika.ktorktormpostgresql.model

import org.ktorm.entity.Entity
import org.ktorm.schema.Table
import org.ktorm.schema.long
import org.ktorm.schema.varchar
import java.awt.print.Book

/**
 * Created by IntelliJ IDEA.
 * Project : ktor-ktorm-postgresql
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 06/08/25
 * Time: 10.17
 * To change this template use File | Settings | File Templates.
 */
object Books : Table<Book>("book") {
    val id = long("id").primaryKey().bindTo(Book::id)
    val name = varchar("name").bindTo(Book::name)
}

interface Book : Entity<Book> {
    companion object : Entity.Factory<Book>()

    val id: Long?
    var name: String
}