package mk.ukim.finki.emtlab2.web.rest;

import mk.ukim.finki.emtlab2.model.enumerations.Category;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/categories")
public class CategoryRestController {
    @GetMapping
    public Category[] findAll() {
        return Category.values();
    }
}
