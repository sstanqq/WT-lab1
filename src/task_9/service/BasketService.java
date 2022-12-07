package task_9.service;

import task_9.model.Ball;
import task_9.model.Basket;

public class BasketService {
    public final static String BLUE = "blue";
    public final static String RED = "red";

    private Basket basket;

    public BasketService() {
        basket = new Basket();
    }

    public void addBall(Ball ball) {
        basket.getBalls().add(ball);
    }

    public long getCountOfBlueBalls() {
        return basket.getBalls().stream().filter(ball -> ball.getColor().equals(BLUE)).count();
    }

    public double getSumWeight() {
        return basket.getBalls().stream()
                .mapToDouble(Ball::getWeight)
                .sum();
    }
}
