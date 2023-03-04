package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    private static final Car[] carsArr = new Car[]{
            new Car(2000,"car1","model1"),
            new Car(2001,"car2","model2"),
            new Car(2002,"car3","model3"),
            new Car(2003,"car4","model4"),
            new Car(2004,"car5","model5")
    };
    @GetMapping("/Cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, Model model) {
        List<Car> Cars = new ArrayList<>();
        for(int i=0;i<count;i++){
            if(i==carsArr.length){
                break;
            }
            Cars.add(carsArr[i]);
        }
        model.addAttribute("cars", Cars);
        return "Cars";
    }
}

