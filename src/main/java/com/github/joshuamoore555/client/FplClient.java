package com.github.joshuamoore555.client;

import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;

import java.io.IOException;

public class FplClient {
    private static final String FPL_BASE_URL = "https://fantasy.premierleague.com/api";
    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();

    public HttpResponse getResponse(final String path) throws IOException {
        final HttpRequestFactory requestFactory = HTTP_TRANSPORT.createRequestFactory();
        final GenericUrl url = new GenericUrl(FPL_BASE_URL + path);
        final HttpRequest request = requestFactory.buildGetRequest(url);
        return request.execute();
    }

}
