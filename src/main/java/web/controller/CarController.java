package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String showAllListCars(Model model) {
        model.addAttribute("cars", carService.showAllListCars());

        return "allListCars";
    }

    @GetMapping(path = "", params = "count")
    public String showPartListCars(@RequestParam("count") int count, Model model) {
        model.addAttribute("partCars", carService.showPartListCars(count));

        return "partListCars";
    }
}
