import java.util
import scala.jdk.CollectionConverters._
object withJava extends App{

  val numbersInJava: util.List[Int]=util.Arrays.asList(1,2,3,4)
  val listScala: scala.collection.mutable.Buffer[Int]=numbersInJava.asScala
  listScala.foreach(number => println(number))
}
