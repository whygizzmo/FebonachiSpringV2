package kg.itschoolmegacom.febonaciNumberV2.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FebonConrotller {

    @RequestMapping("/febonaci")
    public List<String> FibonaciNums(
            @RequestParam (required = false,defaultValue = "100") int fiboNumber) throws JsonProcessingException {
        int i = 0;
        int j = 1;

        List<String> fibonacResult = new ArrayList<>();
        fibonacResult.add(i + "->" + j);

        while (i < fiboNumber || j < fiboNumber) {
            i += j;
            if (i>fiboNumber){
                return fibonacResult;
            }
            fibonacResult.add("->" + i);
            j += i;
            if (j>fiboNumber){
                return fibonacResult;
            }
            fibonacResult.add("->" + j);

        }

        return fibonacResult;
    }
}
