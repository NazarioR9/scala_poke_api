package utils

trait IOReader[T] {
  def read(url: String): String
}

trait IOApiReader[T] extends IOReader[T]{
  override def read(url: String): String = ???
}

abstract class AbstractClassReader[T] extends IOApiReader[T]