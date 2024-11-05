package tech.java.java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Comparator;

public class _11JavaFeatures {

  public static void main (String[] args) {

    //Local-Variable Syntax for Lambda Parameters:
    Comparator<String> comp3 = (var first, var second) ->
        second.length() - first.length();

    System.out.println ( comp3.compare ("test2","test34"));

    initiateHttpClient ();
  }

  private static void initiateHttpClient(){
    HttpClient client = HttpClient.newHttpClient ();
    HttpRequest request = HttpRequest.newBuilder ()
        .uri (URI.create ("https://jsonplaceholder.typicode.com/posts/1"))
        .build();

    client.sendAsync (request, HttpResponse.BodyHandlers.ofString ())
        .thenApply(HttpResponse::body)
        .thenAccept(System.out::println)
        .join();
  }
}
