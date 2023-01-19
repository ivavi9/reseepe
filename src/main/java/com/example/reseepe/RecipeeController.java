package com.example.reseepe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
@RequestMapping("/api")
public class RecipeeController {

    private RecipeRepository recipeRepository;

    public RecipeeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping("/random")
    public Optional<Recipe> getRandomRecipe() {
        long totalRecipes = recipeRepository.count();
        long randomIndex = new Random().nextLong(totalRecipes);
//        System.out.println(randomIndex);
        return recipeRepository.findById(Math.max(randomIndex,1));
    }

    @GetMapping("/query")
    public List<Recipe> getRecipesByQuery(@RequestParam("query") String query) {
        List<Recipe> recipes = recipeRepository.findByRecipeNameContainingIgnoreCaseAndIngredientsContainingIgnoreCaseAndRecipeStepsContainingIgnoreCase(query, query, query);
        if(recipes.isEmpty()){
            return new ArrayList<>();
        }
        return recipes;
    }



}
