import scala.concurrent.Future

object Util {

  def getUserFromExternalService(id: Int = 1): Future[User] = id match {
    case 1 => Future.successful(User("Bob", "Villa"))
    case 2 => Future.successful(User("Joe", "Schmoe"))
    case 3 => Future.successful(User("Sally", "May"))
    case _ => Future.successful(User("Mystery", "Person"))
  }

  def getCarFromexternalService(id: Int = 1): Future[Car] = id match {
    case 1 | 2 | 3 => Future.successful(Car(id))
    case _         => Future.successful(Car(0))
  }

  def liveDangerously() : Unit = {
    val random = new java.util.Random()
    if (random.nextInt < 0) {
      throw new Exception("Failed to live dangerously")
    }
  }

  def dangerousString(str: String) : Future[String] ={
    liveDangerously()
    Future.successful(str)
  }

}
