package com.example.reseepe;



import jakarta.persistence.*;

// Recipe.java
@Entity

public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "recipe_id")
    private Long id;

    @Column(name = "recipe_name")
    private String recipeName;

    @Column(name = "ingredients")
    private String ingredients;

    @Column(name = "recipe_steps")
    private String recipeSteps;
    //getter and setter


    public Recipe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getRecipeSteps() {
        return recipeSteps;
    }

    public void setRecipeSteps(String recipeSteps) {
        this.recipeSteps = recipeSteps;
    }

    public Recipe(Long id, String recipeName, String ingredients, String recipeSteps) {
        this.id = id;
        this.recipeName = recipeName;
        this.ingredients = ingredients;
        this.recipeSteps = recipeSteps;
    }
}