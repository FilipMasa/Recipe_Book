package com.example.Recipe_Book.recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface RecipeRepository
        extends JpaRepository<Recipe, Long> {
    // SELECT * FROM recipe WHERE name =
    @Query("SELECT r FROM Recipe r WHERE r.name = ?1")
    Optional<Recipe> findRecipeByName(String name);
}
