


package HTTP;

import HTTP.*;

import com.sun.net.httpserver.HttpServer;

import java.io.OutputStream;
import java.net.InetSocketAddress;


public class HTTP
{
 static final int port = 99;

 public static void main(String args[])
 {
  try
  {


   HttpServer server=HttpServer.create(new InetSocketAddress(port), 0);





   String contextPath = "/";
   server.createContext(contextPath, httpExchange ->
   {

    System.out.println(contextPath+" -> "+httpExchange);

    byte response[]="Hello, World!".getBytes("UTF-8");

    httpExchange.getResponseHeaders().add("Content-Type", "text/plain; charset=UTF-8");
    httpExchange.sendResponseHeaders(200, response.length);

    OutputStream out=httpExchange.getResponseBody();
    out.write(response);
    out.close();
   });




   server.start();
   System.out.println("server running on port "+port);

   


  }
  catch (Throwable tr)
  {
   tr.printStackTrace();
  }
 }

}
