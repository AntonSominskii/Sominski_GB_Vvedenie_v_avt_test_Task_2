package org.max.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComponentPatternTest extends AbstractComponentTest {

    @Test
    void onePortfolioTest() {
        // Использование общей инициализации из AbstractComponentTest
        portfolio.add(new Account(100L));
        portfolio.add(new Account(200L));
        portfolio.add(new Account(300L));

        Long result = portfolio.getSum();

        Assertions.assertEquals(600L, result);
    }

    @Test
    void complexPortfolioTest() {
        Portfolio portfolioNextLevelOne = new Portfolio();
        Portfolio portfolioNextLevelTwo = new Portfolio();

        portfolio.add(portfolioNextLevelOne);
        portfolio.add(portfolioNextLevelTwo);

        portfolioNextLevelOne.add(new Account(100L));
        portfolioNextLevelOne.add(new Account(200L));
        portfolioNextLevelOne.add(new Account(300L));

        portfolioNextLevelTwo.add(new Account(100L));
        portfolioNextLevelTwo.add(new Account(200L));
        portfolioNextLevelTwo.add(new Account(300L));

        Long result = portfolio.getSum();

        Assertions.assertEquals(1200L, result);
    }
}