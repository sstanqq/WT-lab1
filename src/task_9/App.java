package task_9;

import task_9.model.Ball;
import task_9.service.BasketService;

public class App {
//    Точка входа
    public static void main(String[] args) {
        Ball firstBall = new Ball(1.1, BasketService.BLUE);
        Ball secondBall = new Ball(1.3, BasketService.BLUE);
        Ball thirdBall = new Ball(2, BasketService.RED);

        BasketService basketService = new BasketService();
        basketService.addBall(firstBall);
        basketService.addBall(secondBall);
        basketService.addBall(thirdBall);

        System.out.println("Count of the blue balls: " + basketService.getCountOfBlueBalls());
        System.out.println("Weight: " + basketService.getSumWeight());
    }
}
