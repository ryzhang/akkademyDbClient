package com.akkademy

import akka.actor.{ActorSelection, ActorSystem}
import akka.util.Timeout
import com.akkaademy.messages.{GetRequest, SetRequest}
import akka.pattern.ask

import scala.concurrent.duration._

class SClient(remoteAddress : String) {
  private implicit val timeout = Timeout(2 seconds)
  private implicit val system = ActorSystem("LocalSystem");
  private val remoteDb: ActorSelection = system.actorSelection(s"akka.tcp://akkademy@$remoteAddress/user/akkademy-db")

  def set(key: String, value: Object)= {
    remoteDb ? SetRequest(key, value)
  }

  def get(key: String)= {
    remoteDb ? GetRequest(key)
  }
}
