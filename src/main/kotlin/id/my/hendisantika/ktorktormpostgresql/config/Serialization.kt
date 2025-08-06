package id.my.hendisantika.ktorktormpostgresql.config

import com.apple.eawt.Application
import org.slf4j.bridge.SLF4JBridgeHandler.install
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder.json

/**
 * Created by IntelliJ IDEA.
 * Project : ktor-ktorm-postgresql
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 06/08/25
 * Time: 10.16
 * To change this template use File | Settings | File Templates.
 */
fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
}