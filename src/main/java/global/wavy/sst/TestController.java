package global.wavy.sst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class TestController {

    @GetMapping("/ping")
    public String getPing() {
        return "Spring Security Test - " + Instant.now();
    }

    @GetMapping(value = "/status", produces = "application/json")
    public String getStatus(@RequestParam(required = false) Long parentId,
                            @RequestParam(required = false) Long customerId,
                            @RequestParam(required = false) Long subAccountId) {
        return "{ \"parentId\": " + parentId + "," +
                " \"customerId\": " + customerId + "," +
                " \"subAccountId\": " + subAccountId + "," +
                " \"quota\": 10000," +
                " \"count\": 10020," +
                " \"limitReached\": true," +
                " \"blocked\": false }";
    }

}
