/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Campo5;

/**
 *
 * @author gerardo
 */
public class Counter {

    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value += 1;
    }

    public void decrease() {
        this.value -= 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {

        } else {
            this.value += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            this.value -= decreaseBy;
        }
    }

    @Override
    public String toString() {
        return "" + this.value;
    }

}
