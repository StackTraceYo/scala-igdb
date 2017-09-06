package org.stacktrace.yo.core

import scala.concurrent.ExecutionContext

/**
  * Created by Ahmad on 9/6/2017.
  */
object TryMe extends App {

  implicit val ec = ExecutionContext.global

  val x = IGDBAPIClient
    .getCollection

}
