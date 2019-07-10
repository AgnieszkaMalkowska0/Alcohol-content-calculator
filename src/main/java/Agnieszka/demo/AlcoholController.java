package Agnieszka.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.management.modelmbean.ModelMBean;

/**
 * Created by Agnieszka on 10.07.2019.
 */
@Controller
public class AlcoholController {

    @GetMapping("/")
    public String home() {
        return "alcohol";
    }

    private AlcoholCounter alcoholCounter = new AlcoholCounter();
    @GetMapping("/result")
    public String getResult(
            @RequestParam Double quantity,
            @RequestParam Double weight,
            @RequestParam String  alcohol, ModelMap modelMap
    ) {
        Alcohol alcohol1 = Alcohol.valueOf(alcohol);
        System.out.println("WARTOSCI" +quantity + " " +weight + " " + alcohol);

        float result = alcoholCounter.calculatePerMil(quantity*1000, weight, true , alcohol1);
        String resultString = String.format("%.2f", result);
        modelMap.put("result", resultString);

        return "result"; //tempates
    }



}