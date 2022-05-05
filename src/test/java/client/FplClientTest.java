package client;

import com.github.joshuamoore555.client.FplClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class FplClientTest {

  private static final String PATH = "/bootstrap-static/";
  FplClient fplClient;

  @BeforeEach
  public void setup() {
    fplClient = new FplClient();
  }

  @Test
  void givenAPath_whenGettingTheResponse_theResponseShouldNotBeNull() throws IOException {
    var response = fplClient.getResponse(PATH).parseAsString();
    Assertions.assertNotNull(response);
  }
}
