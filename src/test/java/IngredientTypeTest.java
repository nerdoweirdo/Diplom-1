import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.*;

public class IngredientTypeTest {
    public IngredientType[] ingredients = IngredientType.values();

    @Test
    public void correctLengthTest() {
        assertEquals(2, ingredients.length);
    }

    @Test
    public void incorrectLengthTest() {
        assertNotEquals(3, ingredients.length);
    }

    @Test
    public void ingredientsTypeTest() {
        for (IngredientType ingredient : ingredients) {
            switch (ingredient) {
                case SAUCE:
                    assertTrue(true);
                case FILLING:
                    assertTrue(true);
                    break;
            }
        }
    }
}