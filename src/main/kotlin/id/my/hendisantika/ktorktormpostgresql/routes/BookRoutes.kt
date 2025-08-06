package id.my.hendisantika.ktorktormpostgresql.routes

import id.my.hendisantika.ktorktormpostgresql.model.Book
import id.my.hendisantika.ktorktormpostgresql.model.BookRequest
import id.my.hendisantika.ktorktormpostgresql.model.BookResponse
import id.my.hendisantika.ktorktormpostgresql.service.BookService
import org.springframework.http.HttpStatusCode
import org.springframework.http.RequestEntity.post
import org.springframework.util.RouteMatcher

/**
 * Created by IntelliJ IDEA.
 * Project : ktor-ktorm-postgresql
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 06/08/25
 * Time: 10.22
 * To change this template use File | Settings | File Templates.
 */
private fun Book?.toBookResponse(): BookResponse? =
    this?.let { BookResponse(it.id!!, it.name) }


fun RouteMatcher.Route.createBook(bookService: BookService) {
    post {
        val request = call.receive<BookRequest>()

        val success = bookService.createBook(bookRequest = request)

        if (success)
            call.respond(HttpStatusCode.Created)
        else
            call.respond(HttpStatusCode.BadRequest, ErrorResponse("Cannot create book"))
    }
}

fun RouteMatcher.Route.getAllBooksRoute(bookService: BookService) {
    get {
        val books = bookService.findAllBooks()
            .map(Book::toBookResponse)

        call.respond(message = books)
    }
}