package org.stacktrace.yo.core.client

import scala.concurrent.Future

/**
  * Created by Ahmad on 9/5/2017.
  */
trait IGDBAsyncApiRequester[T] {

  def goAsync: Future[List[T]]

}
