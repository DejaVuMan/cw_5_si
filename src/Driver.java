public class Driver {

    public static void main(String[] args){
        SimplePerceptron perceptron = new SimplePerceptron();
        // Simple Perceptron - No bias or sigmoid function

        // Simulate Perceptron for x1 ^ !x2
        double inputs[][] = {{1,1},{1,0},{0,1},{0,0}};
        // True True -> False
        // True False -> True
        // False True -> False
        // False False -> False
        int outputs[] = {0,1,0,0}; // False True False False

        perceptron.Trainer(inputs, outputs, 0.2, 0.5, 200);

        System.out.println(perceptron.Output(new double[]{0,0}));

        // Classification Tree

    }

}
