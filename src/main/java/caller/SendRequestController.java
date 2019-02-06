package caller;

import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class SendRequestController {

    RestOperations restOperations = new RestTemplate();

    @GetMapping("/sendFail")
    public String calculatePrices() {
        URI encodedUri = UriComponentsBuilder.fromUriString("http://localhost:8080/testFail")
                .path("/testFail")
                .build()
                .encode()
                .toUri();
        restOperations.postForObject(
                encodedUri,
                SendFail.builder().random("1").random2("2"),
                SendFail.class);
        return "hello";
    }
}
