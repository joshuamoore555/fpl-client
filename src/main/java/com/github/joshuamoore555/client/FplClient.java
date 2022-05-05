package com.github.joshuamoore555.client;

import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;

import java.io.IOException;

public class FplClient {
  private static final String FPL_BASE_URL = "https://fantasy.premierleague.com/api";
  private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();

  /**
   * Makes a GET request to
   *
   * <p><a
   * href="https://fantasy.premierleague.com/api">https://fantasy.premierleague.com/api</a></a>
   *
   * <p>and returns a new {@code HttpResponse}.
   *
   * <p>A path is given in order to access different parts of the FPL API.
   *
   * <p>
   *
   * @param path the path used to build a GET request
   * @throws IOException if the regular expression's syntax is invalid
   */
  public HttpResponse getResponse(String path) throws IOException {
    HttpRequestFactory requestFactory = HTTP_TRANSPORT.createRequestFactory();
    GenericUrl url = new GenericUrl(FPL_BASE_URL + path);
    HttpRequest request = requestFactory.buildGetRequest(url);
    return request.execute();
  }
}
