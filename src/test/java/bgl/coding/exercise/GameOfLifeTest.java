package bgl.coding.exercise;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GameOfLifeTest {
  @Test
  public void shouldRun() {
    GameOfLife game = new GameOfLife();
    Assert.assertEquals(1, game.run());
  }
}
