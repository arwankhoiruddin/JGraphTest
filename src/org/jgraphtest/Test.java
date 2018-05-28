package org.jgraphtest;

public class Test {
    public static void main(String[] args) {

    }
}

class ScramButton implements TestComponent {

    @Override
    public void doSomething() {
        System.out.println("this will run the button");
    }
}

class Text implements TestComponent {

    @Override
    public void doSomething() {
        System.out.println("this will type something");
    }
}