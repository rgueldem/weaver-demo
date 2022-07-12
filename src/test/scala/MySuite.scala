import com.dimafeng.testcontainers.MySQLContainer
import monix.eval.Task
import weaver.monixcompat._

object MySuite extends SimpleTaskSuite {
  val container = MySQLContainer()

  test("example test that succeeds") {
    for {
      _ <- Task(container.start())
      name <- Task(container.username)
      _ <- Task(container.stop())
    } yield expect(name == "test")
  }
}
