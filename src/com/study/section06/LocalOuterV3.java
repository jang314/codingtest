package com.study.section06;

public class LocalOuterV3 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVal = 1;
        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVal = " + localVal);
                System.out.println("paramVal = " + paramVar);
                System.out.println("outInstanceVal = " + outInstanceVar);
            }

        }
        Printer printer = new LocalPrinter();
        printer.print();;
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        printer.print();
    }
}
