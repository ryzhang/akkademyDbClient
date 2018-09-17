package com.akkademy

import org.scalatest.{FunSpecLike, Matchers}

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._

class SClientIntegrationSpec extends FunSpecLike with Matchers {

  val client = new SClient("127.0.0.1:2552")

  describe("akkademyClient") {
    it("should set a value") {
      client.set("123", new Integer(123))
      val future: Future[Any] = client.get("123")
      val result = Await.result(future.mapTo[Int], 10 seconds)
      result should equal(123)
    }
  }

}
