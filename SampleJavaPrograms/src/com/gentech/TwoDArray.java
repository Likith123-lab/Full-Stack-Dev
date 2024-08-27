package com.gentech;
class ConcatenateString {
    void Concatenate(String[][] employee) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < employee.length; i++) {
            for (int j = 0; j < employee[i].length; j++) {
                res.append(employee[i][j]).append(" ");
            }
        }
        System.out.println("Concatenated result: " + res.toString());
    }
}

public class TwoDArray {
    public static void main(String [] args) {
        String [][] Employee = new String[][]{{"one", "two","three"},{"four","five","six"}};
            ConcatenateString o1=new ConcatenateString();
            o1.Concatenate(Employee);
    }
}
