import scala.concurrent.Future

/**
 * Author: John Murray <jmurray@appnexus.com>
 * Date:   1/27/14
 *
 * DESCRIPTION
 */
object _3_Recovery {

  def madeSafe() : Future[String] = {
    import Util.dangerousString

    // using 'recover', make this safe by providing defaults
    // at each point a failure could occur

    dangerousString("Hello").flatMap{s : String =>
      dangerousString(s + " there")
    }.flatMap{s: String =>
      dangerousString(s + " Frank")
    }
  }

  def main(args: Array[String]): Unit = {

    madeSafe().onSuccess { case s: String => println(s) }

  }

}
