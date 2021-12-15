package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

import static racingcar.model.Constants.*;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현
    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public void race() {
        int diceEyes = Randoms.pickNumberInRange(DICE_START_INCLUSIVE, DICE_END_INCLUSIVE);
        if (diceEyes >= 4) {
            this.position++;
        }
    }
}