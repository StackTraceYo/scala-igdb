package org.stacktrace.yo.core

import org.stacktrace.yo.core.client.IGDBAsyncApiRequester
import org.stacktrace.yo.igdb.client.IGDBClient
import org.stacktrace.yo.igdb.client.collection.{CollectionFields, CollectionFilter, CollectionRequest}
import org.stacktrace.yo.igdb.model.Collection

import scala.collection.JavaConversions
import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by Ahmad on 9/5/2017.
  */
class CollectionRequester(implicit client: IGDBClient, ec: ExecutionContext) extends CollectionRequest(client) with IGDBAsyncApiRequester[Collection] {

  import JavaConversions._


  override def withIds(ids: String*): CollectionRequester = {
    super.withIds(ids: _*)
    this
  }

  override def withSearch(search: String): CollectionRequester = {
    super.withSearch(search)
    this
  }

  override def getCountOf(filter: CollectionFilter): CollectionRequester = {
    super.getCountOf(filter)
    this
  }

  override def addFilter(filter: CollectionFilter): CollectionRequester = {
    super.addFilter(filter)
    this
  }


  override def withFields(fields: CollectionFields*): CollectionRequester = {
    super.withFields(fields: _*)
    this
  }

  override def goAsync: Future[List[Collection]] = {
    Future {
      go().toList
    }
  }
}
