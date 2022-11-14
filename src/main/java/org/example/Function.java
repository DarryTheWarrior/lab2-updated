package org.example;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Interface class with mathematics functions
 */
public interface Function {

    double apply(ArrayList<Double> args);

    public static HashMap<String, Function> getFunctionMap() {
        HashMap<String, Function> functionTable = new HashMap<>();
        functionTable.put("min", args -> {
            if (args.isEmpty()) {
                throw new RuntimeException("No arguments for function min");
            }
            double min = args.get(0);
            for (Double val : args) {
                if (val < min) {
                    min = val;
                }
            }
            return min;
        });
        functionTable.put("pow", args -> {
            if (args.size() != 2) {
                throw new RuntimeException("Wrong argument count for function pow: " + args.size());
            }
            return (double) Math.pow(args.get(0), args.get(1));
        });
        functionTable.put("avg", args -> {
            double sum = 0;
            for (int i = 0; i < args.size(); i++) {
                sum += args.get(i);
            }
            return sum / args.size();
        });
        functionTable.put("sqrt", args -> {
            if (args.size() != 1) {
                throw new RuntimeException("Wrong argument count for function sqrt: " + args.size());
            }
            return (double) Math.sqrt(args.get(0));
        });
        functionTable.put("abs", args -> {
            if (args.size() != 1) {
                throw new RuntimeException("Wrong argument count for function abs: " + args.size());
            }
            return (double) Math.abs(args.get(0));
        });
        functionTable.put("cos", args -> {
            if (args.size() != 1) {
                throw new RuntimeException("Wrong argument count for function abs: " + args.size());
            }
            return (double) Math.cos(args.get(0));
        });
        functionTable.put("sin", args -> {
            if (args.size() != 1) {
                throw new RuntimeException("Wrong argument count for function sin: " + args.size());
            }
            return (double) Math.sin(args.get(0));
        });
        functionTable.put("tan", args -> {
            if (args.size() != 1) {
                throw new RuntimeException("Wrong argument count for function tan: " + args.size());
            }
            return (double) Math.tan(args.get(0));
        });

        return functionTable;
    }
}
