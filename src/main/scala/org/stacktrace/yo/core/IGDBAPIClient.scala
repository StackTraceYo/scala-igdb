package org.stacktrace.yo.core

import org.stacktrace.yo.igdb.client.IGDBClient

/**
  * Created by Ahmad on 9/5/2017.
  */
object IGDBAPIClient {

  private lazy val client = IGDBClient.getBuilder.
    withKey("cbc5412c3d3f732df485f9cfe47d03f2")
    .withUrl("https://api-2445582011268.apicast.io")
    .build

  def getClient: IGDBClient = {
    client
  }

}
