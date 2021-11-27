package edu.knoldus

import java.io.File

import scala.concurrent.{ExecutionContext, Future}

 class Content{


  def contentInDir(path: String)
                  (implicit ec: ExecutionContext): Future[Any] =
    Future {
      val file = new File(path)
      if (file.isDirectory)
        file.listFiles().toList.map(_.getAbsolutePath)
      else {
        ("path doesn't exist")
      }
    }



}

