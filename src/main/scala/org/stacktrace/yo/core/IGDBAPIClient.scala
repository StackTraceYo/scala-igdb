package org.stacktrace.yo.core

import org.stacktrace.yo.igdb.client.IGDBClient
import org.stacktrace.yo.igdb.client.collection.CollectionFields

import scala.concurrent.duration._
import scala.concurrent.{Await, ExecutionContext}

/**
  * Created by Ahmad on 9/5/2017.
  */
object IGDBAPIClient {

  implicit val client: IGDBClient = IGDBClient.getBuilder.
    withKey("cbc5412c3d3f732df485f9cfe47d03f2")
    .withUrl("https://api-2445582011268.apicast.io")
    .build

  def getClient: IGDBClient = {
    client
  }

  def getCollection(implicit ex: ExecutionContext): Unit = {
    val x = Await.result(new CollectionRequester()
      .withIds("1027")
      .withFields(CollectionFields.ALL)
      .goAsync, 5 seconds)

    x.foreach(xy => println(xy.getName))
  }

}
