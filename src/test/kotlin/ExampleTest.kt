import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import ru.kpfu.annotation.TmsLink
import ru.kpfu.dsl.expected
import ru.kpfu.dsl.precondition
import ru.kpfu.dsl.step

@DisplayName("Тестовый набор 1")
class ExampleTest {

    @Test
    @TmsLink("123123")
    @DisplayName("Тест кейс 1")
    fun test() {
        precondition("Предусловия теста 1")
        step("Шаг 1")
            .expected("Ожидаемое 1") {
                println("Hello")
            }
    }

    @Test
    @TmsLink("123123")
    @DisplayName("Тест кейс 2")
    fun test1() {
        precondition("Предусловия теста 1") {
            println("123")
        }

        step("Шаг 1")
            .expected("Ожидаемое 1") {
                println("Hello")
            }
    }
}