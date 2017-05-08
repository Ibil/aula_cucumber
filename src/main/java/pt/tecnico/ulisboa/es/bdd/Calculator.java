package pt.tecnico.ulisboa.es.bdd;

public class Calculator {

    private int result;

    public void add(int arg1, int arg2) {
        result = arg1 + arg2;
    }

    public int getResult() {
        return result;
    }
}
