package com.example.reseepe;


import org.springframework.data.repository.CrudRepository;


import java.util.List;




public interface RecipeRepository extends CrudRepository<Recipe, Long> {


    List<Recipe> findByRecipeNameContainingIgnoreCaseAndIngredientsContainingIgnoreCaseAndRecipeStepsContainingIgnoreCase(String query, String query1, String query2);

}