import org.example.Randoms;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class RandomsTest {
    @Test
    public void testRandoms() {
        Randoms randoms = new Randoms(1, 10);
        Set<Integer> set = new HashSet<>();
        for (int r : randoms) {
            Assertions.assertTrue(r >= 1 && r <= 10, "Число не входит в заданный диапазон");
            set.add(r);
            if (set.size() == 10) {
                break;
            }
        }
        Assertions.assertEquals(10, set.size(), "Количество уникальных чисел не равно 10");
    }
}

