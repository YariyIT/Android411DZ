package DZ027;

import java.nio.channels.spi.AbstractInterruptibleChannel;

public enum Speed {
    CAR(65),
    TRUCK(55),
    AIRPLANE(600),
    TRAIN(70),
    BOAT(22);

    int speed;

    Speed(int speed) {
        this.speed = speed;
    }
}
