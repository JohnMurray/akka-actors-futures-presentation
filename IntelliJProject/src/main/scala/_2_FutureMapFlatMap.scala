import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object _2_FutureMapFlatMap {

  def printDriver() : Unit = {
    // Util.getCarFromexternalService(1)

    // print the driver's name in similar fashion to how
    // we printed the user's name in 1.

    // Note: you can only use the 'map' and 'onSuccess' functions
    //       of the Future
  }


  def main(args: Array[String]) : Unit = {
    printDriver()
  }
}
